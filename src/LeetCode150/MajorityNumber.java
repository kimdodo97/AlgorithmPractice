package LeetCode150;

import java.util.Arrays;

public class MajorityNumber {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int result = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            cnt = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt> (nums.length/2)){
                if(nums[i] > result)
                    result=nums[i];
            }
        }
        return result;
    }
}
