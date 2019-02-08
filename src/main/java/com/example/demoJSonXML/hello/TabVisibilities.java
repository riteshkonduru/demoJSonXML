package com.example.demoJSonXML.hello;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TabVisibilities {
	
	 @JacksonXmlProperty(localName = "visibility", isAttribute = true)
	    public String visibility;
	 @JacksonXmlProperty(localName = "tab", isAttribute = true)
	    public String tab;


}
