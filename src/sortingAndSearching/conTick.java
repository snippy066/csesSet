//package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class conTick {
    static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();

        int price[]=new int[n];
        int max[]=new int[m];

        String[] s1=in.nextLine().split(" ");
        String [] s2=in.nextLine().split(" ");

        for(int i=0;i<n;i++) price[i] = Integer.parseInt(s1[i]);
        for(int i=0;i<m;i++) max[i] = Integer.parseInt(s2[i]);

        Arrays.sort(price);

        for(int i=0;i<m;i++){
            lowerBnd(price,)
        }
    }
}
