package com.company.baekjoon;

import java.util.Scanner;

public class _fourcalculations {
    public static void main(String[] args) {
        // 1번
        System.out.println("hello world");
        // 2번
        for (int i = 0;  i < 2; i++) {
            System.out.println("피카피카");
        }
        // 3번
        System.out.printf("\\    /\\\n");
        System.out.printf(" )  ( ')\n");
        System.out.printf("(  /  )\n");
        System.out.println(" \\(__)|\n");
        // 4번
        System.out.printf("|\\_/|\n");
        System.out.printf("|q p|   /}\n");
        System.out.printf("( 0 )\"\"\"\\\n");
        System.out.printf("|\"^\"`    |\n");
        System.out.printf("||_/=\\\\__|\n");
        // 5번
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력해주세요");
        int a = sc.nextInt();
        System.out.println("두번째 수를 입력해주세요");
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("나누기 연산 시작! 세번째 수를 입력해주세요");
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);

        System.out.println("곱하기 연산 시작!");
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);

        sc.close();




    }
}
