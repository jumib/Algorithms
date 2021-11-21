package com.company.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class q_17298 {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> ok = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T; i++){
            int a = sc.nextInt();
            st.push(a);
        }

        for(int i=0; i<st.size(); i++){
            if (i == st.size()-1) {
                System.out.println(-1);
                break;
            }
            for(int j=i+1; j<st.size(); j++) {
                if (st.elementAt(i) < st.elementAt(j)) {
                    ok.push(st.elementAt(j));
                }
            }
            if(!ok.empty()){
                System.out.println(ok.elementAt(0));
                ok.clear();
            } else {
                System.out.println(-1);
            }

        }
    }
//    public static int oken(){
//        for(int i=0; i<st.size(); i++){
//            if(i != st.size()-1){
//                for(int j=i; j<st.size(); j++){
//                    if(st.elementAt(i) < st.elementAt(j)){
//                        ok.push(st.elementAt(j));
//                    } else {
//                        return -1;
//                    }
//                }
//                return ok.elementAt(0);
//            } else {
//                return -1;
//            }
//        }
//        return -1;
//    };

}
