package com.oracle.data.requeriment.hijos;

//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlType;


//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"externalReference","internalReference","action","tradeCounterParty",
			"counterPartyRole","tradeBook","tradeCurrency","tradeNotional",
			"tradeDateTime","tradeSettleDate","startDate","maturityDate",
			"traderName","salesPerson","comment","holidayCode","productType","product","tradeKeyWords"})
public class CalypsoTrade {
	//TradeBundleOneMsg, TradeEventsInSameBundle (faltan adicionar a la trama json o son datos que se adicionaran)

	private String tradeType; //attribute
	private String ExternalReference;
	private String InternalReference;
	private String Action;
	private String TradeCounterParty;
	private String CounterPartyRole;
	private String TradeBook;
	private String TradeCurrency;
	private double TradeNotional;
	private String TradeDateTime;
	private String TradeSettleDate;
	private String StartDate;
	private String MaturityDate;
	private String TraderName;
	private String SalesPerson;
	private String Comment;
	private HolidayCode HolidayCode;
	private String ProductType;
	private Product Product;
	private TradeKeyWords TradeKeyWords;
	
	@XmlAttribute
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getExternalReference() {
		return ExternalReference;
	}
	@XmlElement
	public void setExternalReference(String externalReference) {
		ExternalReference = externalReference;
	}
	public String getInternalReference() {
		return InternalReference;
	}
	@XmlElement
	public void setInternalReference(String internalReference) {
		InternalReference = internalReference;
	}

	public String getAction() {
		return Action;
	}
	@XmlElement
	public void setAction(String action) {
		Action = action;
	}
	
	public String getTradeCounterParty() {
		return TradeCounterParty;
	}
	@XmlElement
	public void setTradeCounterParty(String tradeCounterParty) {
		TradeCounterParty = tradeCounterParty;
	}
	
	public String getCounterPartyRole() {
		return CounterPartyRole;
	}
	@XmlElement
	public void setCounterPartyRole(String counterPartyRole) {
		CounterPartyRole = counterPartyRole;
	}
	
	public String getTradeBook() {
		return TradeBook;
	}
	@XmlElement
	public void setTradeBook(String tradeBook) {
		TradeBook = tradeBook;
	}
	
	public String getTradeCurrency() {
		return TradeCurrency;
	}
	@XmlElement
	public void setTradeCurrency(String tradeCurrency) {
		TradeCurrency = tradeCurrency;
	}

	public double getTradeNotional() {
		return TradeNotional;
	}
	@XmlElement
	public void setTradeNotional(double tradeNotional) {
		TradeNotional = tradeNotional;
	}

	public String getTradeDateTime() {
		return TradeDateTime;
	}
	@XmlElement
	public void setTradeDateTime(String tradeDateTime) {
		TradeDateTime = tradeDateTime;
	}

	public String getTradeSettleDate() {
		return TradeSettleDate;
	}
	@XmlElement
	public void setTradeSettleDate(String tradeSettleDate) {
		TradeSettleDate = tradeSettleDate;
	}
	
	public String getStartDate() {
		return StartDate;
	}
	@XmlElement
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	public String getMaturityDate() {
		return MaturityDate;
	}
	@XmlElement
	public void setMaturityDate(String maturityDate) {
		MaturityDate = maturityDate;
	}
	
	public String getTraderName() {
		return TraderName;
	}
	@XmlElement
	public void setTraderName(String traderName) {
		TraderName = traderName;
	}
	
	public String getSalesPerson() {
		return SalesPerson;
	}
	@XmlElement
	public void setSalesPerson(String salesPerson) {
		SalesPerson = salesPerson;
	}
	
	public String getComment() {
		return Comment;
	}
	@XmlElement
	public void setComment(String comment) {
		Comment = comment;
	}
	
	public HolidayCode getHolidayCode() {
		return HolidayCode;
	}
	@XmlElement
	public void setHolidayCode(HolidayCode holidayCode) {
		HolidayCode = holidayCode;
	}
	
	public String getProductType() {
		return ProductType;
	}
	@XmlElement
	public void setProductType(String productType) {
		ProductType = productType;
	}
	
	public Product getProduct() {
		return Product;
	}
	@XmlElement
	public void setProduct(Product product) {
		Product = product;
	}
	
	
	public TradeKeyWords getTradeKeyWords() {
		return TradeKeyWords;
	}
	@XmlElement
	public void setTradeKeyWords(TradeKeyWords tradeKeyWords) {
		TradeKeyWords = tradeKeyWords;
	}
	public CalypsoTrade(String tradeType, String externalReference, String internalReference, String action,
			String tradeCounterParty, String counterPartyRole, String tradeBook, String tradeCurrency,
			double tradeNotional, String tradeDateTime, String tradeSettleDate, String startDate, String maturityDate,
			String traderName, String salesPerson, String comment,
			HolidayCode holidayCode, String productType,
			Product product,TradeKeyWords tradeKeyWords) {
		super();
		this.tradeType = tradeType;
		ExternalReference = externalReference;
		InternalReference = internalReference;
		Action = action;
		TradeCounterParty = tradeCounterParty;
		CounterPartyRole = counterPartyRole;
		TradeBook = tradeBook;
		TradeCurrency = tradeCurrency;
		TradeNotional = tradeNotional;
		TradeDateTime = tradeDateTime;
		TradeSettleDate = tradeSettleDate;
		StartDate = startDate;
		MaturityDate = maturityDate;
		TraderName = traderName;
		SalesPerson = salesPerson;
		Comment = comment;
		HolidayCode = holidayCode;
		ProductType = productType;
		Product = product;
		TradeKeyWords = tradeKeyWords;
	}
	public CalypsoTrade() {
		
	}
     

}
