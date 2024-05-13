package com.excel.hibernatetask.service;

	import com.excel.hibernatetask.JobPostingTable;

	import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class JobPostingRunner {

			public static void main(String[] args) {

					EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
					EntityManager em=emf.createEntityManager();
					EntityTransaction et=em.getTransaction();
					JobPostingTable user=new JobPostingTable();
					
					et.begin();
					et.commit();
}
}
