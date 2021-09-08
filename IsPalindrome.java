package com.string;

public class IsPalindrome {

    public static void main(String[] args) {
        String s = "race a car";// "A man, a plan, a canal: Panamab";
        System.out.println(isPalindrome(s));

    }

    private static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;

        }
        return true;

        // String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // char[] c = actual.toCharArray();
        // for (int i = 0, j = c.length - 1; i < j;) {
        // if (c[i++] != c[j--]) {
        // return false;
        // }
        // }
        // return true;
    }
}