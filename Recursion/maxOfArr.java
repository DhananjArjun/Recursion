package Recursion;

import java.util.Scanner;

public class maxOfArr {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }
        int max= maxOfArray(arr,0);
        System.out.println(max);

    }

    public static int maxOfArray(int []arr, int idx){

        if(arr[idx]==arr.length-1){
            return arr[idx]; //last element k liye wahi max h
        }
        int misa = maxOfArray(arr,idx+1);
        if(misa>arr[idx])
            return misa;
        else
          return  arr[idx];
    }
}
