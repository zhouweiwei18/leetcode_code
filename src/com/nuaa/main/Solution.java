package com.nuaa.main;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        15 5
//        1 5 1 2 5 4 3 4 2 1 2 5 5 2 4

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] values = sc.nextLine().trim().split(" ");
            //菜品个数
            int n = Integer.valueOf(values[0]);
            // 厨师个数
            int m = Integer.parseInt(values[1]);
            int[] food = new int[n];
            String[] foods = sc.nextLine().trim().split(" ");
            for (int i = 0; i < foods.length; i++) {
                food[i] = Integer.parseInt(foods[i]);
            }

            int[] ans = helper(food, m);
            ans[0] = ans[0] + 1;
            ans[1] = ans[1] + 1;
            System.out.println(ans[0] + " " + ans[1]);
        }

    }


    // 找出包含m个数的最短子序列
    public static int[] helper(int[] array, int m) {
        List<int[]> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            }
            while (map.size() >= m) {
                ans.add(new int[]{left, i});
                if (map.get(array[left]) == 1) {
                    map.remove(array[left]);
                } else {
                    map.put(array[left], map.get(array[left]) - 1);
                }
                left++;
            }
        }

        Collections.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if ((o1[1] - o1[0]) != (o2[1] - o2[0])) {
                    return (o1[1] - o1[0]) - (o2[1] - o2[0]);
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        return ans.get(0);
    }

}
