/**
 * 
 */
package com.raidentrance.dao;

import javax.persistence.EntityManager;

import com.raidentrance.entities.User;

/**
 * @author raidentrance
 *
 */
public class UserDao extends AbstractFacade<User> {

	public UserDao(EntityManager entityManager) {
		super(User.class, entityManager);
	}

}
