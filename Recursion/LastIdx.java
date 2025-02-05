package Recursion;

import java.util.Scanner;

public class LastIdx {
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
        int li= ltIdx(arr,0,x);
        System.out.println(li);
    }
    public static int ltIdx(int []arr, int idx,int x) {
          if(arr[idx]==arr.length){
              return -1;
          }
        int liisa = ltIdx(arr,idx+1,x);
        if(liisa ==-1){
            if(arr[idx]==x){
                return idx;
            }
            else
                return -1;
        }
        else
            return liisa;
    }
}
