class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        
        char[] result = new char[Math.max(a.length(), b.length()) + 1];
        int k = result.length - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            result[k--] = (char) ((carry % 2) + '0');
            carry /= 2;
        }
        
        return new String(result, k + 1, result.length - (k + 1));
    }
}
