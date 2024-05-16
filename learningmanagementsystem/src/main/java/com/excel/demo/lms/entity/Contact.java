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

@Getter@Setter@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer contactId;
	private String contactType;
	private Long contactNumber;
	
}
