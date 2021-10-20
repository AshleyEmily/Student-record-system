package util;
import java.io.*;
import java.util.*;

import Lab5.*;

public class FileIO {

	public StudentGrade [] buildSGA(Student [] s1, Statistics s2) {
		StudentGrade sga[] = new StudentGrade[40];
		s2.findlow(s1);
		s2.findhigh(s1);
		s2.findavg(s1);
		
		for (int i = 0; i < sga.length; i++)
		{
			StudentGrade sg = new StudentGrade(s1[i], s2);
			sga[i] = sg;
		}
		return sga;
		
	}
	public void serializeStudGrade(StudentGrade [] s1)
	{
		for (int i = 0; i < s1.length && s1[i]!=null; i++)
		{
			try {
				//get student id from student object inside studentgrade
				int SID = s1[i].getStudent().getSID();
				Integer.toString(SID);
				ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(SID + ".ser"));
				fout.writeObject(s1[i]);
				fout.close();
			}
			catch(IOException e)
			{
				System.out.print("Error: " + e);
		        System.exit(1);
			}
		}
	}
	public StudentGrade deserializeStudentGrade(int sid) {
		//return StudentGrade or null, if sid is not found.
		//should know how to deal with this using exceptions.
		StudentGrade studgrade = new StudentGrade();
		try {
			Integer.toString(sid);
			ObjectInputStream in =  new ObjectInputStream(new FileInputStream(sid + ".ser"));
			studgrade = (StudentGrade)in.readObject();
			in.close();
		}
		catch(Exception e)

	      {  System.out.print("Error: " + e);

	        // System.exit(1);
	      studgrade = null;

	      }
			return studgrade;
				      
	}

}
