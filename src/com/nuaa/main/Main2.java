package com.nuaa.main;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (sc.hasNextLine()) { // 注意 while 处理多个 case
            // 得到 n k
            String[] str = sc.nextLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            int[][] values = new int[n][2];
            int line = 0;
            while (n-- > 0) {
                String[] val = sc.nextLine().trim().split(" ");
                values[line][0] = Integer.parseInt(val[0]);
                values[line][1] = Integer.parseInt(val[1]);
            }

            System.out.println(100);

        }
    }


}
