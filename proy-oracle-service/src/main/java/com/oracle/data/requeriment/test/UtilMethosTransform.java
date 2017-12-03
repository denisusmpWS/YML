package com.oracle.data.requeriment.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oracle.data.requeriment.padre.CalypsoUploadDocument;


public class UtilMethosTransform {
	
	
	public String objectToJson(CalypsoUploadDocument e, String format) {
		Gson objectJson=new GsonBuilder().setDateFormat(format).create();
        String json= objectJson.toJson(e);
		System.out.println(json);
		return json;
	}


	public CalypsoUploadDocument JsonToObject(String json) {
		Gson gson=new GsonBuilder().create();
		CalypsoUploadDocument e=gson.fromJson(json,CalypsoUploadDocument.class);
		return e;
	}


	public String ObjectToXML(String nameXML, CalypsoUploadDocument e) throws JAXBException {
		File fileXML = new File(nameXML);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		JAXBContext context=JAXBContext.newInstance(CalypsoUploadDocument.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(e, fileXML);
		marshaller.marshal(e, baos);
		String formatXML=new String(baos.toByteArray()).toString();
		return formatXML;
	}
	
	public CalypsoUploadDocument XmlToObject(String nameXML) throws JAXBException{
		File file= new File(nameXML);
		JAXBContext context=JAXBContext.newInstance(CalypsoUploadDocument.class);
		Unmarshaller transformar=context.createUnmarshaller();
		CalypsoUploadDocument calypsoUploadDocument=(CalypsoUploadDocument) transformar.unmarshal(file);
		return calypsoUploadDocument;
	}

	
	public CalypsoUploadDocument XmlToObject2(String formatXML) throws JAXBException{
		JAXBContext jaxbContext=JAXBContext.newInstance(CalypsoUploadDocument.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
	    StringReader reader=new StringReader(formatXML);
	    CalypsoUploadDocument calypsoUploadDocument=(CalypsoUploadDocument) unmarshaller.unmarshal(reader);
	    return calypsoUploadDocument;
	}
}
