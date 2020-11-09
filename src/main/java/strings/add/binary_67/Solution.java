package strings.add.binary_67;

public class Solution {

    public String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (aIdx >= 0 || bIdx >= 0) {
            int aVal = aIdx >= 0 ? Character.getNumericValue(a.charAt(aIdx)) : 0;
            int bVal = bIdx >= 0 ? Character.getNumericValue(b.charAt(bIdx)) : 0;

            int sum = aVal + bVal + carry;
            if (sum > 2) {
                sb.append(1);
            } else if (sum > 1) {
                sb.append(0);
                carry = 1;
            } else {
                sb.append(sum);
                carry = 0;
            }
            aIdx--;
            bIdx--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
