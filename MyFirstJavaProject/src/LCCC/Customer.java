package LCCC;

import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String pername= s.nextLine();
		System.out.println("Enter age:");
		String age= s.nextLine();
		System.out.println("Enter gender:");
		//double  price=Double.parseDouble(s.next());
		String gender= s.nextLine();
		System.out.println("Hailing from:");
		String place= s.nextLine();
		System.out.println("Welcome, " +pername);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+place);
		//System.out.println("Price:" +String.format("%.2f",price)+" rs only");

	}

}