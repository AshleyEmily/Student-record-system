package driver;
import java.io.*;
import java.util.*;

import Lab5.*;
import exception.*;
import util.*;

public class Driver6a {
	public boolean test(Student [] lab5) throws StudentGradingException{
		
		for (int i = 0; i<lab5.length && lab5[i]!= null; i++)
		{
			for (int x = 0; x < 5; x++)
			{
				if (lab5[i].getScore(x) == -99)
				{
					throw new StudentGradingException("Error. Missing score(s) for student " +lab5[i].getSID()+ " !", i, x);
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		boolean problemFixed = false;
		//System.out.println("Inside main");
		Student lab5 [] = new Student[40];
		Util u = new Util(); 
		u.readFile("studentrecords-missing.txt", lab5);
		do {
			try { 
				Driver6a p = new Driver6a();
				problemFixed = p.test(lab5);
			}
			catch(StudentGradingException e)
			{
				e.fixProblemReadFromConsole(lab5);
			}
		}while(problemFixed == false);
		
		if (lab5[0] != null)
		{
			for (int i = 0; i < lab5.length && lab5[i]!= null; i++)
			{
				lab5[i].print();
			}
		}
		}

}



