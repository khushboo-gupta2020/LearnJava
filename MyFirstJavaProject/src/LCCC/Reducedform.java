package LCCC;

import java.util.*;

public class Reducedform
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        n = s.nextInt();
        if(n<0)
        {
            System.out.println(n +" is an invalid array size");
            return;   
        }
        
        int a[] = new int[n];
        int c[] = new int[n];
        
        if(n<5 || n>10)
        {
            System.out.println(n +" is an invalid array size");
            return;
        }
        else
        {
                    System.out.println("Array Elements  ");
                                   for(int i = 0; i < n; i++)
                                    {
                                       a[i] = c[i]= s.nextInt();
                                           
                                    } 
        }
        
                        
        
                           for (int i = 0; i < n-1; i++)
                           {
                                     for (int j = 0; j < n-i-1; j++)
                                     {
                                                 if (a[j] > a[j+1])
                                               {
                                                         
                                                         
                                                         int temp = a[j];
                                                         a[j] = a[j+1];
                                                         a[j+1] = temp;
                                                         
                                                }
                                      }
                           }
                           
                          
                           
                           
                           for(int m = 0 ; m < n ;m++)
                           {
                              
                               for(int p = 0 ; p < n ;p++)
                               {
                                    
                                   if(a[m]==c[p])
                                   {
                                       System.out.print(p +" ");
                                   }
                                   else
                                   {
                                      
                                      continue;
                                   }
                               }
                           }       
                           
    }
}    