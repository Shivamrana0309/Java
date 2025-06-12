import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(10);
        // // list.add(67);
        // // list.add(89);
        // // list.add(45);
        // // list.add(23);
        // // list.add(12);
        // // list.add(67);
        Scanner in = new Scanner(System.in);
        // for(int i=0;i<5;++i){
        //     list.add(in.nextInt());
        // }
        // // System.out.println(list);
        // // list.set(0, 99);
        // // System.out.println(list);
        // // list.remove(2);
        // System.out.println(list);
        // for(int i=0;i<5;++i){
        //     System.out.print(list.get(i) + " "); //list[index] is not allowed in java
        // }

        // 2d ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<3;++i){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                list.get(i).add(in.nextInt());
            }
        }
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}