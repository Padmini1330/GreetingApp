package com.bridgelabz.model;

public class Greeting 
{
	private long id;
	private String name;
	
	public Greeting(long incrementAndGet, String name) 
	{
		setId(incrementAndGet);
		setName(name);
	}
	
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	

}
