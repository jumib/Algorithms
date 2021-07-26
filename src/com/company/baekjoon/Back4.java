package com.company.baekjoon;

import java.util.Scanner;

public class Back4 {

    public static int N;
    public static int S;
    public static int[] arr;
    public static int cnt;
    public static int sum = 0;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N 입력");
        N = sc.nextInt();
        System.out.println("S 입력");
        S = sc.nextInt();
        System.out.println("arr 입력");
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        visit = new boolean[N];

        dfs(0,0);

        System.out.println(S == 0 ? cnt-1 : cnt); // S가 0일 경우 처름 시작할때 추가 된 애를 빼줌.
    }
    public static void dfs(int depth, int sum ){
        // -7 -3 -2 5 8
        if(depth == N) {
            if(sum == S){
                cnt++;
            }
            return;
        }

        dfs(depth+1, sum+arr[depth]); // 현재 위치값 더하고 다음으로 넘어가기
        dfs(depth+1, sum); // 현재 위치값 안더하고 넘어가기

        //1
//        for(int i = 0; i < N; i++){
//            if(arr[i] + arr[i+1] == S){
//                cnt++;
//            }
//            dfs(depth+1);
//        }
        //2
//        for(int i = 0; i < N; i++){
//            if(!visit[i]){
//                if(arr[depth]+arr[depth+i] == S) cnt++;
//                visit[i] = true;
//                dfs(depth+1);
//            }
//        }



    }
}