//package sortingAndSearching;

//import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class distinctNum {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        in.nextLine();

        String arr[]=in.nextLine().split(" ");

        HashSet<String> hs = new HashSet<String>(Arrays.asList(arr));

//        for(int i=0;i<n;i++){
//
//            hs.add(in.nextInt());
//        }
        System.out.println(hs.size());
    }
}
