/**
 * 
 */
package com.raidentrance.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author raidentrance
 *
 */
public class ApplicationContext {

	private EntityManagerFactory entityManagerFactory;

	private static ApplicationContext instance = new ApplicationContext();

	private ApplicationContext() {
		entityManagerFactory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
	}

	public static ApplicationContext getInstance() {
		return instance;
	}

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public void closeEntityManager() {
		entityManagerFactory.close();
	}

}
