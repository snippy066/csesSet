import java.util.*;
import java.io.*;

public class permutation {
    public static void main(String ar[]) throws IOException{
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(in.readLine());
      if(n==1)
          System.out.println(n);
      else if(n==2 || n==3)
          System.out.println("NO SOLUTION");
      else{
          int[] even =new int[n];
          int[] odd=new int[n];

          int x=0,y=0;
          int val=6;
          while(val<=n){
              even[x++]=val;
              val+=2;
          }
          val=5;
          while(val<=n){
              odd[y++]=val;
              val+=2;
          }
            StringBuilder sb=new StringBuilder();
          for(int i=0;i<x;i++)
              sb.append(even[i]+" ");
          sb.append("2 4 1 3 ");
          for(int i=0;i<y;i++)
              sb.append(odd[i]+" ");

          System.out.println(sb);
      }

    }
}
