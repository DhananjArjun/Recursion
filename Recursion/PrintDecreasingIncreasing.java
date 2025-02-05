package Recursion;
import java.util.*;

public class PrintDecreasingIncreasing {
    public static void main(String[] args)throws Exception {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
       int f = fac( n);
        System.out.println(f);


    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
         int facn1= fac(n-1);
         int fac = n * facn1;
         return fac ;

    }
}
