import java.util.*;

public class trailingZeros {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int twcount=0,ficount=0;

        int cp=n;
        twcount=cp/2;
        ficount=n/5;

        System.out.println(Math.min(twcount,ficount));
    }
}
