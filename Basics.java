import java.util.Scanner;

public class Basics
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number to Add: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number to Add: ");
        int num2= input.nextInt();

        int sum =num1+num2;
        System.out.print("Sum = " + sum);
        input.close();
    }
}