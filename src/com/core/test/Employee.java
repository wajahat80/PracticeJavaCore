package com.core.test;

public class Employee implements Cloneable  {
	String name = "";
	int id = 1;
	
	Employee(String name, int i){
		this.name = name;
		this.id = i;
	}
	
	void printEmployee(){
		System.out.println(this.id+"..."+this.name);
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
