package com.jisumix.xstreamapp.config;

import java.util.List;

public class TechSuiteConfig {
	private String type;

	private List<Property> props;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Property> getProps() {
		return props;
	}

	public void setProps(List<Property> props) {
		this.props = props;
	}
}
