//Write a program to find factorial of a number.(Using Loop)
import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int fact=1;
		if(n<=0)
			{
				System.out.println("Not Found");
			}
			else{
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of Given Number is "+fact);
			}
		
	}
}