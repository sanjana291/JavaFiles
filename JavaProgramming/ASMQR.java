package JavaProgramming;

import java.util.Scanner;

public class ASMQR 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the a value: ");
		a=obj.nextInt();
		System.out.println("Enter the b value: ");
		b=obj.nextInt();
		System.out.println("Sum of the two integer: "+(a+b));
		System.out.println("subraction of the two integer: "+(a-b));
		System.out.println("Multiplication of the two integer: "+(a*b));
		System.out.println("Quatiant of the two integer: "+(a/b));
		System.out.println("Remainder of the two integer: "+(a%b));
    }
    
}
