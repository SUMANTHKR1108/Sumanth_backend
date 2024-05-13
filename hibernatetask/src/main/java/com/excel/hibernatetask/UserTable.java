package com.excel.hibernatetask;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 
	private int userid;
	private String username;
	private String email;
	private String password;
	private String bio;
	
}
