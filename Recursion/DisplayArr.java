package Recursion;
import java.util.Scanner ;
public class DisplayArr {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sn.nextInt();
        }

//        displayArr(arr,0);
        displayReverseArr(arr,0);
    }
//Ex-> fun 0 idx se last indx tk print kr dega       [10 20 30 40 ]
    //Faith idx+1 se last tk print kr dega             [ 40 30 20 10 ]
//    public static void displayArr(int [] arr,int idx) {
//        if(idx == arr.length){
//            return;
//        }
//        System.out.print(arr[idx]+" ");
//        displayArr(arr,idx+1);
//
//
//
//    }

    public static void displayReverseArr(int []arr,int idx) {

if(idx==arr.length){
    return;
}

        displayReverseArr(arr,idx+1);
        System.out.println(arr[idx]);


    }
}
