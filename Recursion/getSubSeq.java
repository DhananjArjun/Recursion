package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubSeq {
    public static void main(String[] args) {
     Scanner sn = new Scanner(System.in);
     String str = sn.next();
     ArrayList<String> res = gss(str);
        System.out.println(res);
    }
//
    public static ArrayList<String> gss(String str) {
      if(str.length()==0)
      { ArrayList<String> base_res = new ArrayList<>();
          base_res.add("");
          return base_res;

      }
     char ch = str.charAt(0); //a
     String s = str.substring(1); //bc
     ArrayList<String> re_res = gss(s);
        ArrayList<String> my_res =new ArrayList<>();
        for (String rstr: re_res) {
          my_res.add(""+rstr);
          my_res.add(ch+rstr);
        }
    return my_res;

    }
}
