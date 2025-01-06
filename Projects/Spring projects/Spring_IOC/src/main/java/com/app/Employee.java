package com.app;

public class Employee {
	private int id;
	private String name;
	private Address adr;
	
	public Employee() {
	}

	public Employee(int id, String name, Address adr ) {
		super();
		this.id = id;
		this.name = name;
		this.adr = adr;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr( Address adr ) {
		this.adr = adr;
	}
}
