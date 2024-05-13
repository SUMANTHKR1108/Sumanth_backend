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

	public class NotificationTable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int NotificationId;
		private int UserId;
		private String Message;
		private String isRead;
		}


