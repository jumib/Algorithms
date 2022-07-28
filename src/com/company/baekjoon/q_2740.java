package com.company.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q_2740 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.nextLine(), " ");
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        st = new StringTokenizer(sc.nextLine(), " ");

        st.nextToken();
        int K = Integer.parseInt(st.nextToken());

        int[][] B = new int[M][K];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(sc.nextLine(), " ");
            for(int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < K; j++) {
                int sum = 0;
                for(int k = 0; k < M; k++) {
                    sum += A[i][k] * B[k][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}