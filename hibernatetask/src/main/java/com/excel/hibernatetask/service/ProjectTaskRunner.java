package com.excel.hibernatetask.service;


import com.excel.hibernatetask.ProjectTaskTable;

import jakarta.persistence.EntityManager;
		import jakarta.persistence.EntityManagerFactory;
		import jakarta.persistence.EntityTransaction;
		import jakarta.persistence.Persistence;

		public class ProjectTaskRunner {

				public static void main(String[] args) {

						EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
						EntityManager em=emf.createEntityManager();
						EntityTransaction et=em.getTransaction();
						ProjectTaskTable user=new ProjectTaskTable();
						
						et.begin();
						et.commit();
	}
	
}
