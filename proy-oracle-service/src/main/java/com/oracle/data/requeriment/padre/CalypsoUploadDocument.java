package com.oracle.data.requeriment.padre;

import java.util.List;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.oracle.data.requeriment.hijos.CalypsoTrade;


@XmlRootElement
public class CalypsoUploadDocument {
	

	private String UploadDate;
	private String Version;
	private List<CalypsoTrade>CalypsoTrade;
	
	@XmlAttribute
	public String getUploadDate() {
		return UploadDate;
	}
	public void setUploadDate(String uploadDate) {
		UploadDate = uploadDate;
	}
	@XmlAttribute
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	
	public List<CalypsoTrade> getCalypsoTrade() {
		return CalypsoTrade;
	}
	@XmlElement
	public void setCalypsoTrade(List<CalypsoTrade> calypsoTrade) {
		CalypsoTrade = calypsoTrade;
	}
	public CalypsoUploadDocument(String uploadDate, String version,
			List<CalypsoTrade> calypsoTrade) {
		super();
		UploadDate = uploadDate;
		Version = version;
		CalypsoTrade = calypsoTrade;
	}
	public CalypsoUploadDocument() {
	
	} 

	
	
}
