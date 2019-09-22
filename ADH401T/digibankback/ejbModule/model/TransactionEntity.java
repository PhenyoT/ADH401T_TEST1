package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="transaction_tbl")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	private String name;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationbank;
	private String destinationcountry;
	private String accountnumber;
	private Double amount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	

}
