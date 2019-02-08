package com.example.demoJSonXML.hello;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CustomPermissions {
	
	 @JacksonXmlProperty(localName = "name", isAttribute = true)
	    public String name;
	    @JacksonXmlProperty(localName = "enabled")
	    public boolean enabled;

}
