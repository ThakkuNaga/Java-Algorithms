package com.math;

import java.util.*;

import com.utils.Utils;

public class AddToArray {
    public static void main(String[] args) {

        // int[] num = { 1, 2, 0, 0 };
        // int k = 34;

        // int[] num = { 2, 7, 4 };
        // int k = 181;

        int[] num = { 2, 1, 5 };
        int k = 806;

        // int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        // int k = 1;
        Utils.prtArr(num);
        Utils.prt(k);
        Utils.prt(addToArrayForm(num, k));

    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; --i) {
            res.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }

    public static List<Integer> addToArrayForm2(int[] num, int k) {

        int i = num.length;
        List<Integer> ans = new ArrayList<>();

        while (--i >= 0 || k > 0) {
            if (i >= 0)
                k += num[i];
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans); 
        return ans;

    }

}