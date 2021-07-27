//package sortingAndSearching;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distinctNum {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        Set<Integer> hs = new HashSet<Integer>();

        for(int i=0;i<n;i++){
            int key=in.nextInt();
            hs.add(key);
        }
        System.out.println(hs.size());
    }
}
