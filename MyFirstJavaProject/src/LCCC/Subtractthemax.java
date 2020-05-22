package LCCC;

import java.util.Scanner;

public class Subtractthemax {

	 public static void main(String[] args) 
	    {
	        int n, max;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the size of an array:");
	        System.out.println(" ");
	        n = s.nextInt();
	        if(n<0)
	        {
	            System.out.println(n +" is an invalid size");
	            return;
	        }
	        
	        int a[] = new int[n];
	         
	        int b[] = new int[n];
	        
	        
	        if(n<3 || n>=20)
	        {
	             System.out.println(n +" is an invalid size");
	             return;
	        }
	        
	        else
	        {
	        System.out.println("Enter array elements: ");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        max = a[0];
	        for(int i = 0; i < n; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }
	         System.out.println(" ");
	         for(int j = 0; j < n; j++)
	         {
	             int res = max - a[j];
	             b[j] = res;
	            
	             
	         }
	         
	       
	         for(int j = 0; j < n; j++)
	         {
	           
	            System.out.println(+ b[j]);
	             
	         }
	         
	       } 
	    }
	}

