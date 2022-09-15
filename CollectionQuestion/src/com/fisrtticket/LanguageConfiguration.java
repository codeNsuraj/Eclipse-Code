package com.fisrtticket;

//Problem statement 1 : Create a class for language configuration which contains {id,language code,language ,country}
public class LanguageConfiguration {
	private int id;
	private String language, country, code;
	public LanguageConfiguration(int id, String code, String language, String country) {
		this.id = id;
		this.language = language;
		this.country = country;
		this.code = code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}