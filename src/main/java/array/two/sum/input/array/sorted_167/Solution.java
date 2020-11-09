package array.two.sum.input.array.sorted_167;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int leftIdx = 0;
        int rightIdx = numbers.length - 1;

        while (leftIdx < rightIdx) {
            int sum = numbers[leftIdx] + numbers[rightIdx];
            if (sum == target) {
                return new int[]{leftIdx + 1, rightIdx + 1};
            } else if (sum > target) {
                rightIdx--;
            } else {
                leftIdx++;
            }
        }
        return new int[]{-1, -1};
    }
}