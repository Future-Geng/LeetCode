package LetCode;

public class Let1812 {

    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        int x = coordinates.charAt(1);
        int res = 0;//white 偶数 black 奇数
        if(x%2==1){
            res+=1;
        }
        int a = c - 'a';
        if(a%2==1){
            res+=1;
        }
        if(res%2==1)return false;
        return true;
    }

}
