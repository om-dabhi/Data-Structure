//Write a program to check whether a number is prime or not.
import java.util.*;
public class Prime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int flag=0;

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("The Given Number is Prime!");
		}
		else
		{
			System.out.println("The Given Number is Not Prime!");
		}
	}
}