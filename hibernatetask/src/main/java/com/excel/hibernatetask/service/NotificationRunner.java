package com.excel.hibernatetask.service;

	import com.excel.hibernatetask.NotificationTable;

	import jakarta.persistence.EntityManager;
			import jakarta.persistence.EntityManagerFactory;
			import jakarta.persistence.EntityTransaction;
			import jakarta.persistence.Persistence;

			public class NotificationRunner {

					public static void main(String[] args) {

							EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
							EntityManager em=emf.createEntityManager();
							EntityTransaction et=em.getTransaction();
							NotificationTable user=new NotificationTable();
							
							et.begin();
							et.commit();
		}
		
	}

