package com.example.demoJSonXML.hello;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RecordTypeVisibilities {
	

	    @JacksonXmlProperty(localName = "personAccountDefault")
	    public boolean personAccountDefault;
	    @JacksonXmlProperty(localName = "recordType")
	    public String recordType;
	    @JacksonXmlProperty(localName = "visible")
	    public boolean visible;
	    @JacksonXmlProperty(localName = "default")
	    public boolean defaultRecordTypeVisibility;//TODO


}
