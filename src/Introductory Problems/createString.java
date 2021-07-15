import java.util.*;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        String[] arr=in.nextLine().split("");
        int n=arr.length;

        permute(arr,0,n-1);
        System.out.print(sb.toString());
    }

    static void permute(String[] a,int l,int r){
        if(l==r)
            sb.append(a[l]);
        else{

            for(int i=l;i<=r;i++){
                swap(a[l],a[i]);
                permute(a,l+1,r);
                swap(a[l],a[i]);
            }
        }
    }
    static void swap(String x,String y){
        String temp=x;
        x=y;
        y=temp;
    }
}
