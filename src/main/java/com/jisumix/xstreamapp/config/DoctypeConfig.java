package com.jisumix.xstreamapp.config;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("config")
public class DoctypeConfig {
	@XStreamAsAttribute
	private String type;
	
	@XStreamAsAttribute
	private String roottag;
	
	@XStreamAlias("stylesheets")
	private List<Stylesheet> stylesheets;
	
	private TechwebXslt techwebXslt;

	private DtConfig dtConfig;
	
	
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoottag() {
		return roottag;
	}

	public void setRoottag(String roottag) {
		this.roottag = roottag;
	}

	public List<Stylesheet> getStylesheets() {
		return stylesheets;
	}

	public void setStylesheets(List<Stylesheet> stylesheets) {
		this.stylesheets = stylesheets;
	}

	public TechwebXslt getTechwebXslt() {
		return techwebXslt;
	}

	public void setTechwebXslt(TechwebXslt techwebXslt) {
		this.techwebXslt = techwebXslt;
	}

	public DtConfig getDtConfig() {
		return dtConfig;
	}

	public void setDtConfig(DtConfig dtConfig) {
		this.dtConfig = dtConfig;
	}
}


