import java.util.*;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    private static String[] arr;
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        arr=in.nextLine().split("");
        int n=arr.length;

        permute(0,n-1);
        System.out.print(sb.toString());
    }

    static void permute(int l,int r){
        if(l==r)
            sb.append(arr);
        else{

            for(int i=l;i<=r;i++){
                swap(arr[l],arr[i]);
                permute(l+1,r);
                swap(arr[l],arr[i]);
            }
        }
    }
    static void swap(String x,String y){
        String temp=x;
        x=y;
        y=temp;
    }
}
