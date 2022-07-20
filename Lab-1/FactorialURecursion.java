//Write a program to find factorial of a number. (Using Recursion)
import java.util.Scanner;
class FactorialURecursion{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int i,f;
		Factorial fc=new Factorial();
		f=fc.fact(n);

		System.out.println("Factorial of Given Number is "+f);		
	}
}

class Factorial
{
		int fact(int n)
		{
			if(n==1)
			{
				return 1;
			}
			else
			{
				return(fact(n-1)*n);
			}
		}
}