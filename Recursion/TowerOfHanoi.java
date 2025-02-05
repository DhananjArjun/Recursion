package Recursion;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int t1 = sn.nextInt();
        int t2 = sn.nextInt();
        int t3= sn.nextInt();
        toh(n,t1,t2,t3);


    }



    public static void toh(int n, int t1, int t2, int t3){
        if(n==0){
            return;}
        toh(n-1,t1,t3,t2);
        System.out.println(n+"["+ t1 +" -> "+ t2+"]");
        toh(n-1,t3,t2,t1);
    }
}
