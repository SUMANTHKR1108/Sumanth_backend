package com.excel.demo.lms.entity;

import java.time.LocalDate;

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
@Table (name="educationaldetails")
public class EducationDetails {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer educatonId;
	private String educationType;
	private LocalDate yearOfpassing;
	private Integer perecentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;

}