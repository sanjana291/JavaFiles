package JavaProgramming;

import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args)
    {
        int a,b,c,h;
        Scanner x = new Scanner(System.in) ;
        System.out.println("Enter three sides value of triangle");
        System.out.print("side 1:");
        a=x.nextInt();
        System.out.print("side 2:");
        c=x.nextInt();
        System.out.print("base :");
        b=x.nextInt();
        System.out.println("Perimeter of the Triangle: "+(a+b+c));
        System.out.print("Enter the Height of the Triangle to calculate Area of the triangle: ");
        h=x.nextInt();
        System.out.println("Area of the Triangle:"+(h*b/2));
    }
    
}
