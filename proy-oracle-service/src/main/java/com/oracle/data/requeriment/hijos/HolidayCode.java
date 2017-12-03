package com.oracle.data.requeriment.hijos;

import javax.xml.bind.annotation.XmlElement;


public class HolidayCode {
	
	private String[] Holiday;

	
	public String[] getHoliday() {
		return Holiday;
	}
	@XmlElement
	public void setHoliday(String[] holiday) {
		Holiday = holiday;
	}

	public HolidayCode(String[] holiday) {
		super();
		Holiday = holiday;
	}

	public HolidayCode() {

	}

	
}
