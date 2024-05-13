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

public class MessageTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int messageId;
	private int senderId;
	private int receverId;
	private String content;
	

}
