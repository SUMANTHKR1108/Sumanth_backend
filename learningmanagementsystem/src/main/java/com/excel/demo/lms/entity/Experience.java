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

@Getter@Setter@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder@Table(name="experience")
public class Experience {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer expId;
	private String companyName;
	private LocalDate yearOfexperience;
	private LocalDate dateOfjoining;
	private LocalDate dateofRelieving;
	private String designation;
	private String location;
}
