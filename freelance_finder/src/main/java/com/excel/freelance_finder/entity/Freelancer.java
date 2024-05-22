package com.excel.freelance_finder.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Freelancer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer freelancerId;
	private String firstName;
	private String lastName;
	private long phoneNo;
	private String email;
	private String gender;
	private LocalDate dateOfBirth;
	private String password;
	private String reEnterdPassword;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="freelancers")
	private List<Skills> skills;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="freelancers")
	private List<JobApplication> jobApplication;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "freelancer")
	private List<Message> message;
}
