package com.company.baekjoon;


import java.util.Scanner;

public class _string {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();

//        char [] a  = str.toCharArray();
//
//        for(int i = 0; i < a.length ; i++){
//            int num =0;
//            if(i == 'A' || i == 'B' || i == 'C'){
//                num += 2;
//            } else if (i == 'D' || i == 'E' || i == 'F'){
//                num += 3;
//            } else  if (i == 'G' || i == 'H' || i == 'I'){
//
//            }
//        }

//        String a = str.toLowerCase();
//        char [] word = a.toCharArray();
//        for (int i = 0; i < word.length; i++){
//            for(int j = 0; j<)
//            }
//        }
//
//
//        System.out.println(a);

// 2번
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        String num = sc.next();
//
//        int sum = 0;
//
//        for(int i=0;i<n;i++){
//            sum += num.charAt(i) - '0';
//        }
//
//        System.out.println(sum);

// 4번
//        int num = sc.nextInt();
//        String S = sc.next();
//        String P ;
//
//        for(int i=0;i<)

// 6번
//        String str = sc.next().trim();
        String str = sc.nextLine().trim();

        if (str.isEmpty())
            System.out.println(0);
        else
            System.out.println(str.split(" ").length);

    }
}
