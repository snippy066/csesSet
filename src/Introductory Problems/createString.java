import java.util.*;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    private static String[] arr;
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        arr=in.nextLine().split("");
        int n=arr.length;

        permute(arr,0,n-1);
    }

    static void permute(String[] arr,int l,int r){

    }
}
