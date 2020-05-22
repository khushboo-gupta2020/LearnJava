package LCCC;

import java.util.*;

public class Main
{
    public static void main(String[] args)
  
  {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the Customer Id");
     int CId = s.nextInt();
     if (CId <=0)
     {
    	 System.out.println(CId +" is not a valid Customer Id");
    	 return;
     }
     System.out.println("Enter the Bill amount");
     double  BId=Double.parseDouble(s.next());
    //int BId= s.nextInt();
     double price =0.0;
     if (BId <=0)
     {
    	 System.out.println((int)BId +" is not a valid Bill Amount");
    	 return;
     }
     else if(BId <1000)
     {
    	 System.out.println("Total Price is " +String.format("%.2f",BId));
     }
     else
     {
     
     if(CId >=1 && CId <=100)
     {
      price = BId - ((15.0/100)*BId ); 
       
     }
     else if(CId >=101 && CId <=250)
     {
        price = BId - ((18.0/100)*BId );
     }
     else if(CId >=251 && CId <=500)
     {
        price = BId - ((23.0/100)*BId );
     }
     else if(CId >=501 && CId <=1000)
     {
        price = BId - ((28.0/100)*BId );
     }
     else if(CId >=1001)
     {
        price = BId - ((32.0/100)*BId );
     }
     System.out.println("Total Price is " +String.format("%.2f",price));
     }
     
    
     
     
   
 }

}