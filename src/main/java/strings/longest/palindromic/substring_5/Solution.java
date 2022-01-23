package strings.longest.palindromic.substring_5;

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int idxLeft = 0;
        int idxRight = 0;

        for (int i = 0; i < s.length(); i++) {
            int lenMiddle = getMaxExpandLen(s, i, i);
            int lenRight = getMaxExpandLen(s, i, i + 1);
            int maxLenOnStep = Math.max(lenMiddle, lenRight);
            if (maxLenOnStep > idxRight - idxLeft) {
                idxLeft = i - (maxLenOnStep - 1) / 2;
                idxRight = i + maxLenOnStep / 2;
            }
        }
        return s.substring(idxLeft, idxRight + 1);
    }

    private int getMaxExpandLen(String s, int left, int right) {
        int leftCurr = left;
        int rightCurr = right;

        while (leftCurr >= 0 && rightCurr < s.length()) {
            if (s.charAt(leftCurr) == s.charAt(rightCurr)) {
                leftCurr--;
                rightCurr++;
            } else {
                break;
            }
        }
        return rightCurr - leftCurr - 1;
    }

    public String longestPalindromeInitial(String s) {
        String longestPalindrome = "";
        if (isAllSymbolsTheSame(s)) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            int idxLeft = i - 1 >= 0 && s.charAt(i) == s.charAt(i - 1) ? i - 1 : i;
            int idxRight = i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1) ? i + 1 : i;

            Map<Integer, Character> charsWithIdx = getCharsWithIndex(s, idxLeft, idxRight, i);
            if (s.charAt(i) == s.charAt(idxRight)) {
                Map<Integer, Character> charsWithIdxOther = getCharsWithIndex(s, i, idxRight, i);
                if (charsWithIdxOther.size() > charsWithIdx.size()) {
                    charsWithIdx = charsWithIdxOther;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (Character ch : charsWithIdx.values()) {
                sb.append(ch);
            }
            if (longestPalindrome.length() < sb.length()) {
                longestPalindrome = sb.toString();
            }
        }

        return longestPalindrome;
    }

    private boolean isAllSymbolsTheSame(String s) {
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(0);
            if (s.charAt(i) != first) {
                return false;
            }
        }
        return true;
    }

    private Map<Integer, Character> getCharsWithIndex(String s, int idxLeft, int idxRight, int currIdx) {
        Map<Integer, Character> map = new TreeMap<>();
        boolean isPalindrome = true;
        if (idxLeft == currIdx - 1 && idxRight == currIdx + 1) {
            map.put(currIdx, s.charAt(currIdx));
        }

        while (isPalindrome) {
            char left = s.charAt(idxLeft);
            char right = s.charAt(idxRight);

            if (left == right) {
                map.put(idxLeft, left);
                map.put(idxRight, right);
                if (idxLeft - 1 < 0 || idxRight + 1 == s.length()) {
                    isPalindrome = false;
                }
            } else {
                isPalindrome = false;
            }
            idxLeft--;
            idxRight++;
        }
        return map;
    }

}
