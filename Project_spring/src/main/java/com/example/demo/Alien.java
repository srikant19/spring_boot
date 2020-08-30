package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //object created only once automatically 
@Scope(value = "prototype") //will not create instance by default , denote class as component
public class Alien {

	private int aid;
	private String aname;
	private String tech;
	
	
	public Alien() {
		super();
		System.out.println("object created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
}
