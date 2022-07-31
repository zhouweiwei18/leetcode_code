package com.nuaa.main;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            Set<Integer> set = new TreeSet<>();
            while (n-- > 0) {
                int nums = Integer.parseInt(sc.nextLine().trim());
                set.add(nums);
            }

            for (int i : set) {
                System.out.println(i);
            }
        }

    }

}
