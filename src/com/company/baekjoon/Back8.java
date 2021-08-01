package com.company.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 2529
public class Back8 {
    static List<String> list = new ArrayList<>();
    static String[] arr;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        scan.nextLine();
        arr = scan.nextLine().split(" ");
        visit = new boolean[10];

        go("", k+1);

        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
    }

    public static boolean check(String key, String [] s) { //부등호를 만족하는 지 체크하는 메소드
        for(int i=1; i<key.length(); i++) {
            if(s[i-1].equals("<")) {
                if(!(key.charAt(i-1)-'0' < key.charAt(i)-'0')) {
                    return false;
                }
            }
            else {
                if(!(key.charAt(i-1)-'0' > key.charAt(i)-'0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void go(String key, int size){
        if(key.length() == size) {
            if(check(key, arr)) {
                list.add(key);
            }
            return;
        }
        if(key.length() > size )
            return;
        for(int i=0; i<=9; i++) {
            if(!visit[i]) {
                visit[i] = true;
                go(key+i, size);
                visit[i] = false; //백트래킹을 위한..
            }
        }
    }

}