package exception;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

import Lab5.Student;
import util.Util;

import java.io.*;

public class StudentGradingException extends Exception implements Serializable{
	
		private int errorno;
		private int errorid;
		private String errormsg;

		
		public StudentGradingException() {
			super();
			printmyproblem();
		}
		
		public StudentGradingException(String errormsg, int errorid, int errorno) {
			super();
			this.errormsg = errormsg;
			this.errorno = errorno;
			this.errorid = errorid;
			printmyproblem();
		}
		
		public int getErrorno() {
			return errorno;
		}
		
		public void setErrorno(int errorno) {
			this.errorno = errorno;
		}
		public int getErrorid() {
			return errorid;
		}
		
		public void setErrorid(int errorid) {
			this.errorid = errorid;
		}
		
		public String getErrormsg() {
			return errormsg;
		}
		
		public void setErrormsg(String errormsg) {
			this.errormsg = errormsg;
		}
		
		public void printmyproblem(){
			try {
				FileWriter out = new FileWriter("Exceptions.txt", true);
				//prints local date and time
				LocalDateTime date = LocalDateTime.now();
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    String formattedDate = date.format(myFormatObj);
				out.write(formattedDate + "\t");
				//prints error message
			    out.write(this.errormsg);
			    out.write("\n");
			    out.close();
			}
			catch(Exception e) {
			System.out.print("Error: " + e);
		    System.exit(1);
		   }
			
		}

		public void fixProblemReadFromConsole(Student [] lab5)
		{
			Scanner in = new Scanner(System.in); 
			int i = this.errorid;
			int x = this.errorno;
			System.out.println("Student " + lab5[i].getSID() + " - Enter the score: ");
			lab5[i].setScore(x, in.nextInt());
		}
	}


//create exception that when expecting 5 quiz scores but you get 4, enter 5th value using custom exception method to prompt data from user
//print method adding exceptions into text file
//exceptions to fix: missing a header
