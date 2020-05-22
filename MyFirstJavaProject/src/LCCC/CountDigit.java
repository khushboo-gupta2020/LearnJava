package LCCC;

import java.util.Scanner;

public class CountDigit {
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		int count1 =countDigits(n);
		if(n<0) {
			System.out.println(n+ " falls behind the limit");
			return;
		}
		else if(count1 > 9)
		{
			System.out.println(n+ " exceeds the limit");
			return;
		
		}
		else if(count1 <= 1 )
		{
			System.out.println(n+ " falls behind the limit");
			return;
		}
		long d = s.nextLong();
		int count2 =countDigits(d);
		if(d<0) {
			System.out.println(d+ " falls behind the limit");
			return;
		}
		else if(count2 >= 2 )
		{
			System.out.println(d+ " is not valid");
			return;
		}
		
		int cO=countOccurrances(n,d);
		if(cO ==0)
		{
			System.out.printf("%d is not available in %d",d,n);
			return;
		}
		else
		{
			System.out.printf("Count of %d in %d is %d",d,n,cO); 
			return;
		}
		

	}
	
	static int countOccurrances(long n, long d) 
	{ 
	int countO = 0; 
	while (n > 0)  
	{ 
		countO = (n % 10 == d) ?  
				countO + 1 : countO; 
	n = n / 10; 
	} 
	return countO; 
	} 
	static int countDigits(long n) 
    { 
        int countD=0;
        while (n != 0) { 
            n = n / 10; 
            ++countD; 
        } 
        return countD; 
    }


}
