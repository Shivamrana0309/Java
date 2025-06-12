
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("\nOperations:");
            System.out.println("1.Addition(+) \n2.Subtraction(-) \n3.Multiplication(*) \n4.Division(/) \n5.Remainder(%) \n6.Exit(X or x)");
            System.out.print("\nEnter operation symbol: ");
            char ch=in.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='%'||ch=='*'||ch=='/'){
                System.out.print("\nEnter first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter second number: ");
                int num2 = in.nextInt();
                System.out.print("\nResult: ");
                if(ch=='+'){
                    System.out.println(num1+num2);
                }
                else if(ch=='-'){
                    System.out.println(num1-num2);
                }
                else if(ch=='*'){
                    System.out.println(num1*num2);
                }
                else if(ch=='/'){
                    System.out.println(num1/num2);
                }
                else if(ch=='%'){
                    System.out.println(num1%num2);
                }
            }
            else if(ch == 'X' || ch =='x'){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("invalid Input");
            }
        }
        in.close();
    }
}
