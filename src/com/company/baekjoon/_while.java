package com.company.baekjoon;

import java.util.Scanner;

public class _while {
    public static void main(String[] args) {
        //1번
        Scanner sc = new Scanner(System.in);

//        while(true) {
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            if(num1 == 0 && num2 == 0) break;
//            System.out.println(num1 + num2);
//        }

        // 3번
        int num = sc.nextInt();

        int copy = num;		//변수 복사
        int count = 0;

        while(true){
            num = ( (num%10)*10 ) + ( ((num/10) + (num%10))%10 );
            count++;

            if(copy == num){
                break;
            }
        }
        System.out.println(count);

    }
}
