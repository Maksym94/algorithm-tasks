package strings.longest.substring.without.repeating_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int startIdx = 0;
        int endIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                int idx = map.get(curr) + 1;
                if (idx > startIdx) {
                    startIdx = idx;
                }
            }
            endIdx++;
            int result = endIdx - startIdx;
            if (max < result) {
                max = result;
            }
            map.put(curr, i);
        }
        return max;
    }

    public int lengthOfLongestSubstringInitial(String s) {
        int max = 0;
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int temp = 1;
            for (int j = i + 1; j < s.length(); j++) {
                char curr = s.charAt(j);
                if (s.charAt(i) == curr || uniqueChars.contains(curr)) {
                    break;
                }
                uniqueChars.add(curr);
                temp++;
            }
            max = max < temp ? temp : max;
            uniqueChars.clear();
        }
        return max;
    }

}