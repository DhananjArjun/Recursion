package Recursion;

import java.util.Scanner;

public class targetSumSet {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        int n = sn.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sn.nextInt();
        }
        System.out.println("Enter the target");
        int tar= sn.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
    }
//set is the  subset
  //sos is the sum of subset
    //tar is the target
    public static void  printTargetSumSubsets(int []arr, int idx, String set, int sos , int tar){
       if(idx==arr.length)
       {
          if(sos==tar) {
              System.out.println(set+".");
          }
          return;
       }
        printTargetSumSubsets(arr,idx+1,set +arr[idx]+" , ",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set ,sos,tar);

    }
}
