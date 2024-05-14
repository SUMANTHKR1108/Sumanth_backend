package com.excel.hibernatetask;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
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

	public class ProjectTaskTable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@OneToOne
		private ProjectTable projects;
		
		private int deadline;
		private String description;
}
