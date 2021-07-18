import java.util.*;

public class numberSpiral {
    //private static int arr[][]={{1,2,9,10,25},{4,3,8,11,24},{5,6,7,12,23},{16,15,14,13,22},{17,18,19,20,21}};
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        StringBuilder ans=new StringBuilder();
        while(t-->0){
            String[] st=in.nextLine().split(" ");
            int x=Integer.parseInt(st[0]);
            int y=Integer.parseInt(st[1]);
            long z1=y;
           if(x>y)
               z1=x;
            long z2=(z1-1)*(z1-1);

            if(z1==x){
                if(z1%2==0)
                    ans.append(z2+2*z1-y+"\n");
                else
                    ans.append(z2+y+"\n");
            }
            else{
                if(z1%2==0)
                    ans.append(z2+x+"\n");
                else
                    ans.append(z2+2*z1-x+"\n");
            }

        }
        System.out.print(ans);
    }
}
