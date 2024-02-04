package com.algorithm.LetCode;

import java.util.ArrayList;

public class Let1592 {

    public static void main(String[] args) {
        String s = reorderSpaces(" practice   makes   perfect");

    }

    public static String reorderSpaces(String text) {
        String textNew = text.trim();
        String[] strings = textNew.split("\\s+");
        int count = 0;
        int textLen = text.length();
        int wordNum = strings.length;
        for (int i = 0; i < wordNum; i++) {
           count+= strings[i].length();
        }
        int diff = textLen-count;
        int div =0;
        int end =0;
        end = diff;
        if(wordNum>1) {
            div = diff / (wordNum - 1);
            end = diff % (wordNum - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordNum ; i++) {
            sb.append(strings[i]);
            if(i==wordNum-1){
                for (int j = 0; j < end ; j++) {
                    sb.append(" ");
                }
                continue;
            }
            for (int j = 0; j < div; j++) {
                sb.append(" ");
            }
        }
        return new String(sb);
    }

}
