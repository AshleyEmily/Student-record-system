package util;
import java.io.*;
import java.util.*;
import Lab5.Student;

public class Util {

	 public void readFile(String filename, Student [] stu) {
		int counter = 0;
		//Reads the file and builds student array.
		try {
		FileReader file = new FileReader(filename); 		//Open the file using FileReader Object.
		BufferedReader buff = new BufferedReader(file);
		boolean eof = false;
		String dummy = buff.readLine();						//get rid of the header line

		while (!eof)										//In a loop read a line using readLine method.
		{ 
			String line = buff.readLine();
			if (line == null)
				eof = true;
			else
			{
				//System.out.println(line);
				StringTokenizer st = new StringTokenizer(line);	//Tokenize each line using StringTokenizer Object
				while (st.hasMoreTokens() && counter <= 39) 
				{
					Student a = new Student();
					String id = st.nextToken();
					int tokens = st.countTokens();
					int SID = Integer.parseInt(id);			  //convert the string to an integer.
					a.setSID(SID);							  //set the id to the student object using the setID method.
				    int [] quizzes = new int [5];
					for (int i = 0; i < tokens; i++)				//another loop to go through all the quizzes.
					{
						String q = st.nextToken();
						int quiz = Integer.parseInt(q);			//Each token is converted from String to Integer using parseInt method
						quizzes[i] = quiz;
					}
					if (tokens < 5)
					{
						for (int i = tokens; i < 5; i++ )
						{
							quizzes[i] = -99;
						}
					}
					a.setScores(quizzes);
					stu[counter] = a;
				    counter++;
				}		
			}
		}
		buff.close();
		} 
		
		catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		if (counter == 0)
		{
			System.out.println("File is empty");
			stu[0]=null;
		}
	}
		





		
}
