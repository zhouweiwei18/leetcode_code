package com.nuaa.main;

import java.util.Scanner;

public class Main {
    static int ans = 0;
    static int res = -1;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (sc.hasNextLine()) { // 注意 while 处理多个 case
            // 得到x y a b
            String[] str = sc.nextLine().trim().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int a = Integer.parseInt(str[2]);
            int b = Integer.parseInt(str[3]);
            if(a>b){
                System.out.print(-1);
                continue;
            }
            backtracking(new int[]{x, y}, a, b, 0);
            System.out.println(res);
            ans = -1;
            res = -1;
        }
    }

    public static void backtracking(int[] array, int a, int b, int startIndex) {
        if (a == b) {
            res = ans;
            flag = true;
            return;
        }
        if (flag || a > b || startIndex >= array.length) {
            return;
        }
        for (int i = startIndex; i < array.length; i++) {
            ans++;
            backtracking(array, a * array[i], b, 0);
            ans--;
        }
    }


}
