package com.example.demoJSonXML.hello;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello , checking demoJSonXML is up and running .";
	} 
	@RequestMapping("/helloTest")
	public String testmethod() {
		try {

			//String xml = new String(Files.readAllBytes(Paths.get("/Users/rkonduru/Desktop/Localization User.profile")));
			String xml = new String(Files.readAllBytes(Paths.get("/Users/rkonduru/Desktop/sourcePackageProfile.xml")));

			ObjectMapper objectMapper = new XmlMapper();
			Profile poppy = objectMapper.readValue(xml, Profile.class);

			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(poppy);

			System.out.println("json" + json);
			return json;
		}catch(Exception ex) {
			ex.printStackTrace(); 
			System.out.println(ex); 
		}
		return "test";
	}

}
