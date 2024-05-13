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

public class JobAppTable {
	@Id 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int ApplId;
	private int jobId;
	private int frelencerId;
	private String coverLetter;
	private String status;
	private String applied_at;

}
