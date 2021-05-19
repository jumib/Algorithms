package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _mathFirst {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        // 달팽이
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int V = Integer.parseInt(st.nextToken());
//
//        int height = 0;
//        int cnt = 0;
//
//        while (height < V) {
//            cnt++;
//            height += A;
//            if(height >= V){
//                break;
//            }
//            height -= B;
//        }
//
//        System.out.println(cnt);

        // 부녀회장
//        int testcase = Integer.parseInt(st.nextToken());
//
//
//        int[][] apt = new int[15][15];
//
//        for(int i = 0; i<15; i++){
//            apt[i][1] = 1;
//            apt[0][i] = i;
//        }
//
//        for(int i = 1 ; i<15; i++){
//            for(int j = 2; j < 15; j++){
//                apt[i][j] = apt[i][j-1] + apt[i-1][j];
//            }
//        }
//
//        for(int i = 0; i< testcase; i++){
//            int k = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//
//            System.out.println(apt[k][n]);
//        }

        // 큰 수
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        a = a.add(b);

        System.out.println(a.toString());

    }
}
