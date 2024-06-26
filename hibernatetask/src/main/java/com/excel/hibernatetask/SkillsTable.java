package com.excel.hibernatetask;

import jakarta.persistence.Column;
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
public class SkillsTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int skillId;
	@ManyToOne
	private UserTable users;


private String name;

}
