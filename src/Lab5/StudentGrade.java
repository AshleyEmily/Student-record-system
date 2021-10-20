package Lab5;
import java.io.*;

public class StudentGrade implements Serializable{
	private Statistics stat;
	private Student stu;
	//constructors
	public StudentGrade()
	{
	}
	public StudentGrade(Student stu, Statistics stat)
	{
		this.stu = stu;
		this.stat = stat;
	}
	public void setStatistics(Statistics stat)
	{
		this.stat = stat;
	}
	public void setStudent(Student stu)
	{
		this.stu = stu;
	}
	public Statistics getStatistics()
	{
		return stat;
	}
	public Student getStudent()
	{
		return stu;
	}
	public void print()
	{
		System.out.printf("Student ID: %d\nScores:\t",this.getStudent().getSID());
		for (int i = 0; i < this.getStudent().getScores().length; i++)
		{
			System.out.printf("%d\t", this.getStudent().getScore(i));
		}
		this.getStatistics().print(4);
	}
}
//student and statistics variable private w/ getters and setters
//read the student 