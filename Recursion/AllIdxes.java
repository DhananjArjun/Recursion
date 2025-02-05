package Recursion;

import java.util.Scanner;

public class AllIdxes {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int []arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sn.nextInt();
        }

        int x = sn.nextInt();
        int []iarr = allIndices(arr,x,0,0);
        if(iarr.length == 0){
            System.out.println();
            return;
        }
        for (int i = 0; i < iarr.length ; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr,int x ,int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }

    }
}
