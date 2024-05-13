package com.excel.hibernatetask.service;

import com.excel.hibernatetask.UserSkill;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserSkillRunner {

		public static void main(String[] args) {

				EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
				EntityManager em=emf.createEntityManager();
				EntityTransaction et=em.getTransaction();
				UserSkill user=new UserSkill();
				
				et.begin();
				et.commit();

}

}

