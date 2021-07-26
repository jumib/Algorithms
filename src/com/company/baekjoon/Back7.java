package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back7 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dfs("");
    }

    public static void dfs(String result) {
        if (result.length() == N) {
            System.out.println(result);
            System.exit(0); // 첫번째 찍고 강제 종료


        } else {
            for (int i = 1; i <= 3; i++) { // 입력받은 수만큼의 길이가 될때까지 1,2,3 중 추가추가해준다.
                if (seq(result + i)) { // 좋은수열인지 판별
                    dfs(result + i);
                }
            }
        }
    }
//    마지막 1개와 그 앞의 1개의 수가 동일한지
//    마지막 2개와 그 앞의 2개의 수가 동일한지
//    마지막 3개와 그 앞에 3개의 수가 동일한지
//    ...
//    마지막 N/2개와 그 앞에 N/2개의 수가 동일한지 비교

    public static boolean seq(String s) {
        int length = s.length() / 2;

        for (int i = 1; i <= length; i++) {
            if (s.substring(s.length() - i).equals(s.substring(s.length() - 2 * i, s.length() - i))) {
                return false;
            }
        }

        return true;
    }
}