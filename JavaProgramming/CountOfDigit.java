package JavaProgramming;

import java.util.Scanner;

public class CountOfDigit 
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int n,a,count=0;
        System.out.println("Enter the integer: ");
        n=x.nextInt();
        while(n!=0)
        {
            a=n/10;
            count++;
            n=a;
        }
        System.out.println("Count of the Digit: "+count);
    }
    
}
