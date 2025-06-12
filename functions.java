
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // DRY - don't repeat yourself -> method for functions
        // take input of two numbers and print the sum
        // to his problem multiple times we need a function 
        // in java functions are called methods
        // static -> doesn't depend on the object
        // to get a value from the function we return some data_type such as int/float/string
        // to do not return a value we use void
        sum();
        int a=10,b=15;
        swap(a, b); // in java there is only pass by value because it does not have pointers
        // in java primitive datatypes are pass by value but objects and complex datatypes are pass by value with ref of the object hence they are changed
        // strings are immutable in java!
        String name = "shivam";
        // name.trim().charAt(0)='b'; -> not possible
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        in.close();
    }

    /*
        access modifier return_type name( parameters ){
            //body
            return statement;
        }
     */
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum is "+ sum);
        in.close();
    }

    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
    }
}
