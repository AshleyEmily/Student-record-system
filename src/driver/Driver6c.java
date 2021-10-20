package driver;
import adapter.*;
import java.util.*;

public class Driver6c extends StudentAPIImpl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StudentAPIImpl s1;
		Driver6c a1 = new Driver6c();
		s1 = a1;
		System.out.println("Enter Student ID to search for: ");
		String id = in.next();
		int SID = Integer.parseInt(id);	
		s1.printStudentScore(SID);
		s1.printStatistics();
		
		}
}
