//package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class ferrisWheel {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int x=in.nextInt();

        in.nextLine();
        String [] s=in.nextLine().split(" ");
        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=Integer.parseInt(s[i]);

        Arrays.sort(arr);

        int count=0;

        int i=0;
        int j=n-1;

        while(i<=j){
            if(arr[i]+arr[j]>x) j--;
            else{
                i++;
                j--;
            }
            count++;
        }
        System.out.println(count);
    }
}
