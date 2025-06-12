import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        // syntax
        // data_type[] variable_name = new datatype[size];
        // array objects in java may not be continuous because of heap memory.
        // indices start from 0.
        // new keyword -> used to create an object.
        // int[] arr = {1,2,3,5,6}; -> another way to define array
        int size =5;
        int[] arr = new int[size]; // all elements are 0 by default
        // accessing an element of an array - same as cpp
        arr[0]=1;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<size;++i){
            arr[i]=in.nextInt();
        }
        // for(int i=0;i<size;++i){
        //     System.out.print(arr[i]+" ");
        // }
        // for-each loop in java , we cannot use auto keyword as in cpp
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // toString() -> makes the array a string.
        String[] str = new String[5];
        for(int i=0;i<5;++i){
            str[i]=in.next();
        }
        // arrays are mutable in java when we pass them in the function,strings are immutable
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
