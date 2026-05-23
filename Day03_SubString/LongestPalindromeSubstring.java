public class LongestPalindromeSubstring {

    public static String SubStr(String str) {
        String longest = "";
        int right = 0;
        int len = str.length();
        int left = 0;
        int iteration = (str.length()) * (str.length() + 1) / 2;
        for (int i = 0; i < iteration; i++) {
            if (right == len) {
                left++;
                right = left;
            }
            right++;
            String sub = str.substring(left, right);
            boolean flag = pal(sub);
            if (flag && sub.length() > longest.length()) {
                longest = sub;
            }
        }
        return longest;
    }

    public static boolean pal(String str) {
        int right = str.length();
        for (int left = 0; left < str.length() / 2; left++) {
            if (str.charAt(left) != str.charAt(right - 1)) {
                return false;
            } else {
                right--;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(SubStr("cbbd"));
    }
}
