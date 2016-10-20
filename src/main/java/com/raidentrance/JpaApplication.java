/**
 * 
 */
package com.raidentrance;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import com.raidentrance.dao.UserDao;
import com.raidentrance.entities.User;
import com.raidentrance.util.ApplicationContext;

/**
 * @author raidentrance
 *
 */
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = ApplicationContext.getInstance();
		EntityManager entityManager = context.getEntityManager();

		UserDao dao = new UserDao(entityManager);

		User userEntity = new User("raidentrance ".concat(new Integer(new Random(100).nextInt()).toString()), "López");
		dao.create(userEntity);

		List<User> list = dao.findAll();
		for (User user : list) {
			System.out.println(user);
		}

		dao.close();
		context.closeEntityManager();
	}
}
