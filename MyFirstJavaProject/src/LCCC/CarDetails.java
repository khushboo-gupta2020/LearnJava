package LCCC;

import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the car name:");
		String carname= s.next();
		System.out.println("Enter the car no:");
		String carno= s.next();
		System.out.println("Enter the price:");
		double  price=Double.parseDouble(s.next());
		System.out.println("Car name:" +carname);
		System.out.println("Car no:"+carno);
		System.out.println("Price:" +String.format("%.2f",price)+" rs only");
	}

}
