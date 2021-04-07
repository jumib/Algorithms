package com.company.baekjoon;

import java.util.Scanner;

public class q_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스 개수를 입력해주세요");
        int C = sc.nextInt();
        System.out.println("학생 수를 입력해주세요");
        for (int i =0; i<C; i++){
            int N = sc.nextInt();
            int arr[] = new int[N];

            double sum = 0;
            System.out.println("성적을 입력해주세요");
            for (int j =0; j < N; j++){
                int P = sc.nextInt();
                arr[j] = P;

                sum += P;
            }
            double mean = (sum/N);
            double over = 0;

// =================================================================================

            for (int j = 0; j < N; j++){
                if (arr[j] > mean){
                    over++;
                }
            }
            System.out.printf("%.3f", over / N * 100.0);
            // 파라미터값 두개면

        }
    }
}
