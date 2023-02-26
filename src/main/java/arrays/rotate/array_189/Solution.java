package arrays.rotate.array_189;

public class Solution {
    public void rotate(int[] nums, int k) {
//        int shift = Math.min(k, k%nums.length);
//
//        for (int i = 0; i < shift; i++) {
//            int lastNum = nums[nums.length - 1];
//            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
//            nums[0] = lastNum;
//        }
//        for(int i = 0; i < shift; i++) {
//                 int lastNum = nums[nums.length -1];
//                 for(int j = nums.length - 1; j > 0; j--) {
//                     nums[j] = nums[j-1];
//                 }
//                 nums[0] = lastNum;
//        }
//        k= Math.min(k, k%nums.length);
//        if(nums.length < 2 || k < 1) {
//            return;
//        }
//        int[] arr = new int[k];
//        int shiftIdx = nums.length - k;
//        int leftIdx = nums.length - shiftIdx;
//        System.arraycopy(nums, shiftIdx, arr, 0, arr.length);
//        System.arraycopy(nums, 0, nums, leftIdx, shiftIdx);
//        System.arraycopy(arr, 0, nums, 0, arr.length);

        k = Math.min(k, k % nums.length);
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private void rotate(int[] nums, int idxLeft, int idxRight) {
        while (idxLeft < idxRight) {
            int temp = nums[idxRight];
            nums[idxRight] = nums[idxLeft];
            nums[idxLeft] = temp;
            idxLeft++;
            idxRight--;
        }
    }
}
