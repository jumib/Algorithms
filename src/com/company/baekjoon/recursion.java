package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
//        팩토리얼
//        int total = 1;
//
//        while(N > 0){
//            total = total*N;
//            N--;
//        }
//
//        System.out.println(total);
//
//        int total = factorial(N);
//        System.out.println(total);
//        int total = fibo(N);
//        System.out.println(total);


//        피보나치수열
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;

        // 하노이
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);

    }

//    public static int factorial(int N){
//        if (N<=1) return 1;
//        else return N*factorial(N-1);
//    }

    public static int fibo(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fibo(N-1) + fibo(N-2);
    }
    public static void Hanoi(int N, int start, int mid, int to) {
        StringBuilder sb = new StringBuilder();

        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        // STEP 1 : N-1개를 A에서 B로 이동
        Hanoi(N - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        Hanoi(N - 1, mid, start, to);

    }
}



	/*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동해야 장소
		to : 목적지
	 */


