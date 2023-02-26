package arrays.move.zeros_283;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0,0,0,0,18,0,34,1,7};
        solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
