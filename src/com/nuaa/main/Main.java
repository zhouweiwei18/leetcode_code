package com.nuaa.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine().trim();
            System.out.println(solution(str.substring(2)));
        }
    }

    public static String solution(String str) {
        char[] chs = str.toCharArray();
        int ans = 0;
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            int val = map.containsKey(chs[i]) ? map.get(chs[i]) : chs[i] - '0';
            ans += val * get(j);
        }
        return String.valueOf(ans);
    }

    public static int get(int j) {
        int ans = 1;
        while (j-- > 0) {
            ans *= 16;
        }
        return ans;
    }

}
