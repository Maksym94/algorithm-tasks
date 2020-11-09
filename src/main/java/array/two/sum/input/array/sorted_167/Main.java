package array.two.sum.input.array.sorted_167;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 3, 5, 9};
        int[] result = solution.twoSum(numbers, 8);
        System.out.println("Sum of two numbers on indexes: " + Arrays.toString(result));
    }
}
