package com.excel.hibernatetask.service;



import com.excel.hibernatetask.MessageTable;

import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class MessageRunner {

			public static void main(String[] args) {

					EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
					EntityManager em=emf.createEntityManager();
					EntityTransaction et=em.getTransaction();
					MessageTable user=new MessageTable();
					
					et.begin();
					et.commit();
}
}
