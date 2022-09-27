import java.util.*;
public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print((2*i-1)+" ");
		}

	}
}
