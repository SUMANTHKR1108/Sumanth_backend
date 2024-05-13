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

	public class ProjectTaskTable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int TaskId;
		private int ProjectId;
		private int deadline;
		private String description;
}
