//Write a program to determine if an input character string is of the form aib
//i where i >= 1 i.e. 
//Number of ‘a’ should be equal to number of ‘b’.
import java.util.Scanner;
public class StrCountAB{
public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String :");
    String s = sc.nextLine();
    int counta=0;
    int countb=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='a')
        {
            counta++;
        }
        else if(s.charAt(i)=='b')
        {
            countb++;
        }
    }
    if(counta== countb)
    {
        System.out.println("Valid String");
    }
    else
    {
        System.out.println("Invalid String");
    }
}
}