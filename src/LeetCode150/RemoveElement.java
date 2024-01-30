package LeetCode150;
import java.util.*;
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int cnt=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
