package com.oracle.data.requeriment.nietos;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;

import com.oracle.data.requeriment.hijos.HolidayCode;


//@XmlAccessorType(XmlAccessType.FIELD)
public class Cash {
	
	private String RateType;
	private boolean Loan;
	private String Currency;
	private double Rate;
	private double SalesMargin;
	private boolean Discounted;
	private HolidayCode HolidayCode;
	private String PaymentFrequency;
	private String DayCountConvention;
	private boolean PrincipalExchange;
	private boolean OpenTerm;
	
	@XmlElement
	public String getRateType() {
		return RateType;
	}
	public void setRateType(String rateType) {
		RateType = rateType;
	}
	@XmlElement
	public boolean isLoan() {
		return Loan;
	}
	public void setLoan(boolean loan) {
		Loan = loan;
	}
	@XmlElement
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	@XmlElement
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	@XmlElement
	public double getSalesMargin() {
		return SalesMargin;
	}
	public void setSalesMargin(double salesMargin) {
		SalesMargin = salesMargin;
	}
	@XmlElement
	public boolean isDiscounted() {
		return Discounted;
	}
	public void setDiscounted(boolean discounted) {
		Discounted = discounted;
	}
	@XmlElement
	public HolidayCode getHolidayCode() {
		return HolidayCode;
	}
	public void setHolidayCode(HolidayCode holidayCode) {
		HolidayCode = holidayCode;
	}
	@XmlElement
	public String getPaymentFrequency() {
		return PaymentFrequency;
	}
	public void setPaymentFrequency(String paymentFrequency) {
		PaymentFrequency = paymentFrequency;
	}
	@XmlElement
	public String getDayCountConvention() {
		return DayCountConvention;
	}
	public void setDayCountConvention(String dayCountConvention) {
		DayCountConvention = dayCountConvention;
	}
	@XmlElement
	public boolean isPrincipalExchange() {
		return PrincipalExchange;
	}
	public void setPrincipalExchange(boolean principalExchange) {
		PrincipalExchange = principalExchange;
	}
	@XmlElement
	public boolean isOpenTerm() {
		return OpenTerm;
	}
	public void setOpenTerm(boolean openTerm) {
		OpenTerm = openTerm;
	}
	public Cash(String rateType, boolean loan, String currency, double rate, double salesMargin, boolean discounted,
			HolidayCode holidayCode, String paymentFrequency,
			String dayCountConvention, boolean principalExchange, boolean openTerm) {
		super();
		RateType = rateType;
		Loan = loan;
		Currency = currency;
		Rate = rate;
		SalesMargin = salesMargin;
		Discounted = discounted;
		HolidayCode = holidayCode;
		PaymentFrequency = paymentFrequency;
		DayCountConvention = dayCountConvention;
		PrincipalExchange = principalExchange;
		OpenTerm = openTerm;
	}
	public Cash() {
		
	}

	

}
