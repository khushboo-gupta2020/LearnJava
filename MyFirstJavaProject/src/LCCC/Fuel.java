package LCCC;

import java.util.Scanner;

public class Fuel {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the no of liters to fill the tank");
		double  p= Double.parseDouble(s.next());
		if(p<=0)
		{
			System.out.println((int)p +" is an invalid input");
		return;
		}
		System.out.println("Enter the distance covered");
		double  d = Double.parseDouble(s.next());
		if(d<=0)
		{
			System.out.println((int)d +" is an invalid input");
			return;
		}
		System.out.println("Liters/100KM");
		double f =(p/d)*100;
		System.out.println(String.format("%.2f",f));
		System.out.println("Miles/gallons");
		double dm = d*0.6214;
		double lg= p*0.2642;
		double mg =dm/lg;
		System.out.println(String.format("%.2f",mg));
	}

}
