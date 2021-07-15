import java.util.Scanner;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split("");
        int n=s.length;
        generatePs(s,n);
    }

    static void generatePs(String[] arr,int len){
        int  loop=(1<<len);

        for(int i=0;i<loop;i++){
            for(int j=0;j<len;j++) {
                if ((i & (1 << j)) > 0)
                    sb.append(arr[j]);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());

    }
}
