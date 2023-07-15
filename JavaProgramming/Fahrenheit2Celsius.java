package JavaProgramming;
import java.util.Scanner;
public class Fahrenheit2Celsius 
{
    public static void main(String[] args)
    {
        float f,c;
        Scanner x= new Scanner(System.in);
        System.out.print("Enter the Fahrenheit:");
        f=x.nextFloat();
        c=((f-32)*(5/9));
        System.out.print("Celsius: ");
        System.out.print(c); System.out.print("\u00B0C");
    }
    
}
