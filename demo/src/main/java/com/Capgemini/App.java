package com.Capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student1 s = new Student1();
        
        //s.setaid(101);
        s.setAid(101);
        s.setAname("Onkar");
        s.setSchoolname("Jain_High_School");
        //s.setSchoolname("Jain High School");
        //I want to store all this data in myDataBase.
        
        Session
        save(s);
        
        
    }
}
