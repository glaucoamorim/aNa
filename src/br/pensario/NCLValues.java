package br.pensario;

public abstract class NCLValues {

	public enum NCLNamespace {
		EDTV {
			public String toString() {
				return "http://www.ncl.org.br/NCL3.0/profiles/NCL30EDTV.xsd";
			}
		},
		BDTV {
			public String toString() {
				return "http://www.ncl.org.br/NCL3.0/profiles/NCL30BDTV.xsd";
			}
		},
		CAUSAL_CONNECTOR {
			public String toString() {
				return "http://www.ncl.org.br/NCL3.0/profiles/NCL30CausalConnector.xsd";
			}
		}

	}

	public enum NCLColor {
		gray, white, black, silver, red, maroon, fuchsia, purple, lime, green, yellow, olive, blue, navy, aqua, teal
	}

	// DUVIDA - este cara some?

	public enum NCLQualifiers {
		PAR {
			public String toString() {
				return ("par");
			}
		},
		SEQ {
			public String toString() {
				return ("seq");
			}
		},
		AND {
			public String toString() {
				return ("and");
			}
		},
		OR {
			public String toString() {
				return ("or");
			}
		}
	}

	public enum NCLConditionOperator {
		AND {
			public String toString() {
				return ("and");
			}
		},
		OR {
			public String toString() {
				return ("or");
			}
		}
	}

	public enum NCLActionOperator {
		PAR {
			public String toString() {
				return ("par");
			}
		},
		SEQ {
			public String toString() {
				return ("seq");
			}
		}
	}

	public enum NCLMimeType {
		TEXT_HTML {
			public String toString() {
				return ("text/html");
			}
		},
		TEXT_PLAIN {
			public String toString() {
				return ("text/plain");
			}
		},
		TEXT_CSS {
			public String toString() {
				return ("text/css");
			}
		},
		TEXT_XML {
			public String toString() {
				return ("text/xml");
			}
		},
		IMAGE_BMP {
			public String toString() {
				return ("image/bmp");
			}
		},
		IMAGE_PNG {
			public String toString() {
				return ("image/png");
			}
		},
		IMAGE_GIF {
			public String toString() {
				return ("image/gif");
			}
		},
		IMAGE_JPEG {
			public String toString() {
				return ("image/jpeg");
			}
		},
		AUDIO_BASIC {
			public String toString() {
				return ("audio/basic");
			}
		},
		AUDIO_MP3 {
			public String toString() {
				return ("audio/mp3");
			}
		},
		AUDIO_MP2 {
			public String toString() {
				return ("audio/mp2");
			}
		},
		AUDIO_MPEG {
			public String toString() {
				return ("audio/mpeg");
			}
		},
		AUDIO_MPEG4 {
			public String toString() {
				return ("audio/mpeg4");
			}
		},
		VIDEO_MPEG {
			public String toString() {
				return ("video/mpeg");
			}
		},
		APPLICATION_X_GINGA_NCL {
			public String toString() {
				return ("application/x-ginga-NCL");
			}
		},
		APPLICATION_X_GINGA_NCLUA {
			public String toString() {
				return ("application/x-ginga-NCLua");
			}
		},
		APPLICATION_X_GINGA_NCLET {
			public String toString() {
				return ("application/x-ginga-NCLet");
			}
		},
		APPLICATION_X_GINGA_SETTINGS {
			public String toString() {
				return ("application/x-ginga-settings");
			}
		},
		APPLICATION_X_GINGA_TIME {
			public String toString() {
				return ("application/x-ginga-time");
			}
		}
	}

	public enum NCLSystemVariable {

		SYSTEM_LANGUAGE {
			public String toString() {
				return ("system.language");
			}
		},
		SYSTEM_CAPTION {
			public String toString() {
				return ("system.caption");
			}
		},
		SYSTEM_SUBTITLE {
			public String toString() {
				return ("system.subtitle");
			}
		},
		/*
		 * SYSTEM_RETURNBITRATE(i) { public String toString() {
		 * return("system.returnBitRate(i)"); } },
		 */
		SYSTEM_SCREENSIZE {
			public String toString() {
				return ("system.screenSize");
			}
		},
		SYSTEM_SCREENGRAPHICSIZE {
			public String toString() {
				return ("system.screenGraphicSize");
			}
		},
		SYSTEM_AUDIOTYPE {
			public String toString() {
				return ("system.audioType");
			}
		},
		/*
		 * SYSTEM_SCREENSIZE(i) { public String toString() {
		 * return("system.screenSize(i)"); } }, SYSTEM_SCREENGRAPHICSIZE(i) {
		 * public String toString() { return("system.screenGraphicSize(i)"); }
		 * }, SYSTEM_AUDIOTYPE(i) { public String toString() {
		 * return("system.audioType(i)"); } }, SYSTEM_DEVNUMBER(i) { public
		 * String toString() { return("system.devNumber(i)"); } },
		 * SYSTEM_CLASSTYPE(i) { public String toString() {
		 * return("system.classType(i)"); } }, SYSTEM_INFO(i) { public String
		 * toString() { return("system.info(i)"); } },
		 */
		SYSTEM_CLASSNUMBER {
			public String toString() {
				return ("system.classNumber");
			}
		},
		SYSTEM_CPU {
			public String toString() {
				return ("system.CPU");
			}
		},
		SYSTEM_MEMORY {
			public String toString() {
				return ("system.memory");
			}
		},
		SYSTEM_OPERATINGSYSTEM {
			public String toString() {
				return ("system.operatingSystem");
			}
		},
		SYSTEM_JAVACONFIGURATION {
			public String toString() {
				return ("system.javaConfiguration");
			}
		},
		SYSTEM_JAVAPROFILE {
			public String toString() {
				return ("system.javaProfile");
			}
		},
		SYSTEM_LUAVERSION {
			public String toString() {
				return ("system.luaVersion");
			}
		},
		DEFAULT_FOCUSBORDERCOLOR {
			public String toString() {
				return ("default.focusBorderColor");
			}
		},
		DEFAULT_SELBORDERCOLOR {
			public String toString() {
				return ("default.selBorderColor");
			}
		},
		DEFAULT_FOCUSBORDERWIDTH {
			public String toString() {
				return ("default.focusBorderWidth");
			}
		},
		DEFAULT_FOCUSBORDERTRANSPARENCY {
			public String toString() {
				return ("default.focusBorderTransparency");
			}
		},
		SERVICE_CURRENTFOCUS {
			public String toString() {
				return ("service.currentFocus");
			}
		},
		SERVICE_CURRENTKEYMASTER {
			public String toString() {
				return ("service.currentKeyMaster");
			}
		},
		SI_NUMBEROFSERVICES {
			public String toString() {
				return ("si.numberOfServices");
			}
		},
		SI_NUMBEROFPARTIALSERVICES {
			public String toString() {
				return ("si.numberOfPartialServices");
			}
		},
		SI_CHANNELNUMBER {
			public String toString() {
				return ("si.channelNumber");
			}
		},
		CHANNEL_KEYCAPTURE {
			public String toString() {
				return ("channel.keyCapture");
			}
		},
		CHANNEL_VIRTUALKEYBOARD {
			public String toString() {
				return ("channel.virtualKeyboard");
			}
		},
		CHANNEL_KEYBOARDBOUNDS {
			public String toString() {
				return ("channel.keyboardBounds");
			}
		}
	}

	public enum NCLSampleType {

		S, F, NPT
	}

	public enum NCLDefaultConditionRole {
		ONBEGIN {
			public String toString() {
				return "onBegin";
			}
		},
		ONEND {
			public String toString() {
				return "onEnd";
			}
		},
		ONABORT {
			public String toString() {
				return "onAbort";
			}
		},
		ONPAUSE {
			public String toString() {
				return "onPause";
			}
		},
		ONRESUME {
			public String toString() {
				return "onResume";
			}
		},
		ONSELECTION {
			public String toString() {
				return "onSelection";
			}
		},
		ONBEGINATTRIBUTION {
			public String toString() {
				return "onBeginAttribution";
			}
		},
		ONENDATTRIBUTION {
			public String toString() {
				return "onEndAttribution";
			}
		},

	}

	public enum NCLDefaultActionRole {
		START {
			public String toString() {
				return "start";
			}
		},
		STOP {
			public String toString() {
				return "stop";
			}
		},
		ABORT {
			public String toString() {
				return "abort";
			}
		},
		PAUSE {
			public String toString() {
				return "pause";
			}
		},
		RESUME {
			public String toString() {
				return "resume";
			}
		},
		SET {
			public String toString() {
				return "set";
			}
		}
	}

	/**
	 * file: ///file_path/#fragment_identifier
	 * http://server_identifier/file_path/#fragment_identifier
	 * https://server_identifier/file_path/#fragment_identifier
	 * rstp://server_identifier/file_path/#fragment_identifier
	 * rtp://server_identifier/file_path/#fragment_identifier
	 * nclmirror://media_element_identifier
	 * sbtvd-ts://program_number.component_tag
	 */
	public enum NCLUriType {

		FILE {
			public String toString() {
				return ("file://");
			}
		},
		HTTP {
			public String toString() {
				return ("http://");
			}
		},
		HTTPS {
			public String toString() {
				return ("https://");
			}
		},
		RSTP {
			public String toString() {
				return ("rstp://");
			}
		},
		RTP {
			public String toString() {
				return ("rtp://");
			}
		},
		NCLMIRROR {
			public String toString() {
				return ("nclmirror://");
			}
		},
		SBTVD_TS {
			public String toString() {
				return ("sbtvd-ts://");
			}
		}
	}

	public enum NCLKey {

		KEY_0 {
			public String toString() {
				return ("0");
			}
		},
		KEY_1 {
			public String toString() {
				return ("1");
			}
		},
		KEY_2 {
			public String toString() {
				return ("2");
			}
		},
		KEY_3 {
			public String toString() {
				return ("3");
			}
		},
		KEY_4 {
			public String toString() {
				return ("4");
			}
		},
		KEY_5 {
			public String toString() {
				return ("5");
			}
		},
		KEY_6 {
			public String toString() {
				return ("6");
			}
		},
		KEY_7 {
			public String toString() {
				return ("7");
			}
		},
		KEY_8 {
			public String toString() {
				return ("8");
			}
		},
		KEY_9 {
			public String toString() {
				return ("9");
			}
		},
		KEY_A {
			public String toString() {
				return ("A");
			}
		},
		KEY_B {
			public String toString() {
				return ("B");
			}
		},
		KEY_C {
			public String toString() {
				return ("C");
			}
		},
		KEY_D {
			public String toString() {
				return ("D");
			}
		},
		KEY_E {
			public String toString() {
				return ("E");
			}
		},
		KEY_F {
			public String toString() {
				return ("F");
			}
		},
		KEY_G {
			public String toString() {
				return ("G");
			}
		},
		KEY_H {
			public String toString() {
				return ("H");
			}
		},
		KEY_I {
			public String toString() {
				return ("I");
			}
		},
		KEY_J {
			public String toString() {
				return ("J");
			}
		},
		KEY_K {
			public String toString() {
				return ("K");
			}
		},
		KEY_L {
			public String toString() {
				return ("L");
			}
		},
		KEY_M {
			public String toString() {
				return ("M");
			}
		},
		KEY_N {
			public String toString() {
				return ("N");
			}
		},
		KEY_O {
			public String toString() {
				return ("O");
			}
		},
		KEY_P {
			public String toString() {
				return ("P");
			}
		},
		KEY_Q {
			public String toString() {
				return ("Q");
			}
		},
		KEY_R {
			public String toString() {
				return ("R");
			}
		},
		KEY_S {
			public String toString() {
				return ("S");
			}
		},
		KEY_T {
			public String toString() {
				return ("T");
			}
		},
		KEY_U {
			public String toString() {
				return ("U");
			}
		},
		KEY_V {
			public String toString() {
				return ("V");
			}
		},
		KEY_W {
			public String toString() {
				return ("W");
			}
		},
		KEY_X {
			public String toString() {
				return ("X");
			}
		},
		KEY_Y {
			public String toString() {
				return ("Y");
			}
		},
		KEY_Z {
			public String toString() {
				return ("Z");
			}
		},

		// TODO - colocar nome em ingles
		KEY_AST {
			public String toString() {
				return ("*");
			}
		},

		// TODO - colocar nome em ingles
		KEY_TRALHA {
			public String toString() {
				return ("#");
			}
		},
		MENU {
			public String toString() {
				return ("MENU");
			}
		},
		INFO {
			public String toString() {
				return ("INFO");
			}
		},
		GUIDE {
			public String toString() {
				return ("GUIDE");
			}
		},
		DOWN {
			public String toString() {
				return ("CURSOR_DOWN");
			}
		},
		UP {
			public String toString() {
				return ("CURSOR_UP");
			}
		},
		LEFT {
			public String toString() {
				return ("CURSOR_LEFT");
			}
		},
		RIGHT {
			public String toString() {
				return ("CURSOR_RIGHT");
			}
		},
		CHANNEL_DOWN {
			public String toString() {
				return ("CHANNEL_DOWN");
			}
		},
		CHANNEL_UP {
			public String toString() {
				return ("CHANNEL_UP");
			}
		},
		VOLUME_DOWN {
			public String toString() {
				return ("VOLUME_DOWN");
			}
		},
		VOLUME_UP {
			public String toString() {
				return ("VOLUME_UP");
			}
		},
		ENTER {
			public String toString() {
				return ("ENTER");
			}
		},
		BLUE {
			public String toString() {
				return ("BLUE");
			}
		},
		RED {
			public String toString() {
				return ("RED");
			}
		},
		GREEN {
			public String toString() {
				return ("GREEN");
			}
		},
		YELLOW {
			public String toString() {
				return ("YELLOW");
			}
		},
		BACK {
			public String toString() {
				return ("BACK");
			}
		},
		EXIT {
			public String toString() {
				return ("EXIT");
			}
		},
		POWER {
			public String toString() {
				return ("POWER");
			}
		},
		REWIND {
			public String toString() {
				return ("REWIND");
			}
		},
		STOP {
			public String toString() {
				return ("STOP");
			}
		},
		EJECT {
			public String toString() {
				return ("EJECT");
			}
		},
		PLAY {
			public String toString() {
				return ("PLAY");
			}
		},
		RECORD {
			public String toString() {
				return ("RECORD");
			}
		},
		PAUSE {
			public String toString() {
				return ("PAUSE");
			}
		}
	}

}