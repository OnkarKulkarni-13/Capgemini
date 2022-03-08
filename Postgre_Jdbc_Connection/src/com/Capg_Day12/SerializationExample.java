package com.Capg_Day12;

import java.io.*;

class Student implements Serializable{  
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	}  

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{    
			 
			  Student s1 =new Student(01,"ABC");    
			     
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			 
			  out.close();    
			  System.out.println("success");    
			  }
		catch(Exception e)
		{
			System.out.println(e);
			} 

	}

}