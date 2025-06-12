import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      int num = input.nextFloat(); --> not possible
// because we cannot convert large files into small files without external type conversion! 
//      float num = input.nextInt(); --> possible
// we can convert small files into large files using internal tyepcasting!
//      External TypeConversion:
//          int num = (int)(input.nextFloat());
//  Automatic type promotion in expressions:
        int a= 257;
        byte b =(byte)(a); // is equal to 1 as byte can only store upto 256 so it will store 257 % 256
        System.out.println(b);
        int num = 'A';
        System.out.println(num);
        input.close();
    }
}
