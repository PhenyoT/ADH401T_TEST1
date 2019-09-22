package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;

/**
 * Session Bean implementation class transactionEJB
 */
@Stateless
@LocalBean
public class transactionEJB {

	@PersistenceContext
	private EntityManager em;
	
    public transactionEJB() {
       

    }
    
    public void addNew(TransactionEntity transactionEntity)
    {
    	System.out.println("----adding transaction to the database------");
    	em.persist(transactionEntity);
    	System.out.println("----successfully added transaction to the database------");
    }

}
