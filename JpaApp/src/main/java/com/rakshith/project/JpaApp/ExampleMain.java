package com.rakshith.project.JpaApp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ExampleMain {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");

	public static void main(String[] args) {
		try {
			findAllEmployeeEntities();
		} finally {
			entityManagerFactory.close();
		}
	}

	private static void findAllEmployeeEntities() {
		System.out.println("-- finding Person entities -  --");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		//em.createqUer
		TypedQuery<Department> query = em.createQuery("SELECT d FROM Department d", Department.class);
		//TypedQuery<Department> query = em.createQuery("SELECT * FROM DEPARTMENTS");
		List<Department> resultList = query.getResultList();
		resultList.forEach(System.out::println);
		em.close();
	}

}
