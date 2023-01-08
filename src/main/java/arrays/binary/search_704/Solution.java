package arrays.binary.search_704;

public class Solution {

    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length / 2;

        while (rightIdx >= leftIdx) {
            int valLeft = nums[leftIdx];
            int valRight = nums[rightIdx];
            if (valLeft == target) {
                return leftIdx;
            } else if (valRight == target) {
                return rightIdx;
            }
            if (target > valRight) {
                leftIdx = rightIdx + 1;
                rightIdx = nums.length - 1;
            } else {
                leftIdx++;
                rightIdx--;
            }
        }
        return -1;
    }
}
