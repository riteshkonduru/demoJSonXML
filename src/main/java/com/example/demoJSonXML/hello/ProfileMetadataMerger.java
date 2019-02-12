package com.example.demoJSonXML.hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfileMetadataMerger {

	/*
	 * This method contains Merging/Adding elements to destination xml.
	 * 
	 * */
	@PostMapping("/update")
	public static String updateXmlElements(@RequestBody String compareContent) {
		String readReturn = "Ritesh1";
		
		try { 
			System.out.println("compareContent " + compareContent);
			File newFile = new File("src/test/resources/newFile_jdk6.txt");
			File newFileDest = new File("src/test/resources/newFile_Dest.txt");
			Profile profileSource = new Profile();
			Profile profileDest= new Profile();
			if( !compareContent.isEmpty() && compareContent != null) {
				compareContent = compareContent.replaceAll("\\s+"," ");
				System.out.println("compareContent " + compareContent);
				String[] compareContentStr=compareContent.split("\\*SEPARATOR\\*");
				System.out.println("compareContent " + compareContentStr.length);
				for(String w:compareContentStr){  
					System.out.println(w);  
					}  
				if(compareContentStr.length >0) {
					 
					 if(compareContentStr[0] != null && !compareContentStr[0].isEmpty()) {
						 boolean success = newFile.createNewFile();
						 BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
						 writer.write(compareContentStr[0]);
						 System.out.println("Success " + success);
						 writer.close();
						 String xml = new String(Files.readAllBytes(Paths.get("src/test/resources/newFile_jdk6.txt")));
						 ObjectMapper objectMapper = new XmlMapper();
						 profileSource = objectMapper.readValue(xml, Profile.class);
						 ObjectMapper mapper = new ObjectMapper();
						 String json = mapper.writeValueAsString(profileSource);

						 System.out.println("json" + json);
					 }
					 if(compareContentStr[1] != null && !compareContentStr[1].isEmpty()) {
						 boolean successDest = newFileDest.createNewFile();
						 BufferedWriter writer1 = new BufferedWriter(new FileWriter(newFileDest));
						 System.out.println(compareContentStr[1].trim()); 
						 writer1.write(compareContentStr[1].trim()); 
						 System.out.println("successDest " + successDest);
						 writer1.close();
						 String xmlDest = new String(Files.readAllBytes(Paths.get("src/test/resources/newFile_Dest.txt")));
						 ObjectMapper objectMapperDest = new XmlMapper();
						 profileDest = objectMapperDest.readValue(xmlDest, Profile.class);
						 ObjectMapper mapper = new ObjectMapper();
						 String jsonDest = mapper.writeValueAsString(profileDest);

						 System.out.println("jsonDest" + jsonDest);
					 }
				}
				
				//Method to Compare classAccesses Tags:
				readReturn = compareclassAccessesTags(profileSource ,profileDest);

				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Return");
		return readReturn;

	}
	private static String compareclassAccessesTags(Profile profileSource, Profile profileDest) {
		// TODO Auto-generated method stub
		System.out.println("profileSource" + profileSource.toString());
		System.out.println("profileDest" + profileDest.toString());
		
		List<ClassAccesses> lstclasses = profileSource.getClassAccesses();
		List<ClassAccesses> lstclassesDest = profileDest.getClassAccesses();
		HashMap<String, String> destMap = new HashMap<String, String>();
		HashMap<String, String> sourceMap = new HashMap<String, String>();
		
		if(lstclasses.size() >0 && lstclasses != null) {
			for(ClassAccesses tempClassDest: lstclassesDest) {
				destMap.put(tempClassDest.apexClass, tempClassDest.enabled);
			}
			for(ClassAccesses tempClass: lstclasses) {
				sourceMap.put(tempClass.apexClass, tempClass.enabled);
			}
			
		}
		if(destMap.size() >0 && destMap != null && sourceMap.size() >0 && sourceMap != null ) {//To compare and update
			for(String tempkey :sourceMap.keySet()) {
				destMap.put(tempkey,sourceMap.get(tempkey));//update the value if contains and add key/value if dosen't contains.
			}
		}
		boolean istrue = lstclassesDest.removeAll(lstclassesDest);
		System.out.println("istrue" + istrue);
		for(String temptag : destMap.keySet()) {
			ClassAccesses tempclass = new ClassAccesses();
			tempclass.apexClass =temptag;
			tempclass.enabled =destMap.get(temptag);
			lstclassesDest.add(tempclass);
		}
		String xml ="";
		try {
		XmlMapper xmlMapper = new XmlMapper();
	     xml = xmlMapper.writeValueAsString(profileDest);
	    System.out.println("xml  " + xml);
		}catch(Exception ex) {
			ex.printStackTrace(); 
			System.out.println(ex); 
		}
		
		return xml;
		
		/*for(ClassAccesses tempClassDest: lstclassesDest) {
				System.out.println("tempClassDest " + tempClassDest.toString());
				
				for(ClassAccesses tempClass: lstclasses) {
					System.out.println("tempClass " + tempClass.toString());
					
					if(tempClass.apexClass == tempClassDest.apexClass) {//this is for existing class tag - Updating basically 
						Boolean Succes = lstclassesDest.remove(tempClassDest);
						System.out.println("Succes" + Succes);
						ClassAccesses newTempobj = new ClassAccesses();
						newTempobj.apexClass = tempClass.apexClass;
						newTempobj.enabled = tempClass.enabled;
					}
					Boolean Succes = lstclassesDest.add(tempClassDest);
					System.out.println("Succes" + Succes);
					break;
					
				}
				
			}**/
	}
	public static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	/*
	 * This method contains update functionality for destination xml.
	 * 
	 * */
	public static final void prettyPrint(Document xml) throws Exception {

		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
		System.out.println(out.toString());

	}

}

