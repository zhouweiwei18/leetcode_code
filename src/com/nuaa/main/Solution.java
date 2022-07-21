package com.nuaa.main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (sc.hasNextLine()) { // 注意 while 处理多个 case
            // 得到n m
            String[] str = sc.nextLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            // 创建n m 数组
            int[][] array = new int[n][m];
            int line = 0;
            while (line < n) {
                String[] val = sc.nextLine().trim().split(" ");
                for (int i = 0; i < m; i++) {
                    array[line][i] = Integer.parseInt(val[i]);
                }
                line++;
            }
            // 下面找出最大价值
            int ans = Integer.MIN_VALUE;
            int ll = Math.min(n, m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int l = 2; l <= ll; l++) {
                        // 计算价值
                        if (i + l - 1 < n && j + l - 1 < m) {
                            int value = array[i][j] + array[i + l - 1][j] + array[i][j + l - 1] + array[i + l - 1][j + l - 1];
                            ans = Math.max(value, ans);
                        }
                    }
                }
            }
            System.out.print(ans);
        }
    }

}
