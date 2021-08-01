package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9 {
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        int C =Integer.parseInt(br.readLine());

        for(int tc=1; tc<=C; tc++) {
            boolean check[]=new boolean[11];
            max=Integer.MIN_VALUE;
            int playerScore[][]=new int[11][11];
            for(int i=0; i<11; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<11; j++) {
                    playerScore[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            solve(check,playerScore, 0, 0);
            System.out.println(max);

        }
    }

    private static void solve(boolean [] check, int[][] playerScore, int playerNo, int totalScore) {
        if(playerNo==11) { //11명 다 선정
            max =Math.max(totalScore, max);
            return;
        }

        for(int i=0; i<11; i++) {
            if(playerScore[playerNo][i]==0 || check[i]) continue; //능력치 0이면 skip
            check[i]=true;
            solve(check, playerScore, playerNo+1, totalScore+playerScore[playerNo][i]);
            check[i]=false;
        }

    }

}