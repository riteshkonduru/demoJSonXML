package com.example.demoJSonXML.hello;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FieldPermissions {
	
	 @JacksonXmlProperty(localName = "field", isAttribute = true)
	    public String field;
	    @JacksonXmlProperty(localName = "editable")
	    public boolean editable;
	    @JacksonXmlProperty(localName = "hidden")
	    public boolean hidden;
	    @JacksonXmlProperty(localName = "readable")
	    public boolean readable;

}
