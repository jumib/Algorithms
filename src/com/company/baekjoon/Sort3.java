package com.company.baekjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//단어순정렬
public class Sort3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        sc.nextLine();	// 개행 버림

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        //양수면 순서 바꿔준다.
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });


        System.out.println(arr[0]);


    }

}