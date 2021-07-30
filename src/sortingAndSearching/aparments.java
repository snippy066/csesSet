package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class aparments {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();

        int[] desi=new int[n];
        int[] rel=new int[m];

        for(int i=0;i<n;i++)    desi[i]=in.nextInt();
        for(int i=0;i<m;i++)    rel[i]=in.nextInt();

        Arrays.sort(desi);
        Arrays.sort(rel);

        int i=0,j=0,count=0;
        while(i<n && j<m){
            int diff=desi[i]-rel[j];

            if(Math.abs(diff)<=k){
                i++; j++; count++;
                //System.out.println("in loop");
            }
            else{
                if(diff>k)
                    j++;

                else
                    i++;

            }

        }

        System.out.println(count);
    }
}
