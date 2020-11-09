package arrays.two.sum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {14, 3, 2, 6};
        int[] result = solution.twoSum(numbers, 8);
        System.out.println("Sum of two numbers on indexes: " + Arrays.toString(result));
    }
}
