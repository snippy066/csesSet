import java.util.*;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    private static String a;
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        a=in.nextLine();
        int n=a.length();

        permute(0,n-1);
        System.out.print(sb.toString());
    }

    static void permute(int l,int r){
        if(l==r)
            sb.append(a);
        else{

            for(int i=l;i<=r;i++){
                swap(a[l],a[i]);
                permute(l+1,r);
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
