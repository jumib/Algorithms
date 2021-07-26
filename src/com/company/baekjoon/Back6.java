package com.company.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1759
public class Back6 {
    static int L;
    static int C;
    static String[] arr;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split("\\s");
        arr = br.readLine().split("\\s");
        L = Integer.parseInt(num[0]);
        C = Integer.parseInt(num[1]);
        visit = new boolean[C];
        Arrays.sort(arr); // 정렬 해줘라 !!!



        dfs(0, 0);
//        System.out.println();

    }

    public static void dfs(int depth, int start){
        if(depth == L){
//            StringBuilder sb = new StringBuilder();
            int m = 0; //모음
            int j = 0; //자음
            String result = "";
            for(int i = 0 ; i < C; i++){
                if(visit[i]) {
//                    sb.append(arr[i]);
                    result += arr[i];
                    if(arr[i].equals("a")||arr[i].equals("e")||arr[i].equals("i")||arr[i].equals("o")||arr[i].equals("u")) {
                        m++;
                    }else {
                        j++;
                    }
                }
                if(m>=1 && j>=2) System.out.println(result);
                return;

            }
        }

        for(int i = start; i<C; i++){
            visit[i] = true; // 탐색햇으면 바꿔줌
            dfs(depth+1, i+1);
            visit[i] = false;
        }
    }
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//public class Back6 {
//    static boolean[] visit;
//    static String[] code;
//    static int l, c;
//
//    public static void backtracking(int start, int depth) {
//        if (depth == l) {
//            int vow = 0, cons = 0;
//            String ans = "";
//            for (int i = 0; i < c; i++) {
//                if (visit[i]) {
//                    ans += code[i];
//                    if (code[i].equals("a") || code[i].equals("e") || code[i].equals("i") || code[i].equals("o") || code[i].equals("u"))
//                        vow++;
//                    else cons++;
//                }
//            }
//            if (vow >= 1 && cons >= 2) System.out.println(ans);
//            return;
//        }
//
//        for (int i = start; i < c; i++) {
//            visit[i] = true;
//            backtracking(i + 1, depth + 1);
//            visit[i] = false;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] line = br.readLine().split("\\s");
//        code = br.readLine().split("\\s");
//
//        l = Integer.parseInt(line[0]);
//        c = Integer.parseInt(line[1]);
//        visit = new boolean[c];
//        Arrays.sort(code);
//
//        backtracking(0, 0);
//    }
//}