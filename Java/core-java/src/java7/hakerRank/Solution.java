package java7.hakerRank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String str = String.valueOf(x);
            System.out.println("----"+str.length());
            if(str.length() < 3){
                str = "0"+str;
            }

            System.out.print(s1);
            for (int j = 0; j < 15-s1.length(); j++) {

                System.out.print(" ");
            }
            System.out.print(str);
        }
        System.out.println("================================");
    }

}
