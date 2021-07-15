import java.util.Scanner;

public class createString {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)    arr[i]=sc.nextInt();

        generatePs(arr,n);
    }

    static void generatePs(int[] arr,int len){
        int  loop=(1<<len);

        for(int i=0;i<loop;i++){
            sb.append("{");
            for(int j=0;j<len;j++) {
                if ((i & (1 << j)) > 0)
                    sb.append(arr[j] + " ");
            }
            sb.append("}\n");
        }
        System.out.print(sb.toString());

    }
}
