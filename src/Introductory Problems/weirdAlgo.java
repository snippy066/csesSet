import java.util.*;
import java.io.*;
import java.math.*;

public class weirdAlgo {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

        while(true){
            System.out.print(n+" ");
            if(n==1)
                break;
            if(n%2==0){
                n=n/2;
            }
            else{
                n=n*3+1;

            }

        }
    }
}
