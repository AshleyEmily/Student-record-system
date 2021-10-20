package Lab5;
import java.io.*;

public class Student implements Serializable{

	private int SID;

	private int scores[] = new int[5];

	//public get and set methods for
	public Student()
	{
		SID = 0;
		scores = null;
	}
	
	public Student(int SID, int sc[])
	{
		this.SID = SID;
		scores = sc;
	}

	
	//SID and scores
	public void setSID (int SID)
	{
		this.SID = SID;
	}
	
	public int getSID()
	{
		return this.SID;
	}
	
	public void setScores(int sc[])
	{
		scores = sc;
	}
	public void setScore(int i, int sc)
	{
		scores[i] = sc;
	}
	public int getScore(int i)
	{
		return this.scores[i];
	}
	public int [] getScores ()
	{
		return scores;
	}
	//print values of instance variables.
	public void print()
	{
		System.out.printf("Student ID: %d\nScores:\t",SID);
		for (int i = 0; i < scores.length; i++)
		{
			System.out.printf("%d\t", scores[i]);
		}
		System.out.println("\n");
	}
}
