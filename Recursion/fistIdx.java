package Recursion;

import java.util.Scanner;

public class fistIdx {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sn.nextInt();
        int fi= ftIdx(arr,0,x);
        System.out.println(fi);
    }
    public static int ftIdx(int []arr, int idx,int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
           int fiisa = ftIdx(arr,idx+1,x);
          return  fiisa;
        }
    }
}
