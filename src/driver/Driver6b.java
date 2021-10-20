package driver;

import java.util.*;

import Lab5.*;
import util.*;

public class Driver6b {
	public static void main(String [] args) {
		Student lab5 [] = new Student[40];

		//Populate the student array
		Util u = new Util(); 
		u.readFile("studentrecords.txt", lab5);
	/*	for (int i = 0; i < lab5.length; i++)
		{
			lab5[i].print();
		}*/
		Statistics stat = new Statistics();
		FileIO file = new FileIO();
		file.serializeStudGrade(file.buildSGA(lab5, stat));
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student ID to search for: ");
		String id = in.next();
		int SID = Integer.parseInt(id);			  //convert the string to an integer.
		StudentGrade found = file.deserializeStudentGrade(SID);		
		if (found != null) {
		found.print();
		}
	}

}
