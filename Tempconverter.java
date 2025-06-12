import java.util.Scanner;

public class Tempconverter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose scale of temp for converison: Celsius or Fahrenheit ?");
        System.out.print("Enter your choice: ");
        String choice = input.next();
        float result = 0;
        if(choice.equals("Celsius")){
            System.out.print("Enter temp in Fahrenheit: ");
            float tempf = input.nextFloat();
            result = (tempf-32)*(5.0f/9);
        }
        else if(choice.equals("Fahrenheit")){
            System.out.print("Enter temp in Celsius: ");
            float tempc = input.nextFloat();
            result = (tempc*(9.0f/5))+32;
        }
        else {
            System.out.println("Invalid choice!");
        }
        System.out.println("Temp is "+ result);
        input.close();
    }
}