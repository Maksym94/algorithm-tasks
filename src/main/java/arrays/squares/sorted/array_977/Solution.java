package arrays.squares.sorted.array_977;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] sortedNums = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            sortedNums[i] = nums[i] * nums[i];
        }
        for (int i = 1; i < sortedNums.length; i++) {
            int curr = sortedNums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (curr < sortedNums[j]) {
                    sortedNums[j + 1] = sortedNums[j];
                    sortedNums[j] = curr;
                } else {
                    break;
                }
            }
        }
        return sortedNums;
    }

    public int[] sortedSquaresOptimized(int[] num) {
        int idxLeft = 0;
        int idxRight = num.length - 1;
        int[] sortedArray = new int[num.length];

        for (int i = num.length - 1; i >= 0; i--) {
            int biggestLeft = Math.abs(num[idxLeft]);
            int biggestRight = Math.abs(num[idxRight]);

            if (biggestLeft > biggestRight) {
                sortedArray[i] = biggestLeft * biggestLeft;
                idxLeft++;
            } else {
                sortedArray[i] = biggestRight * biggestRight;
                idxRight--;
            }
        }
        return sortedArray;
    }
}
