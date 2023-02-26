package arrays.search.insert.position_35;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int lastIdx = 0;
        while(left <= right) {
            int midIdx = (left + right) / 2;
            int midVal = nums[midIdx];
            if(midVal == target) {
                return midIdx;
            }
            if(target > midVal) {
                left = midIdx + 1;
                lastIdx = left;
            } else {
                right = midIdx - 1;
                lastIdx = left;
            }
        }
        return lastIdx;
    }
}
