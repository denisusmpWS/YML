package com.oracle.data.util;



import java.io.ByteArrayOutputStream;
import java.io.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class Pruebas{

	public static void main(String []args) throws JsonProcessingException, JAXBException{
			
		Operacion operacion=null;
		Detalle[] detalle={new Detalle(1, new Date(), 0),new Detalle(2, new Date(), 0)};
		String[] arreglo={"SERIVA 1","SERIVA 2"};
	
			List<Detalle> historial=new ArrayList<>();
			for(int b=0;b<5;b++){
				historial.add(new Detalle(b, new Date(), 0));				
			}
			
		operacion=new Operacion(1, new Date(), "E001-SAP000E56-E0"+1, 2000.00+1, detalle, historial,true,arreglo,"26/11/2017");
			
		
		/*TRANSFORM I: OBJECT A JSON*/
		Gson objectJson=new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
        String json= objectJson.toJson(operacion);
		System.out.println(json);
		
		/*
		ObjectMapper mapper=new ObjectMapper();
		String json2=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(operacion).toString();
		System.out.println(json2);
		*/
		
		/*TRANSFORM II: JSON A OBJECT*/
		//DESEARIALIZA EN DICHO FORMATO CON OBJETO DATE TIPO STRING
		//Gson gson=new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
		Gson gson=new GsonBuilder().create();
		Operacion2 operacion2=gson.fromJson(json, Operacion2.class);
		System.out.println(operacion2.getId()+"\n "+ operacion2.getSerie()+"\n "+operacion2.getFecha2()+"\n "+operacion2.getDate());
		
		/*
		StringWriter writer=new StringWriter();
	    JAXBContext context=JAXBContext.newInstance(Object.class);
	    Marshaller marshaller=context.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
	    marshaller.marshal(operacion2,writer);
	    System.out.println(writer.toString());
	      */
		
		/*TRANSFORM III: OBJECT -> XML*/
		File productoXML = new File("producto.xml");
		//nos permitira transformar la data en este caso el xml a bytes
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//creamos un conexto para crear una instancia de la padre
		JAXBContext context=JAXBContext.newInstance(Operacion2.class);
		//a traves de un la clase marshall y el contexto ya definido podremos invocar al metodo de la misma createMarshall()
		Marshaller marshaller=context.createMarshaller();
		
		//definimos q la data transformaro tenga un formato de salida correcto de XML
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//a traves de objeto marshaall(transformacion)  y su metodo de conversion marshal(objeto_padre, arch.xml)
		marshaller.marshal(operacion2, productoXML);
		//finalmente le enviamos el formato de salida como queremos que se muestre.
		marshaller.marshal(operacion2, baos);
		String formatXML=new String(baos.toByteArray()).toString();
		System.out.println(formatXML);
		
		
	}
	
	
	
}
