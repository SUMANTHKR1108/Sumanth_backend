package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AccountType {
	SAVINGACCOUNT("SAVINGACCOUNT"),PERSNOLAACCOUNT("PERSNOLACCOUNT"),JOINTACCOUNT("JOINTACCOUNT");
	private final String accountType;

}
