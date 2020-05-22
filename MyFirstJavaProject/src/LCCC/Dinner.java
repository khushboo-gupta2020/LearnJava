package LCCC;

import java.util.Scanner;

public class Dinner {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
    	System.out.println("Enter the day interval of Sam");
    	int n1 = s.nextInt();
        int lcm;
        System.out.println("Enter the day interval of Riya");
    	int n2 = s.nextInt();
    	if(n1<=0 || n2<=0) {
    	System.out.printf("%d to %d is not a valid interval" , n1,n2);
    	return;}
    	
    	 lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("Sam and Riya will have their dinner on day %d", lcm);
                break;
            }
            ++lcm;
        }
    }
}
