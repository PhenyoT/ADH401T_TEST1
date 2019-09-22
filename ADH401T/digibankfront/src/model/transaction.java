package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="transaction")
@SessionScoped

public class transaction {
	
	private String name;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationbank;
	private String destinationcountry;
	private String accountnumber;
	private Double amount;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcepassport() {
		return sourcepassport;
	}
	public void setSourcepassport(String sourcepassport) {
		this.sourcepassport = sourcepassport;
	}
	public String getDestinationpassport() {
		return destinationpassport;
	}
	public void setDestinationpassport(String destinationpassport) {
		this.destinationpassport = destinationpassport;
	}
	public String getDestinationbank() {
		return destinationbank;
	}
	public void setDestinationbank(String destinationbank) {
		this.destinationbank = destinationbank;
	}
	public String getDestinationcountry() {
		return destinationcountry;
	}
	public void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public TransactionEntity getEntity()
	{
		TransactionEntity transationentity = new TransactionEntity();
		transationentity.setName(name);
		transationentity.setSourcepassport(sourcepassport);
		transationentity.setDestinationpassport(destinationpassport);
		transationentity.setDestinationbank(destinationbank);
		transationentity.setDestinationcountry(destinationcountry);
		transationentity.setAccountnumber(accountnumber);
		transationentity.setAmount(amount);
		return transationentity;
	}

}
