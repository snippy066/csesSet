import java.util.*;

public class grayCode {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] ch=new char[n];
        Arrays.fill(ch,'1');
        String s=new String(ch);
        int i=0;
        while(++i<=4){
        s=s.replaceFirst("1","0");
        System.out.println(s);
        }
    }
}
