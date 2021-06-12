import java.util.*;

public class grayCode {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=n;
        StringBuilder sb=new StringBuilder();

        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        int sz;
        while(n>1){
            sz=list.size();
            for(int i=sz-1;i>=0;i--){
                list.add(list.get(i)+sz);
            }
            n--;
        }

        for(int i=0;i<list.size();i++){
            String s=Integer.toBinaryString(list.get(i));

            char[] ch=new char[j-s.length()];
            Arrays.fill(ch,'0');
            String add=new String(ch);
            sb.append(add+s+"\n");
        }

        System.out.println(sb);
    }
}
