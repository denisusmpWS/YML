package com.oracle.data.requeriment.hijos;

import javax.xml.bind.annotation.XmlElement;

import com.oracle.data.requeriment.nietos.Cash;


public class Product {
	
	private Cash Cash;


	public Cash getCash() {
		return Cash;
	}
	@XmlElement
	public void setCash(Cash cash) {
		Cash = cash;
	}

	public Product(Cash cash) {
		super();
		Cash = cash;
	}

	public Product() {

	}

	
	
	
	

}
