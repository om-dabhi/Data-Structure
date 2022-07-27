// public Implement a program for stack that performs following operations using array: PUSH, POP, PEEP, CHANGE & DISPLAY 
import java.util.Scanner;

public class StackDemo {

    int[] arr;
    int top = -1;

    public void setSize(int i) {
        arr = new int[i];
    }

    public void push(int x) {
        if (top >= arr.length) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public void display() {
        for (int j = 0; j <= top; j++) {
            System.out.print("[" + arr[j] + "]" + " ");
        }
        System.out.println();
    }

    public int pop() {
        if (top <= -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            top--;
            return arr[top + 1];
        }
    }

    public int peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top - i + 1];
        }
    }

    public void change(int i, int x) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
        } else {
            arr[top - i + 1] = x;
        }
    }

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int count=1;
        int ch;
        System.out.println("Enter the size of an Array ");
        int a = sc.nextInt();
        StackDemo stack = new StackDemo();
        stack.setSize(a);
        do
        {
            System.out.println("Enter your Choice :");
            System.out.println("Press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Peep");
            System.out.println("Press 4 for Change");
            System.out.println("Press 5 for Display");
            System.out.println("Press 6 for Exit !");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter n :");
                stack.push(sc.nextInt());
                break;

                case 2:
                int temp = stack.pop();
                System.out.println(temp);
                break;

                case 3:
                System.out.print("Enter i :");
                temp = stack.peep(sc.nextInt());
                System.out.println(temp);
                break;

                case 4:
                System.out.print("Enter i :");
                int i = sc.nextInt();
                System.out.print("Enter n :");
                int n = sc.nextInt();
                stack.change(i, n);
                break;

                case 5:
                stack.display();
                break;

                case 6:
                System.out.println("You Selected Exit");
                break;

                default:
                System.out.println("Some Error Occurr!");
                break;
            }
        }while(ch!=6);
    }
}
    



