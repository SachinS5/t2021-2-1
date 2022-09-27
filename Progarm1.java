import java.util.*;
public class Progarm1 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter a number:a=");
		double a=scan.nextDouble();
		System.out.println("Enter a number:b=");
		double b=scan.nextDouble();
		System.out.println("Enetr the type of Operation:add for Addition or sub for subtraction or mul for multiplication or div for division");
		String s1=scan.next();
		switch (s1) 
		{
		case "add":System.out.println("The Addition operation result is "+(a+b));
		break;
		case "sub":System.out.println("The subtraction operation result is "+(a-b));
		break;
		case "mul":System.out.println("The multiplication operation result is "+(a*b));
		break;
		case "div":System.out.println("The division operation result is "+(a/b));
		break;
		default:System.out.println("Invalid input !Try Again");
		}
	}
}
