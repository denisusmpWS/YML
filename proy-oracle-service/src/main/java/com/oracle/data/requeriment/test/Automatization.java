package com.oracle.data.requeriment.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;


import com.oracle.data.requeriment.hijos.CalypsoTrade;
import com.oracle.data.requeriment.hijos.HolidayCode;
import com.oracle.data.requeriment.hijos.Product;
import com.oracle.data.requeriment.hijos.TradeKeyWords;
import com.oracle.data.requeriment.nietos.Cash;
import com.oracle.data.requeriment.nietos.Keyword;
import com.oracle.data.requeriment.padre.CalypsoUploadDocument;



public class Automatization {

	
	public static void main(String []args) throws JAXBException{
		
		UtilMethosTransform methosTransform=new UtilMethosTransform();
		
		/*HIJOS*/
		
		//2
		String[] holiday={"LIM PUB"};
		HolidayCode holidayCode=new HolidayCode(holiday);
		Cash cash=new Cash("FIXED", true, "PEN", 3.75, 0.0, false, holidayCode, "ZC", "ACT/360", true, false);
		Product product=new Product(cash);
		//3
		List<Keyword> keyword=new ArrayList<>();
			keyword.add(new Keyword("SubTypeMM", "CDNN"));
			keyword.add(new Keyword("TradeSource", "SerivaMINV"));
			keyword.add(new Keyword("TraderUser", "s69905"));

		TradeKeyWords tradeKeyWords=new TradeKeyWords(keyword);
		
		
		//2
		List<CalypsoTrade> calypsoTrade=new ArrayList<>();
		calypsoTrade.add(new CalypsoTrade("Cash", "CDNN_jls002", "CDNN_jls002", "NEW", "ALICORP S.A.A.", "CounterParty", "CDNN_Book", "PEN", 35650.0, "2017-08-17", "2017-08-17", "2017-08-17", "2018-12-18", "NONE", "NONE", "CDNN TEST", holidayCode, "Cash", product, tradeKeyWords));
		
		//1
		CalypsoUploadDocument calypsoUploadDocument=new CalypsoUploadDocument("08/22/2017", "1", calypsoTrade);
		//MessageRequest messageRequest=new MessageRequest(calypsoUploadDocument);
		
		//OBJECT TO JSON
		String json=methosTransform.objectToJson(calypsoUploadDocument, "dd-MM-yyyy");
		System.out.println("JSON:"+json);
		
		
		//JSON TO OBJECT
		CalypsoUploadDocument calypsoUploadDocument2=methosTransform.JsonToObject(json);
		System.out.println("OBJECT:"+calypsoUploadDocument2);
		
		//OBJECT TO XML
		String xml=methosTransform.ObjectToXML("CalypsoUploadDocument2.xml", calypsoUploadDocument2);
		System.out.println("XML:"+xml);
		
		//XML A OBJECT - FORMA I
		CalypsoUploadDocument calypsoUploadDocument3=methosTransform.XmlToObject("CalypsoUploadDocument2.xml");
		System.out.println("OBJECT:"+calypsoUploadDocument3);
		System.out.println("ID:"+calypsoUploadDocument3.getVersion());
		
		//XML A OBJECT - FORMA II
		CalypsoUploadDocument calypsoUploadDocument4=methosTransform.XmlToObject2(xml);
		System.out.println("OBJECT 2:"+calypsoUploadDocument4);
		System.out.println("VERSION:"+calypsoUploadDocument4.getVersion());
		
		
	}
	
}
