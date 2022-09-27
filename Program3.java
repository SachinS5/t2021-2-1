import java.util.*;
public class Program3
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		if (n%2==0)
		{
			for(int i=1;i<=n-1;i++)
			{
				System.out.print((2*i-1)+" ");
			}
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print((2*i-1)+" ");
			}
		}
	} 
}
