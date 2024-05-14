package com.excel.hibernatetask;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserTable {
 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private int userid;
	private String username;
	private String email;
	private String password;
	private String bio;
	
	@OneToMany(mappedBy = "users" )
	private List< SkillsTable>skills;
	
	@OneToMany(mappedBy = "users" )
	private List<JobPostingTable> jobs;
	
	@OneToMany(mappedBy = "user" )
	private List<MessageTable>messages;
	
	@OneToMany(mappedBy = "users" )
	private List<MessageTable>recevers;
	
	@OneToMany(mappedBy = "user" )
	private List<ProjectTable>projects;
	
	@OneToMany(mappedBy = "users" )
	private List<NotificationTable>notifications;
}
