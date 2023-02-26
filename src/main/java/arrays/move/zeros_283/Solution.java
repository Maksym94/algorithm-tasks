package arrays.move.zeros_283;

public class Solution {

    public void moveZeroes(int[] nums) {
        int idxRight = nums.length - 1;
        for(int i = 0; i <nums.length; i++) {
            int idxLeft = 0;
            while(idxLeft < idxRight) {
                if(nums[idxLeft] != 0) {
                    idxLeft++;
                    continue;
                }
                nums[idxLeft++] = nums[idxLeft];
                nums[idxLeft] = 0;
            }
            idxRight--;
        }
    }
}
