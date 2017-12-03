package com.oracle.data.requeriment.nietos;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


//@XmlAccessorType(XmlAccessType.FIELD)
public class Keyword {
	
	private String KeywordName;
	private String KeywordValue;
	
	public String getKeywordName() {
		return KeywordName;
	}
	@XmlElement
	public void setKeywordName(String keywordName) {
		KeywordName = keywordName;
	}
	
	public String getKeywordValue() {
		return KeywordValue;
	}
	@XmlElement
	public void setKeywordValue(String keywordValue) {
		KeywordValue = keywordValue;
	}
	public Keyword(String keywordName, String keywordValue) {
		KeywordName = keywordName;
		KeywordValue = keywordValue;
	}
	public Keyword() {
		
	}
	
	
	
	
}
