
import java.util.Scanner;

public class Conditionals_and_loops {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if(boolean expression : T or F){
                //body
            }
            else if(boolean expression : T or F){
                //body
            }
            else{
                //body
            }
         */
        // Print n is odd or even
        Scanner in = new Scanner(System.in);
        // int n= in.nextInt();
        // if(n%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
        // in.close();
        /*
            Syntax for loops:
            for(initialisatrion; condition ; increment/decrement){
                //body
            }
         */
        //Print numbers from 1 to 5
        // for(int num=1;num<=5;++num){
        //     System.out.print(num+" ");
        // }
        /*
            Syntax for while loops:
            while(condition){
                //body
            }
         */
        // int num =1;
        // while(num<6){
        //     System.out.print(num+" ");
        //     num++;
        // }
        // use while loop when we don't know how many times the loop will run
        // use for loop when we know how many times the loop will run
        /*
            Syntax for do-while loops:
            In this loop the program executes atleast once , then the condition is evaluated
            do{
                //body
            } while(condition)
         */
        // Print largest of three numbers
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // int maxm=a;
        // if(b>maxm){
        //     maxm=b;
        // }
        // if (c>maxm){
        //     maxm=c;
        // }
        // System.out.println(maxm);
        // //Determine the case of the alphabet
        // char ch = in.next().trim().charAt(0);
        // //trim() -> it removes the extra space from the word 
        // if (ch>='A' && ch<='Z'){
        //     System.out.println("Uppercase");
        // }
        // else{
        //     System.out.println("Lowercase");
        // }
        // int num1=0;
        // int num2=1;
        // int nth =in.nextInt();
        // while(nth-2>0){
        //     int temp=num1+num2;
        //     num1=num2;
        //     num2=temp;
        //     nth--;
        // }
        // System.out.println(num2);
        // Count Occurrences of 0
        // int num = in.nextInt();
        // int count=0;
        // while(num>0){
        //     int d=num%10;
        //     if(d==0) count++;
        //     num/=10;
        // }
        // System.out.println(count);
        //Reverse a number
        int num = in.nextInt();
        int ans=0;
        while(num>0){
            int d=num%10;
            ans=ans*10+d;
            num/=10;
        }
        System.out.println(ans);
        in.close();
    }
}
