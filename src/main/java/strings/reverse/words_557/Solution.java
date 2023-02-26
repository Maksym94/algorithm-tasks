package strings.reverse.words_557;

import java.util.StringJoiner;

public class Solution {

    public String reverseWords(String s) {
        StringJoiner joiner = new StringJoiner(" ");
        String[] words = s.split(" ");

        for (String word : words) {
            char[] arr = word.toCharArray();
            int idxLeft = 0;
            int idxRight = arr.length - 1;

            while (idxLeft <= idxRight) {
                char temp = arr[idxLeft];
                arr[idxLeft] = arr[idxRight];
                arr[idxRight] = temp;
                idxLeft++;
                idxRight--;
            }
            joiner.add(new String(arr));
        }
        return joiner.toString();
    }
}
