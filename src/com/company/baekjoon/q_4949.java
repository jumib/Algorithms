package com.company.baekjoon;
import java.util.Scanner;
import java.util.Stack;

public class q_4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String st = sc.nextLine();
            if(st.equals(".")) {
                break;
            }
            System.out.println(stacks(st));
        }
    }

    public static String stacks(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);

            if(a == '(' || a == '[') {
                st.push(a);
            } else if(a == ')') {
                if(st.empty() || st.peek() != '(') {
                    return "no";
                }
                else {
                    st.pop();
                }
            } else if(a == ']') {
                if(st.empty() || st.peek() != '[') {
                    return "no";
                }
                else {
                    st.pop();
                }
            }
        }
        if(st.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}
