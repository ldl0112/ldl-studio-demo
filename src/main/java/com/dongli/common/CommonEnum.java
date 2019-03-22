package com.dongli.common;

public enum CommonEnum {

	LOGIN(1), LOGINOUT(2), REMOVE(3);
	private Integer value;
	private CommonEnum(int value) {
		this.value=value;
	}


	public Integer getValue() {
		return value;
	}


	public void setValue(Integer value) {
		this.value = value;
	}
	 

	
}
