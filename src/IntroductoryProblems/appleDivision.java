package IntroductoryProblems;

import java.util.Scanner;

public class appleDivision {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        getdiff(arr,n);
    }

    
}
