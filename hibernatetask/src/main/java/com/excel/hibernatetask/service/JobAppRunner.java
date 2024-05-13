package com.excel.hibernatetask.service;

	import com.excel.hibernatetask.JobAppTable;


	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class JobAppRunner {

			public static void main(String[] args) {

					EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
					EntityManager em=emf.createEntityManager();
					EntityTransaction et=em.getTransaction();
					JobAppTable user=new JobAppTable();
					
					et.begin();
					et.commit();
}
}