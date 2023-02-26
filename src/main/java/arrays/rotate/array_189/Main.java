package arrays.rotate.array_189;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        String[] data = IOUtils.toString(Main.class.getResourceAsStream("/big_array.txt"), StandardCharsets.UTF_8)
                .split(",");
        System.out.println(data[data.length - 1]);
        int[] nums =
                Arrays.stream(data)
                        .map(Integer::parseInt)
                        .mapToInt(i -> i)
                        .toArray();
        System.out.println("Arr length: " + nums.length);
        solution.rotate(nums, 54944);
//        int [] nums = {-1,-100,3,99};
//        solution.rotate(nums, 2);
//        int [] nums = {1,2,3,4,5,6,7};
//        solution.rotate(nums, 3);
//        int [] nums = {1,2};
//        solution.rotate(nums, 1);
//        int [] nums = {1,2,3};
//        solution.rotate(nums, 1);
//        int [] nums = {1,2,3,4};
//        solution.rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
