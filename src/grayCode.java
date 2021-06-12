import java.util.*;

public class grayCode {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] ch=new char[n];
        Arrays.fill(ch,'0');
        char add='1';
        String s=new String(ch);
        StringBuilder sb=new StringBuilder();
        for(long i=0;i<Math.pow(2,n);i++) {
            int su = 0;
            String res = "";
            int l = s.length()-1;
            while (l >=0 || su == 1) {
                su += s.charAt(l) + add;
                res += (char) (su % 2+'0');
                su /= 2;
                l--;
            }
            sb.append(res + "\n");
        }
        System.out.println(sb);
    }
}
