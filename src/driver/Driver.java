package driver;
import Lab5.*;
import util.*;
import java.util.Scanner;

public class Driver {

public static void main(String [] args) {

		Student lab5 [] = new Student[40];

		//Populate the student array
		Util u = new Util(); 
		u.readFile("lab5input.txt", lab5);

		Statistics statlab5 = new Statistics();

		
		//Print the data and statistics
		if (lab5[0] != null)
		{
			for (int i = 0; i < lab5.length && lab5[i]!= null; i++)
			{
				lab5[i].print();
			}
			statlab5.findlow(lab5);
			statlab5.findhigh(lab5);
			statlab5.findavg(lab5);
			Scanner in = new Scanner(System.in);
			System.out.println("Statistics Options: \n(1) View High Scores\n(2) View Low Scores\n(3) View Average Scores\n(4) View all\n");
			System.out.println("Enter the option number: ");
			int opt = in.nextInt();
			statlab5.print(opt);
		}
		


	}
}


/* TEST CASES:

*CASE 1: Empty file with header*

File is empty

*************************************************************
*CASE 2: 1 record with header*

Student ID: 1234
Scores:	52	7	100	78	34	

Statistics Options: 
(1) View High Scores
(2) View Low Scores
(3) View Average Scores
(4) View all

Enter the option number: 
4
All Statistics: 
  High Scores: 52	7	100	78	34	
   Low Scores: 52	7	100	78	34	
      Average: 52.0	7.0	100.0	78.0	34.0	

*************************************************************

*CASE 3: 15 records with header*

Student ID: 1234
Scores:	52	7	100	78	34	

Student ID: 2134
Scores:	90	36	90	77	30	

Student ID: 3124
Scores:	100	45	20	90	70	

Student ID: 4532
Scores:	11	17	81	32	77	

Student ID: 5678
Scores:	20	12	45	78	34	

Student ID: 6134
Scores:	34	80	55	78	45	

Student ID: 7874
Scores:	60	100	56	78	78	

Student ID: 8026
Scores:	70	10	66	78	56	

Student ID: 9893
Scores:	34	9	77	78	20	

Student ID: 1947
Scores:	45	40	88	78	55	

Student ID: 2877
Scores:	55	50	99	78	80	

Student ID: 3189
Scores:	22	70	100	78	77	

Student ID: 4602
Scores:	89	50	91	78	60	

Student ID: 5405
Scores:	11	11	0	78	10	

Student ID: 6999
Scores:	0	98	89	78	20	

Statistics Options: 
(1) View High Scores
(2) View Low Scores
(3) View Average Scores
(4) View all

Enter the option number: 
4

All Statistics: 
  High Scores: 100	100	100	90	80	
   Low Scores: 0	7	0	32	10	
      Average: 46.0	42.0	70.0	75.0	49.0	

*************************************************************

*CASE 4: 40 records with header*
Student ID: 1234
Scores:	52	7	100	78	34	

Student ID: 2134
Scores:	90	36	90	77	30	

Student ID: 3124
Scores:	100	45	20	90	70	

Student ID: 4532
Scores:	11	17	81	32	77	

Student ID: 5678
Scores:	20	12	45	78	34	

Student ID: 6134
Scores:	34	80	55	78	45	

Student ID: 7874
Scores:	60	100	56	78	78	

Student ID: 8026
Scores:	70	10	66	78	56	

Student ID: 9893
Scores:	34	9	77	78	20	

Student ID: 1947
Scores:	45	40	88	78	55	

Student ID: 2877
Scores:	55	50	99	78	80	

Student ID: 3189
Scores:	22	70	100	78	77	

Student ID: 4602
Scores:	89	50	91	78	60	

Student ID: 5405
Scores:	11	11	0	78	10	

Student ID: 6999
Scores:	0	98	89	78	20	

Student ID: 1236
Scores:	60	80	100	75	34	

Student ID: 2136
Scores:	97	36	98	77	36	

Student ID: 3126
Scores:	100	44	20	89	70	

Student ID: 4534
Scores:	11	17	79	32	75	

Student ID: 5680
Scores:	60	32	45	78	34	

Student ID: 6136
Scores:	54	80	55	78	45	

Student ID: 7876
Scores:	60	100	56	74	78	

Student ID: 8028
Scores:	70	12	68	78	56	

Student ID: 9895
Scores:	34	9	77	74	20	

Student ID: 1949
Scores:	45	40	88	78	55	

Student ID: 2879
Scores:	55	50	99	74	80	

Student ID: 3191
Scores:	22	77	100	78	78	

Student ID: 4604
Scores:	90	50	97	74	60	

Student ID: 5407
Scores:	11	11	0	78	16	

Student ID: 7001
Scores:	9	98	89	74	24	

Student ID: 1239
Scores:	60	80	100	75	34	

Student ID: 2139
Scores:	97	26	98	77	36	

Student ID: 3129
Scores:	90	44	20	89	70	

Student ID: 4537
Scores:	15	17	79	37	75	

Student ID: 5683
Scores:	60	32	65	78	34	

Student ID: 6139
Scores:	54	80	87	78	45	

Student ID: 7879
Scores:	60	9	56	74	78	

Student ID: 8031
Scores:	70	12	68	78	56	

Student ID: 9898
Scores:	34	9	77	74	20	

Statistics Options: 
(1) View High Scores
(2) View Low Scores
(3) View Average Scores
(4) View all

Enter the option number: 
4

All Statistics: 
  High Scores: 100	100	100	90	80	
   Low Scores: 0	7	0	32	10	
      Average: 51.0	43.0	71.0	74.0	50.0	
 
*************************************************************
*CASE 5: 42 records with header*

Student ID: 1234
Scores:	52	7	100	78	34	

Student ID: 2134
Scores:	90	36	90	77	30	

Student ID: 3124
Scores:	100	45	20	90	70	

Student ID: 4532
Scores:	11	17	81	32	77	

Student ID: 5678
Scores:	20	12	45	78	34	

Student ID: 6134
Scores:	34	80	55	78	45	

Student ID: 7874
Scores:	60	100	56	78	78	

Student ID: 8026
Scores:	70	10	66	78	56	

Student ID: 9893
Scores:	34	9	77	78	20	

Student ID: 1947
Scores:	45	40	88	78	55	

Student ID: 2877
Scores:	55	50	99	78	80	

Student ID: 3189
Scores:	22	70	100	78	77	

Student ID: 4602
Scores:	89	50	91	78	60	

Student ID: 5405
Scores:	11	11	0	78	10	

Student ID: 6999
Scores:	0	98	89	78	20	

Student ID: 1236
Scores:	60	80	100	75	34	

Student ID: 2136
Scores:	97	36	98	77	36	

Student ID: 3126
Scores:	100	44	20	89	70	

Student ID: 4534
Scores:	11	17	79	32	75	

Student ID: 5680
Scores:	60	32	45	78	34	

Student ID: 6136
Scores:	54	80	55	78	45	

Student ID: 7876
Scores:	60	100	56	74	78	

Student ID: 8028
Scores:	70	12	68	78	56	

Student ID: 9895
Scores:	34	9	77	74	20	

Student ID: 1949
Scores:	45	40	88	78	55	

Student ID: 2879
Scores:	55	50	99	74	80	

Student ID: 3191
Scores:	22	77	100	78	78	

Student ID: 4604
Scores:	90	50	97	74	60	

Student ID: 5407
Scores:	11	11	0	78	16	

Student ID: 7001
Scores:	9	98	89	74	24	

Student ID: 1239
Scores:	60	80	100	75	34	

Student ID: 2139
Scores:	97	26	98	77	36	

Student ID: 3129
Scores:	90	44	20	89	70	

Student ID: 4537
Scores:	15	17	79	37	75	

Student ID: 5683
Scores:	60	32	65	78	34	

Student ID: 6139
Scores:	54	80	87	78	45	

Student ID: 7879
Scores:	60	9	56	74	78	

Student ID: 8031
Scores:	70	12	68	78	56	

Student ID: 9898
Scores:	34	9	77	74	20	

Student ID: 1951
Scores:	45	70	88	78	55	

Statistics Options: 
(1) View High Scores
(2) View Low Scores
(3) View Average Scores
(4) View all

Enter the option number: 
4

All Statistics: 
  High Scores: 100	100	100	90	80	
   Low Scores: 0	7	0	32	10	
      Average: 51.0	43.0	71.0	74.0	50.0	

*/