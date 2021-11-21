package com.company.kakao;

import java.util.Scanner;

// 중복 허용
// 최소 비용
// 지점 n개, 시작점 s, 목적지1 a, 목적지2 b
public class test3 {
    static int N;
    static int S;
    static int A;
    static int B;
    static int[] fares;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        N = Integer.parseInt(in[0]);
        S = Integer.parseInt(in[1]);
        A = Integer.parseInt(in[2]);
        B = Integer.parseInt(in[3]);

        solution(0);
    }
    public static int solution(int depth){
        if(depth == N){
        }

        return min;
    }
}
