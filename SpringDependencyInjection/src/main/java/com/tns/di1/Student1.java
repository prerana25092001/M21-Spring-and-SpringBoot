package com.tns.di1;

public class Student1 
{
	//dependency in the form of object
	Cheat c;
	
	public void setC(Cheat c) {
		this.c = c;
	}

	public void cheating()
	{
		c.mathCheat();
	}

	
	
	

}
