package com.algorithm.huawei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String code = null;
        int x = 0;
        int y = 0;
        while (in.hasNextLine()) {
            code = in.nextLine();
        }
       if (code==null) System.out.println("("+x+","+y+")");
        List<String> operate = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        String[] split = code.split(";");
        for (int i = 0; i <split.length ; i++) {
            String s = split[i];
            if(i%2==0){

            }
        }
    }

    public boolean isNumber(String s){
        int number = 0;
        try {
            number=Integer.valueOf(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
