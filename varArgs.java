import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2,4,53,64,57,68,8,24);
        sum(1,2);
        sum(1,2,3);
        sum(1.2f,34.5f);
        System.out.println(isprime(31));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // here int ...v is passed as an array ,so array of intergers is passed!
    // varArgs should always come to an end

    // method overloading -> two or more functions of same name can exist with parameters being different

    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void sum(float a,float b){
        System.out.println(a+b);
    }

    // detemine whether prime or not
    static boolean isprime(int n){
        for(int i=2;i*i<=n;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

