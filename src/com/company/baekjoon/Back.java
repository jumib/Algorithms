package com.company.baekjoon;

import java.util.Scanner;

public class Back {
    // 중복되는 수를 제외한 모든 경우의 수를 출력하면 된다.

    public static int[] arr; // 탐색 값 담을 배열
    public static boolean[] visit; //중복여부 체크 할 배열

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 숫자의 범위? N 까지의 숫자 출력
        int M = in.nextInt(); // 크기 ? 깊이?

        arr = new int[M];
        visit = new boolean[N]; // N == 3 ? [false, false, false, false]
        dfs(N, M, 0);
    }

    // depth변수를 추가한다. M과 depth가 같아지면  재귀X, 탐색 값 담긴 arr 출력 (return)
    public static void dfs(int N, int M, int depth) {
        if (depth == M) { // 즉 탈출조건
            for (int val : arr) {
                System.out.print(val + " "); // ex) 1 찍고  2 찍고

            }
            System.out.println();            // 줄바꾸고 탈출조건 만나면 다시 위에서     1 찍고 3 찍고
            return;
        }

        //배열값을 사용할것이기때문에 0부터 시작하고 +1해준다.
        for (int i = 0; i < N; i++) { // 입력 받은 숫자만큼 돌려준다. 예를들어 3까지의 경우의 수.
            if (!visit[i]) { // 만약에 0번째가 false 면 == 탐색 안했다는 뜻
                visit[i] = true; // 일단 방문상태 true 로 바꾸고
                arr[depth] = i + 1; // arr[0] = 1 해당 깊이를 index 로 하여 i + 1 값 저장
                dfs(N, M, depth + 1); // 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출

                // 자바는 동기처리라서 dfs 가 끝날때까지 기다린다. 그 후 에 false 로 변경.
                visit[i] = false; // 자식 다 돌면 다시 false 로 변경
            }
        }
    }

}