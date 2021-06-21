package com.company.baekjoon;

import java.util.Scanner;

public class
dynamic {
    public static Long[] seq = new Long[101];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 2L;

        int T = in.nextInt();

        while(T-- > 0) {
            int N = in.nextInt();
            System.out.println(fibo(N));
        }

    }
    // 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
    // n-2 / n-3
    // T
    public static long fibo(int N) {
        if(seq[N] == null) {	// 탐색하지 않은 인덱스일 경우 재귀호출
            seq[N] = fibo(N - 2) + fibo(N - 3);
        }
        return seq[N];
    }
}


//dp[n] = min(dp[n-1]  /3, dp[n-1]   /2, dp[n-1]   -1 )
