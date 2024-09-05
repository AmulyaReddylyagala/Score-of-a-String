
class Solution {
    public static int scoreOfString(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int num1 = s.charAt(i);
            int num2 = s.charAt(i + 1);
            ans = ans + Math.abs(num2 - num1);

        }
        return ans;
    }

}