package LCCC;

import java.util.Scanner;

public class Username3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE");
		int c = s.nextInt();
		System.out.println("Enter the no of students placed in ECE");
		int e = s.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		int m = s.nextInt();
		if (c >=0 && e>=0 && m >=0)
		{
			if (( c == 0 && e ==0 && m ==0)||(c == e && c==m && e ==m)) {

				System.out.println("None of the department has got the highest placement");
			}
			else if(c > e && c > m)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
			}
			else if(e > c && e > m)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
			}
			else if(m > c && m > e)
			{
				System.out.println("Highest placement");
				System.out.println("MECH");
			}
			else if(c == e && c > m)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("ECE");
			}
			else if(e == m && e > c)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
				System.out.println("MECH");
			}
			else if(c == m && m > e)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("MECH");
			}
		}
		else 
		{
			System.out.println("Input is invalid");
		}
	
		
		
	}

}
