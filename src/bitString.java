
import java.util.*;
import java.math.*;

public class bitString {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // BigInteger exp=BigInteger.valueOf(n);
        BigInteger mod=new BigInteger("1000000007" );
        BigInteger val=new BigInteger("2");
        BigInteger ans=val.pow(n);
        System.out.println(ans.mod(mod));
    }
}
