import java.util.*;
public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int []ar=new int [9];
		for(int i=0;i<=ar.length-1;i++)
		{
			ar[i]=i+1;
		}
		
		System.out.println("Enter the number of integer ");
		int num=scan.nextInt();
		int []arr=new int[num];
		
		System.out.println("Enter any "+num+" integers");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for (int j=0;j<=ar.length-1;j++)
		{
			int count=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]%ar[j]==0)
				{
					count++;
				}	
			}
			System.out.print(ar[j]+":"+count+" ");
		}
	}
}
