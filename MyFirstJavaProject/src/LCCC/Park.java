package LCCC;

import java.util.Scanner;

public class Park {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("B1");
		int b1 = s.nextInt();
		if(b1<0)
		{
			System.out.println(b1 +" is not a valid input");
			return;
		}
		System.out.println("B2");
		int b2 = s.nextInt();
		if(b2<0)
		{
			System.out.println(b2 +" is not a valid input");
			return;
		}
		System.out.println("B3");
		int b3 = s.nextInt();
		if(b3<0)
		{
			System.out.println(b3 +" is not a valid input");
			return;
		}
		System.out.println("B4");
		int b4 = s.nextInt();
		if(b4<0)
		{
			System.out.println(b4 +" is not a valid input");
			return;
		}
		System.out.println("Car count");
		int cc = s.nextInt();
		if(cc > (b1+b2+b3+b4))
		{
			System.out.println("Parking slots in full");
			return;
		}
		else if (cc <=b1)
		{
			System.out.println("The car can be parked at B1");
		}
		else if (cc <=(b1 +b2))
		{
			System.out.println("The car can be parked at B2");
		}
		else if (cc <=(b1+b2+b3))
		{
			System.out.println("The car can be parked at B3");
		}
		else if (cc <=(b1+b2+b3+b4))
		{
			System.out.println("The car can be parked at B4");
		}

	}

}
