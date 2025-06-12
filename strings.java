// import java.util.Arrays;

// import java.util.ArrayList;

public class strings {
    public static void main(String[] args) {
        // String name = "Shivam"; // case sensitive -> use "String"
        // String is a class in Java
        // String pool -> separate memory structure inside a heap : makes a program more optimised
        // Strings are immutable for this reason as well as for security
        // System.out.println(name);

        // Comparsion of strings:
        // 1. == method -> comparator , checks if ref variable are pointing to the same object
        // to create a new object of same value use "new" keyword;
        // 2. .equals() method -> When we only need to check value we should use this method

        // String a = "Rana";
        // String b = "Rana";
        // System.out.println(a==b); // true -> ref variable pointing object is checked , whether same or not!!

        // String c="Rana";
        // String d= new String("Rana"); // new object of same value is created usinf "new" keyword
        // System.out.println(c==d); // false -> d points to new object of same value
        // System.out.println(a.equals(b)); // true -> only value is checked

        // char ch= d[0] -> not possible : wrong
        // char ch = d.charAt(0); -> possible : right
        // System.out.println(ch);

        // String[] args -> command line arguments

        // Arrays.to String(array_name); -> method converts array into string : inbuilt function
        // we can make our own toString() method -> method overriding
        // int[] arr ={1,2,3,4,5};
        // String array= Arrays.toString(arr);
        // System.out.println(array );
        // System.out.println(array.charAt(0));

        // Pretty Printing -> to egt formatted prints
        // float a = 453.1274f;
        // System.out.printf("%.2f",a); // -> prints upto two decimal places : also rounds off
        // System.out.println();
        // System.out.printf("%.3f",Math.PI);
        // System.out.println();
        // System.out.printf("Hello my name is %s and i am %s","shivam","Cool");

        // Operators
        // System.out.println('a'+'b'); // -> adds the ascii value of both the characters and returns their ascii value 
        // System.out.println("a"+"b"); // -> concatenates two strings
        // System.out.println((char)('a'+3)); // ->returns the char after adding the ascii value with the integer
        // System.out.println("a"+1); // -> this addition returns a string concatenating the first string with the integer
        // // Here integer will be converted to Integer that will call toString() : same as "a"+"1"
        // System.out.println("Shivam"+ new ArrayList<>(0));
        // java call the toString method and concatenates when one of the operand for "+" operator is string
        // operator overloading is not supported in Java

        // String Performance
        // String s="";
        // for(int i=0;i<26;++i){
        //     char ch =(char)('a' + i);
        //     // System.out.println(ch);
        //     s=s+ch; // s+=ch -> this operation has O(n) T.C.
        //     // because it creates a new string again and again for performing this operation
        //     // StringBuilder comes here in the picture
        // }
        // System.out.println(s);

        // // StringBuilder -> it is like a string in cpp in which we can append something in the end in O(1) T.C.
        // StringBuilder s=new StringBuilder();
        // for(int i=0;i<26;++i){
        //     char ch=(char)('a'+i);
        //     s.append(ch);
        // }
        // System.out.println(s);
        // // s[0] -> not allowed
        // // s.charAt(0) -> is allowed

        // String Methods -> all functions for strings
        // these do not change the original string but creates a new string for it

        // Check palindrome
        String s="Shivam";
        String a="nitin";
        System.out.println(check(s));
        System.out.println(check(a));
    }

    static boolean check(String s){ // function to check palindrome
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
