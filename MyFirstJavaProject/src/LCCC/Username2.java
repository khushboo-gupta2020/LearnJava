package LCCC;

import java.util.Scanner;

public class Username2 {

	public static void main(String[] args) {
		System.out.println("Enter the no of pizzas bought");
		Scanner s= new Scanner(System.in);
		int pizza= s.nextInt();
		System.out.println("Enter the no of puffs bought");
		int puffs= s.nextInt();
		System.out.println("Enter the no of cool drinks bought");
		int drinks= s.nextInt();
		System.out.println("Bill Details");
		System.out.println("No of pizzas");
		System.out.println(pizza);
		System.out.println("No of puffs");
		System.out.println(puffs);
		System.out.println("No of cool drinks");
		System.out.println(drinks);
		System.out.println("Total price");
		System.out.println(pizza*100 + puffs *20 +drinks *10 );
		System.out.println("ENJOY THE SHOW!!!");

	}

}
