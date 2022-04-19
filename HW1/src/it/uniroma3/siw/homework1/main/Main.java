package it.uniroma3.siw.homework1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
	public static void main(String[] arg) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Formazione-unit");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}
}