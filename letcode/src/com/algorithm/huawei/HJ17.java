package com.algorithm.huawei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String code = in.nextLine();
            long x = 0;
            long y = 0;
            if (code==null) System.out.println(x+","+y);
            String[] split = code.split(";");
            for (int i = 0; i <split.length ; i++) {
                String s = split[i];
                if(s.length()<2||s.length()>4)continue;
                char c = s.charAt(0);
                if(!isLaw(c))continue;
                String str = s.substring(1);
                if(!isLaw(str))continue;
                int num = Integer.parseInt(str);
                if(c=='A')x-=num;
                if(c=='S')y-=num;
                if(c=='D')x+=num;
                if(c=='W')y+=num;
            }
            System.out.println(x+","+y);
        }

    }

    public static boolean isLaw(char c){
        return c == 'A' || c == 'D' || c == 'W' || c == 'S';
    }

    public static boolean isLaw(String s){
        int number = 0;
        try {
            number=Integer.parseInt(s);
            return number < 100;
        }catch (Exception e){
            return false;
        }
    }


}
