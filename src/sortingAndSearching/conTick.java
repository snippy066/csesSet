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
            int ind=lowerBnd(price,max[i]);
            if(ind==m) sb.append("-1\n");
            else {
                sb.append(price[ind] + "\n");
                price[ind]=-1;
            }
        }
    }
    static int lowerBnd(int[] arr,int val){
        int temp=0,l=0,r=arr.length;
        while(l<r){
            int m=(l+r)/2;

            if(arr[m]>=val)
                r=m;
            else
                l=m+1;
        }
        return r;
    }
}
