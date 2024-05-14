package com.excel.hibernatetask;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class JobAppTable {
	@Id 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int ApplId;
	@OneToMany
	private List<JobPostingTable> applications ;
	@OneToOne
	private UserTable users;
	private String coverLetter;
	private String status;
	private String applied_at;

}
