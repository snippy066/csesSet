import java.util.*;

public class createString {
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        String[] arr=in.nextLine().split("");
        int n=arr.length;

        permute(arr,0,n-1);
    }

    
}
