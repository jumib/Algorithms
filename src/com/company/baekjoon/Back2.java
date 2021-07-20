package com.company.baekjoon;

// 1. 2차배열안쓰고 index = 열 / val = 행
// 2. 재귀는 행이 끝날때마다 탈출, cnt++
// 3. 체스조건 같은 같은 열X 행X 대각선 X

import java.util.Scanner;

public class Back2 {

    public static int[] arr;
    public static int N;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 체스판 크기
        arr = new int [N]; // 체스판 만들어 줌

        nqueen(0);
        System.out.println(cnt);

    }
    public static void nqueen(int depth){
        if(depth == N){
            cnt++;
            return;
        }

        for(int i = 0; i < N; i++){
            arr[depth] = i;
            if(chk(depth)){ // 놓을 수 있는 위치일 경우 재귀호출
                nqueen(depth+1);
            }
        }
    }

    public static boolean chk(int col){
        for(int i = 0; i < col ; i++){
            if(arr[i] == arr[col]){ // 해당 depth와 같은 행이면 다 못 놓으니까 false로 return.
                return false;
            } else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])){ // 행의 차이와 열의 차이가 같으면 대각선이 있는거임.
                return false;
            }

        }
        return true;
    }
}