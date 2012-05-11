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
package br.uff.midiacom.ana.node;

import br.uff.midiacom.ana.NCLElement;
import br.uff.midiacom.ana.NCLElementImpl;
import br.uff.midiacom.ana.NCLHead;
import br.uff.midiacom.ana.NCLIdentifiableElement;
import br.uff.midiacom.ana.datatype.ncl.NCLParsingException;
import br.uff.midiacom.ana.datatype.aux.reference.NodeReference;
import br.uff.midiacom.ana.datatype.aux.reference.RuleReference;
import br.uff.midiacom.ana.datatype.enums.NCLElementAttributes;
import br.uff.midiacom.ana.datatype.ncl.node.NCLSwitchBindRulePrototype;
import br.uff.midiacom.ana.rule.NCLRuleBase;
import br.uff.midiacom.ana.rule.NCLTestRule;
import br.uff.midiacom.xml.XMLException;
import org.w3c.dom.Element;


public class NCLSwitchBindRule<T extends NCLSwitchBindRule,
                               P extends NCLElement,
                               I extends NCLElementImpl,
                               En extends NodeReference,
                               Er extends RuleReference>
        extends NCLSwitchBindRulePrototype<T, P, I, En, Er>
        implements NCLElement<T, P> {


    public NCLSwitchBindRule() throws XMLException {
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

        content = space + "<bindRule";
        content += parseAttributes();
        content += "/>\n";


        return content;
    }


    public void load(Element element) throws NCLParsingException {
        String att_name, att_var;

        try{
            loadConstituent(element);
            loadRule(element);
        }
        catch(XMLException ex){
            throw new NCLParsingException("BindRule:\n" + ex.getMessage());
        }
    }
    
    
    protected String parseAttributes() {
        String content = "";
        
        content += parseConstituent();
        content += parseRule();
        
        return content;
    }
    
    
    protected String parseRule() {
        Er aux = getRule();
        if(aux != null)
            return " rule='" + aux.parse() + "'";
        else
            return "";
    }
    
    
    protected void loadRule(Element element) throws XMLException {
        String att_name, att_var;
        
        // set the rule (required)
        att_name = NCLElementAttributes.RULE.toString();
        if(!(att_var = element.getAttribute(att_name)).isEmpty()){
            NCLTestRule rul = (NCLTestRule) ((NCLRuleBase) ((NCLHead) impl.getDoc().getHead()).getRuleBase()).findRule(att_var);
            setRule(createRuleRef(rul));
        }
        else
            throw new NCLParsingException("Could not find " + att_name + " attribute.");
    }
    
    
    protected String parseConstituent() {
        En aux = getConstituent();
        if(aux != null)
            return " constituent='" + aux.parse() + "'";
        else
            return "";
    }
    
    
    protected void loadConstituent(Element element) throws XMLException {
        String att_name, att_var;
        
        // set the constituint (required)
        att_name = NCLElementAttributes.CONSTITUENT.toString();
        if(!(att_var = element.getAttribute(att_name)).isEmpty()){
            P aux;
            if((aux = (P) getParent()) == null)
                throw new NCLParsingException("Could not find element " + att_var);

            NCLNode refEl = (NCLNode) ((NCLNode) aux).findNode(att_var);
            if(refEl == null)
                throw new NCLParsingException("Could not find element " + att_var);

            setConstituent(createNodeRef(refEl));
        }
        else
            throw new NCLParsingException("Could not find " + att_name + " attribute.");
    }


    /**
     * Function to create a reference to a node.
     * This function must be overwritten in classes that extends this one.
     *
     * @return
     *          element representing a reference to a node.
     */
    protected En createNodeRef(NCLNode ref) throws XMLException {
        return (En) new NodeReference(ref, NCLElementAttributes.ID);
    }


    /**
     * Function to create a reference to a rule.
     * This function must be overwritten in classes that extends this one.
     *
     * @return
     *          element representing a reference to a rule.
     */
    protected Er createRuleRef(NCLTestRule ref) throws XMLException {
        return (Er) new RuleReference(ref, NCLElementAttributes.ID);
    }
}
