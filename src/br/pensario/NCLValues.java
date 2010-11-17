package br.pensario;

public abstract class NCLValues {


    /**
     * NCL Namespace Values
     */
    public enum NCLNamespace {
        
        EDTV("http://www.ncl.org.br/NCL3.0/profiles/NCL30EDTV.xsd"),
        BDTV("http://www.ncl.org.br/NCL3.0/profiles/NCL30BDTV.xsd"),
        CAUSAL_CONNECTOR("http://www.ncl.org.br/NCL3.0/profiles/NCL30CausalConnector.xsd");


        private String name;
        private NCLNamespace(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Logical operators
     */
    public enum NCLOperator {
        
        AND("and"),
        OR("or");
        
        
        private String name;
        private NCLOperator(String name) { this.name = name;}
        public String toString() { return name; }
    }


    /**
     * NCL logical comparators
     */
    public enum NCLComparator {
        
        EQ("eq"),
        NE("ne"),
        GT("gt"),
        LT("lt"),
        GTE("gte"),
        LTE("lte");
        
        
        private String name;
        private NCLComparator(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Colors
     */
    public enum NCLColor {
        
        GRAY("gray"),
        WHITE("white"),
        BLACK("black"),
        SILVER("silver"),
        RED("red"),
        MAROON("maroon"),
        FUCHSIA("fuchsia"),
        PURPLE("purple"),
        LIME("lime"),
        GREEN("green"),
        YELLOW("yellow"),
        OLIVE("olive"),
        BLUE("blue"),
        NAVY("navy"),
        AQUA("aqua"),
        TEAL("teal");
        
        
        private String name;
        private NCLColor(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL CompoundCondition Operator
     */
    public enum NCLConditionOperator {
        
        AND("and"),
        OR("or");
        
        
        private String name;
        private NCLConditionOperator(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL CompoundAction Operator
     */
    public enum NCLActionOperator {
        
        PAR("par"),
        SEQ("seq");
        
        
        private String name;
        private NCLActionOperator(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL media Mime Type
     */
    public enum NCLMimeType {
        
        TEXT_HTML("text/html"),
        TEXT_PLAIN("text/plain"),
        TEXT_CSS("text/css"),
        TEXT_XML("text/xml"),
        IMAGE_BMP("image/bmp"),
        IMAGE_PNG("image/png"),
        IMAGE_GIF("image/gif"),
        IMAGE_JPEG("image/jpeg"),
        AUDIO_BASIC("audio/basic"),
        AUDIO_MP3("audio/mp3"),
        AUDIO_MP2("audio/mp2"),
        AUDIO_MPEG("audio/mpeg"),
        AUDIO_MPEG4("audio/mpeg4"),
        VIDEO_MPEG("video/mpeg"),
        APPLICATION_X_GINGA_NCL("application/x-ginga-NCL"),
        APPLICATION_X_GINGA_NCLUA("application/x-ginga-NCLua"),
        APPLICATION_X_GINGA_NCLET("application/x-ginga-NCLet"),
        APPLICATION_X_GINGA_SETTINGS("application/x-ginga-settings"),
        APPLICATION_X_GINGA_TIME("application/x-ginga-time");
        
        
        private String name;
        private NCLMimeType(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL System Variables name. Simple variables only
     */
    public enum NCLSystemVariable {

        SYSTEM_LANGUAGE("system.language"),
        SYSTEM_CAPTION("system.caption"),
        SYSTEM_SUBTITLE("system.subtitle"),
        SYSTEM_SCREENSIZE("system.screenSize"),
        SYSTEM_SCREENGRAPHICSIZE("system.screenGraphicSize"),
        SYSTEM_AUDIOTYPE("system.audioType"),
        SYSTEM_CLASSNUMBER("system.classNumber"),
        SYSTEM_CPU("system.CPU"),
        SYSTEM_MEMORY("system.memory"),
        SYSTEM_OPERATINGSYSTEM("system.operatingSystem"),
        SYSTEM_JAVACONFIGURATION("system.javaConfiguration"),
        SYSTEM_JAVAPROFILE("system.javaProfile"),
        SYSTEM_LUAVERSION("system.luaVersion"),
        
        
        DEFAULT_FOCUSBORDERCOLOR("default.focusBorderColor"),
        DEFAULT_SELBORDERCOLOR("default.selBorderColor"),
        DEFAULT_FOCUSBORDERWIDTH("default.focusBorderWidth"),
        DEFAULT_FOCUSBORDERTRANSPARENCY("default.focusBorderTransparency"),
        
        
        SERVICE_CURRENTFOCUS("service.currentFocus"),
        SERVICE_CURRENTKEYMASTER("service.currentKeyMaster"),
        
        
        SI_NUMBEROFSERVICES("si.numberOfServices"),
        SI_NUMBEROFPARTIALSERVICES("si.numberOfPartialServices"),
        SI_CHANNELNUMBER("si.channelNumber"),
        
        
        CHANNEL_KEYCAPTURE("channel.keyCapture"),
        CHANNEL_VIRTUALKEYBOARD("channel.virtualKeyboard"),
        CHANNEL_KEYBOARDBOUNDS("channel.keyboardBounds");

        
        private String name;
        private NCLSystemVariable(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL System Variables name
     */
    public enum NCLArgSystemVariable {

        SYSTEM_RETURNBITRATE_i("system.returnBitRate(i)"),
        SYSTEM_SCREENSIZE_i("system.screenSize(i)"),
        SYSTEM_SCREENGRAPHICSIZE_i("system.screenGraphicSize(i)"),
        SYSTEM_AUDIOTYPE_i("system.audioType(i)"),
        SYSTEM_DEVNUMBER_i("system.devNumber(i)"),
        SYSTEM_CLASSTYPE_i("system.classType(i)"),
        SYSTEM_INFO_i("system.info(i)");

        
        private String name;
        private NCLArgSystemVariable(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Area Sample type
     */
    public enum NCLSampleType {

    S, F, NPT
    }

    
    /**
     * NCL Default roles for simple conditions
     */
    public enum NCLDefaultConditionRole {
        
        ONBEGIN("onBegin"),
        ONEND("onEnd"),
        ONABORT("onAbort"),
        ONPAUSE("onPause"),
        ONRESUME("onResume"),
        ONSELECTION("onSelection"),
        ONBEGINATTRIBUTION("onBeginAttribution"),
        ONENDATTRIBUTION("onEndAttribution");
        
        
        private String name;
        private NCLDefaultConditionRole(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Default roles for simple actions
     */
    public enum NCLDefaultActionRole {
        
        START("start"),
        STOP("stop"),
        ABORT("abort"),
        PAUSE("pause"),
        RESUME("resume"),
        SET("set");
        
        
        private String name;
        private NCLDefaultActionRole(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
    * NCL URIs
    */
    public enum NCLUriType {

        FILE("file://"),
        HTTP("http://"),
        HTTPS("https://"),
        RSTP("rstp://"),
        RTP("rtp://"),
        NCLMIRROR("nclmirror://"),
        SBTVD_TS("sbtvd-ts://");
        
        
        private String name;
        private NCLUriType(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Keys
     */
    public enum NCLKey {

        KEY_0("0"),
        KEY_1("1"),
        KEY_2("2"),
        KEY_3("3"),
        KEY_4("4"),
        KEY_5("5"),
        KEY_6("6"),
        KEY_7("7"),
        KEY_8("8"),
        KEY_9("9"),
        KEY_A("A"),
        KEY_B("B"),
        KEY_C("C"),
        KEY_D("D"),
        KEY_E("E"),
        KEY_F("F"),
        KEY_G("G"),
        KEY_H("H"),
        KEY_I("I"),
        KEY_J("J"),
        KEY_K("K"),
        KEY_L("L"),
        KEY_M("M"),
        KEY_N("N"),
        KEY_O("O"),
        KEY_P("P"),
        KEY_Q("Q"),
        KEY_R("R"),
        KEY_S("S"),
        KEY_T("T"),
        KEY_U("U"),
        KEY_V("V"),
        KEY_W("W"),
        KEY_X("X"),
        KEY_Y("Y"),
        KEY_Z("Z"),
        KEY_AST("*"),
        KEY_TRALHA("#"),
        MENU("MENU"),
        INFO("INFO"),
        GUIDE("GUIDE"),
        DOWN("CURSOR_DOWN"),
        UP("CURSOR_UP"),
        LEFT("CURSOR_LEFT"),
        RIGHT("CURSOR_RIGHT"),
        CHANNEL_DOWN("CHANNEL_DOWN"),
        CHANNEL_UP("CHANNEL_UP"),
        VOLUME_DOWN("VOLUME_DOWN"),
        VOLUME_UP("VOLUME_UP"),
        ENTER("ENTER"),
        BLUE("BLUE"),
        RED("RED"),
        GREEN("GREEN"),
        YELLOW("YELLOW"),
        BACK("BACK"),
        EXIT("EXIT"),
        POWER("POWER"),
        REWIND("REWIND"),
        STOP("STOP"),
        EJECT("EJECT"),
        PLAY("PLAY"),
        RECORD("RECORD"),
        PAUSE("PAUSE");
        
        
        private String name;
        private NCLKey(String name) { this.name = name;}
        public String toString() { return name; }
    }


    /**
     * NCL Event types used in connectors
     */
    public enum NCLEventType {

        PRESENTATION("presentation"),
        SELECTION("selection"),
        ATTRIBUTION("attribution");


        private String name;
        private NCLEventType(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL Event transitions used in connectors
     */
    public enum NCLEventTransition {

        STARTS("starts"),
        STOPS("stops"),
        ABORTS("aborts"),
        PAUSES("pauses"),
        RESUMES("resumes");


        private String name;
        private NCLEventTransition(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL Event actions used in connectors
     */
    public enum NCLEventAction {

        START("start"),
        STOP("stop"),
        ABORT("abort"),
        PAUSE("pause"),
        RESUME("resume");


        private String name;
        private NCLEventAction(String name) { this.name = name;}
        public String toString() { return name; }
    }

    
    /**
     * NCL Assessment Statement Attribute values
     */
    public enum NCLAttributeType {

        STATE("state"),
        OCCURRENCES("occurrences"),
        REPETITIONS("repetitions"),
        NODE_PROPERTY("nodeProperty");


        private String name;
        private NCLAttributeType(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL Value Assessment default values
     */
    public enum NCLDefaultValueAssessment {

        SLEEPING("sleeping"),
        OCCURRING("occurring"),
        PAUSED("paused");


        private String name;
        private NCLDefaultValueAssessment(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL reuse feature instance type.
     */
    public enum NCLInstanceType {
        
        NEW("new"),
        INST_SAME("instSame"),
        GRAD_SAME("gradSame");


        private String name;
        private NCLInstanceType(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL transition type.
     */
    public enum NCLTransitionType {
        
        BAR("barWipe"),
        IRIS("irisWipe"),
        CLOCK("clockWipe"),
        SNAKE("snakeWipe"),
        FADE("fade");


        private String name;
        private NCLTransitionType(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL transition subtype.
     */
    public enum NCLTransitionSubtype {
        
        LEFT_TO_RIGHT("leftToRight"),
        TOP_TO_BOTTOM("topToBottom"),
        
        RECTANGLE("rectangle"),
        DIAMOND("diamond"),
        
        CLOCKWISE_TWELVE("clockwiseTwelve"),
        CLOCKWISE_THREE("clockwiseThree"),
        CLOCKWISE_SIX("clockwiseSix"),
        CLOCKWISE_NINE("clockwiseNine"),
        
        TOP_LEFT_HORIZONTAL("topLeftHorizontal"),
        TOP_LEFT_VERTICAL("topLeftVertical"),
        TOP_LEFT_DIAGONAL("topLeftDiagonal"),
        TOP_RIGHT_DIAGONAL("topRightDiagonal"),
        BOTTOM_RIGHT_DIAGONAL("bottomRightDiagonal"),
        BOTTOM_LEFT_DIAGONAL("bottomLeftDiagonal"),
        
        CROSSFADE("crossfade"),
        FADE_TO_COLOR("fadeToColor"),
        FADE_FROM_COLOR("fadeFromColor");


        private String name;
        private NCLTransitionSubtype(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL transition type.
     */
    public enum NCLTransitionDirection {
        
        FORWARD("forward"),
        REVERSE("reverse");


        private String name;
        private NCLTransitionDirection(String name) { this.name = name;}
        public String toString() { return name; }
    }
    
    
    /**
     * NCL Attributes used in the descriptor parameters
     */
    public enum NCLAttributes {

        TOP("top"),
        LEFT("left"),
        BOTTOM("bottom"),
        RIGHT("right"),
        WIDTH("width"),
        HEIGHT("height"),
        LOCATION("location"),
        SIZE("size"),
        BOUNDS("bounds"),
        BACKGROUND("background"),
        VISIBLE("visible"),
        TRANSPARENCY("transparency"),
        FIT("fit"),
        SCROLL("scroll"),
        STYLE("style"),
        SOUND_LEVEL("soundLevel"),
        BALANCE_LEVEL("balanceLevel"),
        TREBLE_LEVEL("trebleLevel"),
        BASS_LEVEL("bassLevel"),
        ZINDEX("zIndex"),
        FONT_FAMILY("fontFamily"),
        FONT_STYLE("fontStyle"),
        FONT_SIZE("fontSize"),
        FONT_VARIANT("fontVariant"),
        FONT_WEIGHT("fontWeight"),
        FONT_COLOR("fontColor"),
        REUSE_PLAYER("reusePlayer"),
        PLAYER_LIFE("playerLife");


        private String name;
        private NCLAttributes(String name) { this.name = name;}
        public String toString() { return name; }
    }
}