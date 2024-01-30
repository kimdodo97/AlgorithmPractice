package LeetCode150;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        //시간 효율 X 버전
        int n = nums.length;
        for(int i=0; i<k; i++){
            int swap = nums[n-1];
            for(int j=n-1; j>=1; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = swap;
        }
    }
}
