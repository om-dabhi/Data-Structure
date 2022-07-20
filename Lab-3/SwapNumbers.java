/*
 Write a program to swap two numbers using user-defines method
 */
import java.util.Scanner;
public class SwapNumbers{
    int x, y;

    public void swapNumber() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A:");
		int n1=sc.nextInt();
		System.out.println("Enter Number B:");
		int n2=sc.nextInt();
        SwapNumbers obj1 = new SwapNumbers();
        obj1.x = n1;
        obj1.y = n2;
        System.out.println("Before swap");
        System.out.println(" Value of A: " + obj1.x + " Value of B : " + obj1.y);
        obj1.swapNumber();
        System.out.println("After swap");
        System.out.println(" Value of A: " + obj1.x + " Value of B : " + obj1.y);
    }
}