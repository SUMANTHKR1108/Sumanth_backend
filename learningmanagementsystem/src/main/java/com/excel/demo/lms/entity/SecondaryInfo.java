package com.excel.demo.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table (name="secondaryinfo")
public class SecondaryInfo {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer secondaryId;
	private String panNo;
	private Integer aadharNo;
	private String fatherName;
	private String mothername;
	private String spousename;
	private String passPortNo;
	private String maritalStatus;
		
}
