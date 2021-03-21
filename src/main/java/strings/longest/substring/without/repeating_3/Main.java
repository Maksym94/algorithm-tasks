package strings.longest.substring.without.repeating_3;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        int result2 = solution.lengthOfLongestSubstring("pwwkew");
        int result3 = solution.lengthOfLongestSubstring("bbbbb");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
