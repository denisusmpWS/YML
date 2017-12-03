package com.oracle.data.transform;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;


public class PruebasFinal{
	
	@Autowired
	UtilMethosTransform methosTransform;
	
	public static void main(String []args) throws JAXBException{
	
	
		UtilMethosTransform methosTransform=new UtilMethosTransform();
		
		Operacion operacion=null;
		Detalle[] detalle={new Detalle(1, new Date(), 0),new Detalle(2, new Date(), 0)};
		String[] arreglo={"SERIVA I","SERIVA II"};
	
			List<Detalle> historial=new ArrayList<>();
			for(int b=0;b<5;b++){
				historial.add(new Detalle(b, new Date(), 0));				
			}
			
		operacion=new Operacion(1, new Date(), "E001-SAP000E56-E0"+1, 2000.00+1, detalle, historial,true,arreglo,"02/12/2017");
		
		
		String json=methosTransform.objectToJson(operacion, "dd/MM/yyyy");
		System.out.println("FASE I:"+json);
		Operacion2 operacion2=methosTransform.JsonToObject(json);
		System.out.println("FASE II:"+operacion2);
		String xml=methosTransform.ObjectToXML("operacion", operacion2);
		System.out.println("FASE III:"+xml);
		
	}
	

}
