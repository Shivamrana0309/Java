import java.util.Arrays;
import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        // int[][] arr = new int[3][]; -> is also correct
        // int[][] arr = new int[][3]; -> is also correct
        Scanner in = new Scanner(System.in);
        // it is stored in heap memory as array of arrays
        for(int i=0;i<3;++i){
            arr[i] = new int[3];
            for(int j=0;j<3;++j){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
