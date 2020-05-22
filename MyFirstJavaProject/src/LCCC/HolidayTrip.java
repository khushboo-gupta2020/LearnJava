package LCCC;

import java.util.Scanner;

public class HolidayTrip {

	public static void main(String[] args)
	{
		System.out.println("Enter the flight name");
		Scanner s= new Scanner(System.in);
		String flight = s.nextLine();
		System.out.println("Enter the class");
		String flightclass = s.nextLine();
		System.out.println("Enter the number of seats");
	    double  seats = s.nextInt();
		System.out.println("Card Payment");
		String card = s.next();
		Double price = 0.0;
		if(flight.equals("Air India"))
		{
		
			if(flightclass.equals("Travel class") && card.equals("Y") )
			{
				price = (3200*seats)-(3200 * seats *(10.5/100));
			}
			 else if(flightclass.equals("Travel class") && card.equals("N") )
			{
				price = 3200 * seats;
			}
			 else if(flightclass.equals("Economy class") && card.equals("Y"))
			{
				price = (6950*seats)-(6950 * seats *(10.5/100));
			}
			 else if(flightclass.equals("Economy class") && card.equals("N"))
			{
				price = 6950 * seats;
			}
			 else if(flightclass.equals("Business class") && card.equals("Y"))
				{
					price = (10340*seats)-(10340 * seats *(10.5/100));
				}
			else if(flightclass.equals("Business class") && card.equals("N"))
				{
					price = 10340 * seats;
				}
				
		}
		else if(flight.equals("Spice Jet"))
		{
			if(flightclass.equals("Travel class") && card =="Y")
			{
				price = (3450*seats)-(3450 * seats *(7.5/100));
			}
			 else if(flightclass.equals("Travel class") && card.equals("N"))
			{
				price = 3450 * seats;
			}
			 else if(flightclass.equals("Economy class") && card.equals("Y"))
			{
				price = (7945*seats)-(7945 * seats *(7.5/100));
			}
			 else if(flightclass.equals("Economy class") && card.equals("N"))
			{
				price = 7945 * seats;
			}
			 else if(flightclass.equals("Business class") && card.equals("Y"))
				{
					price = (9500*seats)-(9500 * seats *(7.5/100));
				}
			else if(flightclass.equals("Business class") && card.equals("N"))
				{
					price = 9500 * seats;
				}
				
		}
		else if(flight.equals("Go Air"))
		{
			if(flightclass.equals("Travel class") && card.equals("Y"))
			{
				price = (3300*seats)-(3300 * seats *(9.5/100));
			}
			 else if(flightclass.equals("Travel class") && card.equals("N"))
			{
				price = 3300 * seats;
			}
			 else if(flightclass.equals("Economy class") && card.equals("Y"))
			{
				price = (7250*seats)-(7250 * seats *(9.5/100));
			}
			 else if(flightclass.equals("Economy class") && card.equals("N"))
			{
				price = 7250 * seats;
			}
			 else if(flightclass.equals("Business class") && card.equals("Y"))
				{
					price = (9890*seats)-(9890 * seats *(9.5/100));
				}
			else if(flightclass.equals("Business class" )&& card.equals("N"))
				{
					price = 9890 * seats;
				}
				
		}
		else if(flight.equals("IndiGo"))
		{
			if(flightclass.equals("Travel class" )&& card ==("Y"))
			{
				price = (3490*seats)-(3490 * seats *(8.5/100));
			}
			 else if(flightclass.equals("Travel class") && card.equals("N"))
			{
				price = 3490 * seats;
			}
			 else if(flightclass.equals("Economy class") && card.equals("Y"))
			{
				price = (7560*seats)-(7560 * seats *(8.5/100));
			}
			 else if(flightclass.equals("Economy class") && card.equals("N"))
			{
				price = 7560 * seats;
			}
			 else if(flightclass.equals("Business class") && card.equals("Y"))
				{
					price = (9990*seats)-(9990 * seats *(8.5/100));
				}
			else if(flightclass.equals("Business class") && card.equals("N"))
				{
					price = 9990 * seats;
				}
				
		}

		if(flight.equals("IndiGo") || flight.equals("Spice Jet"))
		{
			if(seats >5)
			{
				System.out.print(price);
				int d = (int)(price*0.1);
				System.out.print(d);
				price = price - d;
			}
			
			else if(seats >10)
				price = price -((int)Math.round(price)*(15/100));
		}
		int p =(int)Math.round(price);
		System.out.print(p);
		
	}

}
