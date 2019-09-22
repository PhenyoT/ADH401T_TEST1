package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.transaction;
import service.transactionEJB;

@ManagedBean(name = "transactioncontroller")
@SessionScoped

public class transactioncontroller {
	
	@EJB
	transactionEJB transactionservice;
	
	@ManagedProperty(value = "#{transaction}")
	private transaction transaction;
	
	public void addNewTransaction()
	{
		System.out.println("--------transaction started----------------");
		transactionservice.addNew(transaction.getEntity());
	}

	public transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(transaction transaction) {
		this.transaction = transaction;
	}

	
}
