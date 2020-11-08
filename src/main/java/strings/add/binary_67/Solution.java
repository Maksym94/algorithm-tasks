package strings.add.binary_67;

public class Solution {

    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aIdx = aChars.length - 1;
        int bIdx = bChars.length - 1;
        char carry = '0';
        StringBuilder sb = new StringBuilder();
        while (aIdx >= 0 || bIdx >= 0) {
            char aVal = aIdx >= 0 ? aChars[aIdx] : '0';
            char bVal = bIdx >= 0 ? bChars[bIdx] : '0';


            if (aVal == '1' && bVal == '1') {
                if (carry == '1') {
                    sb.append('1');
                } else {
                    sb.append('0');
                    carry = '1';
                }
            } else if (aVal != bVal) {
                if (carry == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            } else {
                if (carry == '1') {
                    sb.append('1');
                    carry = '0';
                } else {
                    sb.append('0');
                }
            }
            aIdx--;
            bIdx--;
        }
        if (carry == '1') {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
