package com.company.baekjoon;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BruteForce2 {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int N = in.nextInt();
//
//        int result = 0;
////        int[] arr = new int[N];
//
//        for(int i = 0; i < N; i++) {
//            int number = i;
//            int sum = 0;
//
//            while(number != 0) {
//                sum += number % 10;
//                number /= 10;
//            }
//
//            if(sum + i == N) {
//                result = i;
////                arr.add(result);
//                break;
//            }
//
//
//        }
////        int min = 100000;
////        for(int j = 0; j <arr.length; j++){
////            if(min>arr[j]){
////                min = arr[j];
////            }
////        }
//        System.out.println(result);
//    }
//}

import java.util.Scanner;

public class BruteForce2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;

        while (a > 0) {
            b++;
//			String s = Integer.toString(b);

            if (String.valueOf(b).contains("666")) {
                a--;
            }
        }

        System.out.println(b);

    }

}