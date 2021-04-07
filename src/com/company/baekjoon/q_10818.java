package com.company.baekjoon;

import java.util.Scanner;

public class q_10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = -1000000;
        int min = 1000000;
        System.out.println("테스트 케이스 개수를 입력해주세요");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("숫자 n개를 입력해주세요");
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if ( arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min = "+min+" max = "+max);

    }
}
