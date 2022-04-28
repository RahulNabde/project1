import java.io.*;
import java.util.Scanner;
class Perfect{
    public static void main(String[]args)
    {
      System.out.println("Enter the no to check:");
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      System.out.println("Enter last Number:");
      Scanner s1=new Scanner(System.in);
      int n2=s1.nextInt();
     int c=0;
     
      for(int i=n1;i<=n2;i++)
     {
          int sum=0;
          
         for(int j=1;j<i;j++)
        {
        if(i%j==0)
         
         sum=sum+j;
         
        
        }
     
       
      if(sum==i)
        { 
          System.out.println("Perfect Numbers are:"+i);
          c=c+i;
        }
        
        
      
    }
   System.out.println("The addition of perfect number is:"+c);   
 }
}