package com.jisumix.xstreamapp.config;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class TechwebXslt {
	@XStreamAsAttribute
	private String type;
	
	@XStreamAsAttribute
	private String value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
