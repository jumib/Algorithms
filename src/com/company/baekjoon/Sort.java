package com.company.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1번
//        int n = sc.nextInt();

//        int[] arr = new int[n];

//        for(int i =0; i<n ;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//
//        for(int i = 0 ;i < n; i++){
//            System.out.println(arr[i]);
//        }



//        4번
//        int n = sc.nextInt();
//        int[] arr = new int[n];

//        System.out.println((int)Math.round((double)sum/n));
//        System.out.println(arr[n/2]);

//        int




        //7번
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i <n ; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (o1, o2) ->{
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0], o2[0]);
            }else{
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }
}
