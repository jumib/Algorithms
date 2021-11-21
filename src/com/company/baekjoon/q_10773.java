package com.company.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class q_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<T; i++){
            int a = sc.nextInt();
            if(a != 0){
                st.push(a);
            } else if (a == 0){
                st.pop();
            }
        }
        int sum = 0;
        for(int i=0; i<st.size(); i++){
            sum += st.elementAt(i);
        }
        System.out.println(sum);

    }
}
