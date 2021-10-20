package adapter;

import java.io.*;
import util.*;
import Lab5.Statistics;
import Lab5.Student;
import Lab5.StudentGrade;

public abstract class StudentAPIImpl implements StudentAPI{
	//In the constructor of StudentAPIImpl - load text file, compute statistics, 
	//create StudentGrade array (using method from FileIO) and serialize StudentGradeArray
	public StudentAPIImpl() {
		//call method from file IO
		//Statistics class to compute
		Student lab5 [] = new Student[40];
		Util u = new Util(); 
		u.readFile("lab5input.txt", lab5);
		Statistics stat = new Statistics();
		FileIO file = new FileIO();
		file.serializeStudGrade(file.buildSGA(lab5, stat));
	} 
	
	 public void printStudentScore(int sid) {
			//read the serialized file and print the score. - use studentid as filename.
		 StudentGrade studgrade = new StudentGrade();
		 try {
				Integer.toString(sid);
				ObjectInputStream in =  new ObjectInputStream(new FileInputStream(sid + ".ser"));
				studgrade = (StudentGrade)in.readObject();
				in.close();
			}
			catch(Exception e)

		      {  System.out.print("Error: " + e);

		         System.exit(1);

		      }					      
			studgrade.getStudent().print();
					 
	}
	 	
	public void printStatistics(){
			//read any serialized file and print the value for statistics (is same in all files)
		 StudentGrade studgrade = new StudentGrade();
		 try {
				ObjectInputStream in =  new ObjectInputStream(new FileInputStream("1234.ser"));
				studgrade = (StudentGrade)in.readObject();
				in.close();
			}
			catch(Exception e)

		      {  System.out.print("Error: " + e);

		         System.exit(1);

		      }					      
			studgrade.getStatistics().print(4);
	}

}
