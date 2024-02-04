package com.algorithm.LetCode;

import java.util.HashMap;
import java.util.Map;

public class Let1590 {


    public static void main(String[] args) {
        minSubarray(new int[]{4,4,2},7);
    }
    //(pre[j] - x) % p == pre[i]%p。
    //[3,1,2,4]
    //[0,3,4,6,10]
    public static int  minSubarray(int[] nums, int p) {
        int n = nums.length;
        long preSum[] = new long[n+1];
        for (int i = 0; i < n; i++) {
            preSum[i+1] = preSum[i]+nums[i];
        }
        long sum = preSum[n];
        if(sum < p)return -1;
        if(sum==p)return 0;
        sum%=p;//余数
        int min = n+1;
        Map<Long,Integer> res = new HashMap<>();
        for (int i = 0; i < n+1; ++i) {
            res.put(preSum[i]%p,i);
            long prePoint = (preSum[i] - sum+p)%p;
            if(res.containsKey(prePoint)){
                min = Math.min(min,i-res.get(prePoint));
            }
        }

        return min>=n?-1:min;
    }

}
