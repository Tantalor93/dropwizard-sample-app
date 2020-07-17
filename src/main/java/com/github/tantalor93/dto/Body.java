package com.github.tantalor93.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body {

	@JsonProperty
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
