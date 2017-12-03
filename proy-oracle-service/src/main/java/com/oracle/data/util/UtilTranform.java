package com.oracle.data.util;
import javax.xml.bind.JAXBException;




public interface UtilTranform<E> {
	
	public String objectToJson(E e,String format);
	public E JsonToObject(String json);
	public String ObjectToXML(String nameXML, E e) throws JAXBException;
	/*UtilTransformImpl.java
	public abstract String objectToJson(E e,String format){
		Gson objectJson=new GsonBuilder().setDateFormat(format).create();
        String json= objectJson.toJson(e);
		System.out.println(json);
		return json;
	}
	
	
	public E JsonToObject(String json,String name){
		Gson gson=new GsonBuilder().create();
		E e=gson.fromJson(json,E.class);
		return e;
	}
	
	
	public String ObjectToXML(String nameXML, E e) throws JAXBException{
		File fileXML = new File(nameXML+".xml");
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		JAXBContext context=JAXBContext.newInstance(Object.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(e, fileXML);
		marshaller.marshal(e, baos);
		String formatXML=new String(baos.toByteArray()).toString();
		return formatXML;
	}
	
	*/
}
