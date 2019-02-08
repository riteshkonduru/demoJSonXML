package com.example.demoJSonXML.hello;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
public final class Employee {
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String id;
    @JacksonXmlProperty(localName = "first_name")
    private String firstName;
    @JacksonXmlProperty(localName = "last_name")
    private String lastName;
    @JacksonXmlProperty(localName = "age")
    private int age;
    public Employee() {
    }
    public Employee(String id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
}