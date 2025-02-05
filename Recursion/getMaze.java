package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMaze {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        int col = sn.nextInt();

        ArrayList<String>  paths = getMazePaths(1,1,row,col);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc , int dr, int dc)
    {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
      ArrayList<String> horipath = new ArrayList<>();
      ArrayList<String> verpath =new ArrayList<>();
      if(sc<dc) {
          horipath= getMazePaths(sr,sc+1,dr, dc);

      }
      if(sr<dr){
          verpath = getMazePaths(sr+1,sc,dr, dc);

      }
        ArrayList<String> paths = new ArrayList<>();
        for (String path : horipath) {
          paths.add("h" + path) ;
        }
        for (String path : verpath) {
            paths.add("v" + path) ;
        }
        return paths;

    }

}
