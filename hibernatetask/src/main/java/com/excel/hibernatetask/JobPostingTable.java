package com.excel.hibernatetask;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobPostingTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private int jobId;
	@ManyToOne
	private UserTable users;
	private String title;
	private String description;
	private String skillsRequerd;
	private int budget ;
	@ManyToOne
	private JobAppTable jobposting;
	

}
