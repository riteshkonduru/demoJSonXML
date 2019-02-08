package com.example.demoJSonXML.hello;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LayoutAssignments {
	
	 @JacksonXmlProperty(localName = "layout", isAttribute = true)
	    public String layout;
	    @JacksonXmlProperty(localName = "recordType")
	    public String recordType;
	   
}
