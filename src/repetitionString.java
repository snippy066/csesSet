import java.util.*;
import java.math.*;

public class repetitionString {
    private static Stack<String> stack=new Stack<String>();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String st[]=sc.nextLine().split("");
        int max=0,count=0;
        for(int i=0;i<st.length;i++){

            String s=st[i];
            if(stack.isEmpty()||!(stack.peek().equals(s))) {
                stack.push(s);
                count=1;
            }
            else
                count++;

            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
