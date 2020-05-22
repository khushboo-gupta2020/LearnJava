package LCCC;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a <=0)
		{
			System.out.println(a +"is an Invalid Length");
			return;
		}
		int b = s.nextInt();
		 if(b <=0)
		{
			System.out.println(b +"is an Invalid Length");
			return;
		}
		int c = s.nextInt();
		 if(c <=0)
		{
			System.out.println(c +"is an Invalid Length");
			return;
		}
		 	if(a == b && a ==c && b ==c)
		 	{ 
		 		System.out.println(a +"," + b+ ","  + c +" are the sides of Equilateral Triangle");
		 	}
		 	else if((a == b && a !=c  ) || (b!=a && b==c ) || (a!=b && a==c ) )
		 	{ 
		 		System.out.println(a +"," + b+ ","  + c +" are the sides of Isosceles Triangle");
		 	}
		 	else if(a != b && a != c  && b!=c)
		 	{ 
		 		System.out.println(a +"," + b+ ","  + c +" are the sides of Scalene  Triangle");
		 	}
		 	
	}

}
