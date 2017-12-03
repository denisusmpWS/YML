package com.oracle.data.requeriment.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.oracle.data.requeriment.padre.CalypsoUploadDocument;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageRequest {
	

	private CalypsoUploadDocument CalypsoUploadDocument;

	public CalypsoUploadDocument getCalypsoUploadDocument() {
		return CalypsoUploadDocument;
	}

	@XmlElement(name="CalypsoUploadDocument")
	public void setCalypsoUploadDocument(CalypsoUploadDocument calypsoUploadDocument) {
		this.CalypsoUploadDocument = calypsoUploadDocument;
	}

	public MessageRequest(CalypsoUploadDocument calypsoUploadDocument) {
		this.CalypsoUploadDocument = calypsoUploadDocument;
	}

	public MessageRequest() {
	
	}

	
	
}
