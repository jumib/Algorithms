package com.company.baekjoon;

//class Test {
//    long sum(int[]a){
//        long sum = 0;
//
//        for(int i=0; i<a.length; i++){
//            sum += a[i];
//        }
//        return sum;
//    }
//}

//class SelfNumber {
//
//    public static void main(String[] args) {
//
//        boolean[] check = new boolean[10001];
//
//        for(int i = 1; i < 10001; i++){
//            int n = d(i);
//
//            if(n < 10001) {
//                check[n] = true;
//            }
//        }
//        for(int i =1; i < 10001; i++){
//            if(!check[i]){
//                System.out.println(i);
//            }
//        }
//
//    }
//
//    public static int d(int number){
//        int sum = number;
//
//        while (number != 0){
//            sum = sum + (number % 10);
//            number = number/10;
//        }
//        return sum;
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Hansu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(sequence(Integer.parseInt(br.readLine())));
    }

    public static int sequence(int num) {
        int cnt = 0;

        if(num<100) {
            return num;
        } else {
            cnt = 99;
            if(num == 1000){
                num = 999;
            }

            for( int i = 100; i <= num; i++) {
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hun - ten) == (ten - one)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

