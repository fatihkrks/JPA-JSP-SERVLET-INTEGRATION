package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtility {

	private EntityManagerUtility() {

	}

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("my-persistence-unit");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();

	}
}
