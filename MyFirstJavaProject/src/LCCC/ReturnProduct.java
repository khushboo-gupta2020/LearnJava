package LCCC;
import java.util.*;



public class ReturnProduct
{
    public static void main(String[] args) 
    {
        boolean flag = false,res = false;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Array size");
        n = s.nextInt();
        if(n<0)
        {
            System.out.println(n +" is an invalid array size");
        }
        else
        {
        int a[] = new int[n];
        
         System.out.println("Array Elements  ");
             for(int i = 0; i < n; i++)
          {
            a[i] = s.nextInt();
            if(a[i]==0 || a[i]<0)
            {
                System.out.println(a[i] +" is an invalid array element");
                res = false;
            }
            else
            {  
                res = true;
                continue;
            }
          }   
            for(int k = 0; k<n ;k++)
            {
                  if(a[k]!=0 || a[k]>0)
                  {
                       for(int m = 0; m < n; m++)
                     {
                        for(int j = 2; j <= a[m]/2; ++j)
                         {
            
                            if(a[m] % j == 0)
                           {
                            flag = false;
                            break;
                           }
                        }
             
                      }
                     
                  }   
                       else
                  {
                      break;
                  }
               }
              
             if (!flag)
               {
                    
                    int mult=1;
                    for(int b = 0; b < n; b++)
                    {
                        mult= mult*a[b];
                    }
                    System.out.println(mult);
               }
               
                  else
                     {
                        System.out.println("No Element Found in");
                        for(int b = 0; b < n; b++)
                       {
                           System.out.print(a[b]+",");
                       }
                     }   
                  
                 
            }
                  
         
       
    }
}