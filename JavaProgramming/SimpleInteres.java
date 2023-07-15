package JavaProgramming;
import java.util.Scanner;
public class SimpleInteres 
{
    public static void main(String[] args)
    {
        System.out.println("Simple Interest Calculation");
        int p,r,t,a;
        Scanner x=new Scanner(System.in);
        System.out.print("Enter Intial Principal Balance :");
        p=x.nextInt();
        System.out.print("Enter Annual Inerest Rate :");
        r=x.nextInt();
        System.out.print("Enter Time(in Years) :");
        t=x.nextInt();
        a=p*(1+(r*t));
        System.out.println("Final Amoount in Simple Interst :"+a);
    }
    
}
