package Lab5;
import java.io.*;

public class Statistics implements Serializable {

	private int [] lowscores = new int [5];

	private int [] highscores = new int [5];

	private float [] avgscores = new float [5];

	public void findlow(Student [] a) {
		
		/* This method will find the lowest score and store it in an   array names lowscores. */
		for (int x = 0; x < lowscores.length; x++)
		{
			int lowest = a[0].getScore(x);
			for (int i = 0; i < a.length && a[i]!= null; i++)
			{
				if (lowest > a[i].getScore(x))
				{
					lowest = a[i].getScore(x);
				}
				else
				{
					continue;
				}
			}
		lowscores[x] = lowest;
		}
	}
	public void findhigh(Student [] a) {

		/* This method will find the highest score and store it in an     array names highscores. */
		
		for (int x = 0; x < highscores.length; x++)
		{
			int highest = a[0].getScore(x);
			for (int i = 0; i < a.length && a[i]!= null; i++)
			{
				if (highest < a[i].getScore(x))
				{
					highest = a[i].getScore(x);
				}
				else
				{
					continue;
				}
			}
		highscores[x] = highest;
		}
		}

		public void findavg(Student [] a) {

		/* This method will find avg score for each quiz and store it in an array names avgscores. */
			for (int x = 0; x < avgscores.length; x++)
			{
				int total = 0;
				int students = 0;
				for (int i = 0; i < a.length && a[i]!= null; i++)
				{
					total += a[i].getScore(x);
					students++;
				}
			avgscores[x]= total/students; 
			}
		}

		
		//method to print values of instance variables.
		public void print(int opt)
		{
			switch (opt)
			{
			case 1: {
				System.out.printf("%15s", "High Scores: ");
				for (int i = 0; i < highscores.length ; i++)
				{ 
					System.out.printf("%d\t", highscores[i]);
				}
				break;
			}
			case 2: {
				System.out.printf("\n%15s", "Low Scores: ");
				for (int i = 0; i < lowscores.length ; i++)
				{
					System.out.printf("%d\t", lowscores[i]);
				}
				break;
			}
			case 3:{
				System.out.printf("\n%15s", "Average: ");
				for (int i = 0; i < avgscores.length ; i++)
				{
					System.out.printf("%.1f\t", avgscores[i]);
				}
				break;
				
			}
			case 4:{
				System.out.println("\nAll Statistics: ");
				this.print(1);
				this.print(2);
				this.print(3);
				break;
			}
			default:
			{
				System.out.println("Input Error! Enter either 1, 2, 3, or 4");
				break;
			}
		}
				
	}

}
	
