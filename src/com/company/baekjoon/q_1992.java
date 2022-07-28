package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1992 {
    static int N;
    static int map[][];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(input.substring(j,j+1));
            }
        }
        tree(0,0,N);
    }

    static void tree(int row, int col, int N){
        if(check(row,col,N)){
            sb.append(map[row][col]);
        }else {
            sb.append("(");
            int size = N / 2;
//        tree(row, col, size);
//        tree(row, col + size, size);
//        tree(row + size, col, size);
//        tree(row + size, col + size, size);
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    tree(row+size*i, col+size*j, size);
                }
            }
            sb.append(")");
        }
    }

    static boolean check(int row, int col, int size){
        int temp = map[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(temp != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
