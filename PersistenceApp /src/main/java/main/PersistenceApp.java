package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Cliente;
import entities.Domicilio;



public class PersistenceApp {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
		EntityManager em = emf.createEntityManager();
	
		try {
			em.getTransaction().begin();
			
			
			
			em.flush();
			em.getTransaction().commit();
			
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		
		em.close();
		emf.close();
	
	}
	
	
	
}
