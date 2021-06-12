import java.util.*;

public class grayCode {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] ch=new char[n];
        Arrays.fill(ch,'0');
        String s=new String(ch);
        StringBuilder sb=new StringBuilder();
        char add='1';
        int su=0;
        int i=s.length();
        while(i>0||su==1){
            su+=s.charAt(i);
            
        }

    }
}
