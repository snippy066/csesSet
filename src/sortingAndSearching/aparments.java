//package sortingAndSearching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class aparments {
    private static StringBuilder sb=new StringBuilder();
    public static void main(String ar[]){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();

//        int[] desi=new int[n];
//        int[] rel=new int[m];
//
//        for(int i=0;i<n;i++)    desi[i]=in.nextInt();
//        for(int i=0;i<m;i++)    rel[i]=in.nextInt();
//        Arrays.sort(desi);
//        Arrays.sort(rel);

//        PriorityQueue<Integer> desi=new PriorityQueue<>();
//        PriorityQueue<Integer> rel=new PriorityQueue<>();

//        for(int i=0;i<n;i++)  desi.add(in.nextInt());
//        for(int i=0;i<m;i++)  rel.add(in.nextInt());

        in.nextLine();
        String [] s1=in.nextLine().split(" ");
        PriorityQueue<String> desi=new PriorityQueue<>(Arrays.asList(s1));

        String [] s2=in.nextLine().split(" ");
        PriorityQueue<String> rel=new PriorityQueue<>(Arrays.asList(s2));

        int count=0;
        while(!desi.isEmpty() && !rel.isEmpty()){
            int diff=Integer.parseInt(desi.peek())-Integer.parseInt(rel.peek());

            if(Math.abs(diff)<=k){
                desi.poll(); rel.poll(); count++;

            }
            else{
                if(diff>k)
                    rel.poll();

                else
                    desi.poll();

            }

        }

        System.out.println(count);

    }
}
