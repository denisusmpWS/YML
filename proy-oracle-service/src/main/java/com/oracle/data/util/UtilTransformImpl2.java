package com.oracle.data.util;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UtilTransformImpl2<E>	extends UtilTranform2<E> {

	@Override
	public String objectToJson(E e, String format) {
		Gson objectJson=new GsonBuilder().setDateFormat(format).create();
        String json= objectJson.toJson(e);
		System.out.println(json);
		return json;
	}

	@Override
	public E JsonToObject(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ObjectToXML(String nameXML, E e) throws JAXBException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
