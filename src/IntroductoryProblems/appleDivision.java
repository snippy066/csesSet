package IntroductoryProblems;

import java.util.Scanner;

public class appleDivision {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        System.out.println(getdiff(arr,n));
    }

    static int getdiff(int[] arr,int n){
        int sum1=0,sum2=0,min=Integer.MAX_VALUE;
        for(int i=0;i<(int)Math.pow(2,n);i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0) {
                    sum1 += arr[j];
                }
                else
                    sum2+=arr[j];
            }
            int diff=sum1-sum2;
            if(diff<0)
                diff*=-1;

            min=Math.min(min,diff);
        }
        return  min;
    }
}
