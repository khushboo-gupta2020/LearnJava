package LCCC;

import java.util.Scanner;

public class PostPaid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int call = s.nextInt();
			 if(call <0)
		{
			System.out.println(call +" is an invalid input");
			return;
		}
		else if(call >1000)
		{
			System.out.println(call +" exceeds the maximum limit");
			return;
		}
		System.out.println("Enter the number of SMS:");
		int SMS = s.nextInt();
		if(SMS <0)
		{
			System.out.println(SMS +" is an invalid input");
			return;
		}
		else if(SMS >1000)
		{
			System.out.println(SMS +" exceeds the maximum limit");
			return;
		}
		int Extracall =0 ;
		int ExtraSMS =0;
		double callcharge ;
		double smscharge;
		 if (call > 100)
		{
		 Extracall = call - 100;
		}
		 if (SMS > 100)
		{
			ExtraSMS = SMS - 100;
		}
		 
		 callcharge = Extracall * 1.5;
         smscharge = ExtraSMS * 0.5;
        double Total = 150 + callcharge + smscharge ;
        double servicecharge = (5.5/100)* Total;
        Total = Total + servicecharge;
        System.out.println("Amount to be paid is Rs." + String.format("%.2f", Total));
        
	}

}
