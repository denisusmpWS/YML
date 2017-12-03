package com.oracle.data.util;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UtilMethosTransform {
	
	
	public String objectToJson(Operacion e, String format) {
		Gson objectJson=new GsonBuilder().setDateFormat(format).create();
        String json= objectJson.toJson(e);
		System.out.println(json);
		return json;
	}


	public Operacion2 JsonToObject(String json) {
		Gson gson=new GsonBuilder().create();
		Operacion2 e=gson.fromJson(json,Operacion2.class);
		return e;
	}


	public String ObjectToXML(String nameXML, Operacion2 e) throws JAXBException {
		File fileXML = new File(nameXML+".xml");
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		JAXBContext context=JAXBContext.newInstance(Operacion2.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(e, fileXML);
		marshaller.marshal(e, baos);
		String formatXML=new String(baos.toByteArray()).toString();
		return formatXML;
	}
	
	

}
