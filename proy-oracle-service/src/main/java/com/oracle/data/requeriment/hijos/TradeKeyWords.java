package com.oracle.data.requeriment.hijos;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.oracle.data.requeriment.nietos.Keyword;


public class TradeKeyWords {

	private List<Keyword> Keyword;

	
	public List<Keyword> getKeyword() {
		return Keyword;
	}
	@XmlElement
	public void setKeyword(List<Keyword> keyword) {
		Keyword = keyword;
	}

	public TradeKeyWords(List<Keyword> keyword) {
		super();
		Keyword = keyword;
	}

	public TradeKeyWords() {

	}
	
	
	
}
