package com.excel.hibernatetask.service;

import com.excel.hibernatetask.ProjectTable;

import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class ProjectTableRunner {

			public static void main(String[] args) {

					EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
					EntityManager em=emf.createEntityManager();
					EntityTransaction et=em.getTransaction();
					ProjectTable user=new ProjectTable();
					
					et.begin();
					et.commit();
}
}