package com.company.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int a =  Integer.parseInt(st.nextToken());
        int b =  Integer.parseInt(st.nextToken());

        System.out.println(factor(a,b));
        System.out.println(multiple(a,b));
    }
    public static int factor(int a, int b) {
        if(b == 0) return a;
        return factor(b, a%b);
    }
    public static int multiple(int a, int b) {
        return a*b/factor(a,b);
    }
}
