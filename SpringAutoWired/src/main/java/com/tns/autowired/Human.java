package com.tns.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;


public class Human 
{
	private Heart h;
	;
	// default constructor
	public Human() {
		
		this.h = h;
	}
	//constructor
	public Human(Heart h) {
		super();
		this.h = h;
	}


	// setters mathod
	@Autowired
	@Qualifier("o")
	public void setH(Heart h) {
		this.h = h;
	}


	public void dispaly()
	 {
		 h.pump();
		 System.out.println("The name of Animal is" +h.getNameOfAnimal()+"and No. of Heart is" +h.getNoOfHeart());
	 }

}
