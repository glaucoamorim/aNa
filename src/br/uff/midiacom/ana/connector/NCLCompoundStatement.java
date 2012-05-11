/********************************************************************************
 * This file is part of the API for NCL Authoring - aNa.
 *
 * Copyright (c) 2011, MidiaCom Lab (www.midiacom.uff.br)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * All advertising materials mentioning features or use of this software must
 *    display the following acknowledgment:
 *        This product includes the API for NCL Authoring - aNa
 *        (http://joeldossantos.github.com/aNa).
 *
 *  * Neither the name of the lab nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without specific
 *    prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY MIDIACOM LAB AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE MÍDIACOM LAB OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *******************************************************************************/
package br.uff.midiacom.ana.connector;

import br.uff.midiacom.ana.NCLElement;
import br.uff.midiacom.ana.NCLElementImpl;
import br.uff.midiacom.ana.NCLIdentifiableElement;
import br.uff.midiacom.ana.datatype.ncl.NCLParsingException;
import br.uff.midiacom.ana.datatype.enums.NCLElementAttributes;
import br.uff.midiacom.ana.datatype.enums.NCLOperator;
import br.uff.midiacom.ana.datatype.ncl.connector.NCLCompoundStatementPrototype;
import br.uff.midiacom.xml.XMLException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class NCLCompoundStatement<T extends NCLCompoundStatement,
                                  P extends NCLElement,
                                  I extends NCLElementImpl,
                                  Es extends NCLStatement,
                                  Er extends NCLRole>
        extends NCLCompoundStatementPrototype<T, P, I, Es>
        implements NCLStatement<Es, P, Er> {


    public NCLCompoundStatement() throws XMLException {
        super();
    }


    @Override
    protected void createImpl() throws XMLException {
        impl = (I) new NCLElementImpl<NCLIdentifiableElement, P>(this);
    }
    
    
    public String parse(int ident) {
        String space, content;

        if(ident < 0)
            ident = 0;

        // Element indentation
        space = "";
        for(int i = 0; i < ident; i++)
            space += "\t";

        content = space + "<compoundStatement";
        content += parseAttributes();
        content += ">\n";

        content += parseElements(ident + 1);

        content += space + "</compoundStatement>\n";

        return content;
    }


    public void load(Element element) throws NCLParsingException {
        String att_name, att_var;
        NodeList nl;

        try{
            loadOperator(element);
            loadIsNegated(element);
        }
        catch(XMLException ex){
            throw new NCLParsingException("CompoundStatement:\n" + ex.getMessage());
        }

        try{
            // create the child nodes
            nl = element.getChildNodes();
            for(int i=0; i < nl.getLength(); i++){
                Node nd = nl.item(i);
                if(nd instanceof Element){
                    Element el = (Element) nl.item(i);

                    loadAssessmentStatements(el);
                    loadCompoundStatements(el);
                }
            }
        }
        catch(XMLException ex){
            throw new NCLParsingException("CompoundStatement > " + ex.getMessage());
        }
    }
    
    
    protected String parseAttributes() {
        String content = "";
        
        content += parseOperator();
        content += parseIsNegated();
        
        return content;
    }
    
    
    protected String parseElements(int ident) {
        String content = "";
        
        content += parseStatements(ident);
        
        return content;
    }
    
    
    protected String parseOperator() {
        NCLOperator aux = getOperator();
        if(aux != null)
            return " operator='" + aux.toString() + "'";
        else
            return "";
    }
    
    
    protected void loadOperator(Element element) throws XMLException {
        String att_name, att_var;
        
        // set the operator (required)
        att_name = NCLElementAttributes.OPERATOR.toString();
        if(!(att_var = element.getAttribute(att_name)).isEmpty())
            setOperator(NCLOperator.getEnumType(att_var));
        else
            throw new NCLParsingException("Could not find " + att_name + " attribute.");
    }
    
    
    protected String parseIsNegated() {
        Boolean aux = getIsNegated();
        if(aux != null)
            return " isNegated='" + aux.toString() + "'";
        else
            return "";
    }
    
    
    protected void loadIsNegated(Element element) throws XMLException {
        String att_name, att_var;
        
        // set the isNegated (optional)
        att_name = NCLElementAttributes.ISNEGATED.toString();
        if(!(att_var = element.getAttribute(att_name)).isEmpty())
            setIsNegated(Boolean.valueOf(att_var));
    }
    
    
    protected String parseStatements(int ident) {
        if(!hasStatement())
            return "";
        
        String content = "";
        for(Es aux : statements)
            content += aux.parse(ident);
        
        return content;
    }
    
    
    protected void loadAssessmentStatements(Element element) throws XMLException {
        //create the assessmentStatement
        if(element.getTagName().equals(NCLElementAttributes.ASSESSMENTSTATEMENT.toString())){
            Es inst = createAssessmentStatement();
            addStatement(inst);
            inst.load(element);
        }
    }
    
    
    protected void loadCompoundStatements(Element element) throws XMLException {
        // create the compoundStatement
        if(element.getTagName().equals(NCLElementAttributes.COMPOUNDSTATEMENT.toString())){
            Es inst = createCompoundStatement();
            addStatement(inst);
            inst.load(element);
        }
    }
    
    
    public Er findRole(String name) {
        Er result;
        
        for(Es statement : statements){
            result = (Er) statement.findRole(name);
            if(result != null)
                return result;
        }
        
        return null;
    }


    /**
     * Function to create the child element <i>assessmentStatement</i>.
     * This function must be overwritten in classes that extends this one.
     *
     * @return
     *          element representing the child <i>assessmentStatement</i>.
     */
    protected Es createAssessmentStatement() throws XMLException {
        return (Es) new NCLAssessmentStatement();
    }


    /**
     * Function to create the child element <i>compoundStatement</i>.
     * This function must be overwritten in classes that extends this one.
     *
     * @return
     *          element representing the child <i>compoundStatement</i>.
     */
    protected Es createCompoundStatement() throws XMLException {
        return (Es) new NCLCompoundStatement();
    }
}
