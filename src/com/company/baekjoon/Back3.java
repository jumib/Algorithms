package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back3 {
    // 주어진 수의 경우의 수 출력. 중복 가능. 깊이 제한.

    public static int arr[];
    public static int N, M;
//    public static boolean visit[];  중복값 상관 없음

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 입력값
        M = Integer.parseInt(st.nextToken()); // 깊이

        arr = new int[M];
//        visit = new boolean[N];  중복값 상관 없음
        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(depth == M){
            for(int i=0; i < M; i++){
                // StringBuilder 쓴 버전
                // 걍 print 한 버전
                sb.append(arr[i]);
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N ; i++){ // 입력값까지 1씩 증가한다.
            arr[depth] = i; // 해당 인덱스에 +1을 넣어준다.
            dfs(depth+1); // 재귀 돌아간다.
        }

//        for(int i =0 ; i < N; i++){
//            arr[i] = i+1;
//            dfs(depth+1);
//        }
    }
}
