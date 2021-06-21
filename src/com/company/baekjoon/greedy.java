package com.company.baekjoon;

import java.util.Scanner;

public class greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int sum = Integer.MAX_VALUE;
        int sum = 0;
        String[] arr = sc.nextLine().split("-");


        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            String[] plus = arr[i].split("\\+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            for (int j = 0; j < plus.length; j++) {
                temp += Integer.parseInt(plus[j]);
            }

            // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if (i == 0) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
