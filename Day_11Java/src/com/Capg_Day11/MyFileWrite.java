package com.Capg_Day11;
import java.io.FileWriter;
import java.io.File;

public class MyFileWrite {
	public static void main(String[] args) {
		try {
			String str = "Hello Onkar, Good Morning\n";
			String str1 = "Hello java\n";
		FileWriter filewriter = new FileWriter("D://text.txt");
		filewriter.write(str);
		filewriter.write(str1);
		filewriter.write(56);
		filewriter.close();      // It is compulsory to Close the file which we have opened to write
		                         // else it will throws an error.
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Process Finished");
	}

}
