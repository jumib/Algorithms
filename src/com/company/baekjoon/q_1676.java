package com.company.baekjoon;

import java.util.Scanner;

public class q_1676 {
    public static int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a = sc.nextInt();
        String res = Integer.toString(factorial(a));
        for(int i=0; i<res.length();i++) {
            if(res.charAt(res.length() - (i+1)) == '0'){
                cnt++;
            } else {
                System.out.println(cnt);
                return;
            }
        }
        System.out.println(cnt);
        return;
    }

}
