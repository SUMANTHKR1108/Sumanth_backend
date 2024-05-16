package com.excel.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AddressType {
	
	CURRENT("CURRENT"),PERMANENT("PERMANENT");
	private final String addressType;

}
