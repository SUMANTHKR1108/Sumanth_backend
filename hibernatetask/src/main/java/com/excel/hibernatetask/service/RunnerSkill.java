package com.excel.hibernatetask.service;

		import com.excel.hibernatetask.SkillsTable;

import jakarta.persistence.EntityManager;
		import jakarta.persistence.EntityManagerFactory;
		import jakarta.persistence.EntityTransaction;
		import jakarta.persistence.Persistence;

		public class RunnerSkill {

			public static void main(String[] args) {

					EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
					EntityManager em=emf.createEntityManager();
					EntityTransaction et=em.getTransaction();
					SkillsTable user=new SkillsTable();
					
					et.begin();
					et.commit();

	}

}
