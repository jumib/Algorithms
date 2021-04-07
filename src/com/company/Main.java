package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idx = 0;

        int[] nums = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < n ; i++) {
            nums[i] = sc.nextInt();
            sc.nextLine();
        }

        for(int i = 1 ; i <= n ; i++) {

            if(nums[idx] < i) {
                System.out.println("-");
                stack.pop();
                idx++;
                i--;

            }else {
                System.out.println("+");
                stack.push(i);
            }
        }

        while(stack.size()>0) {
            System.out.println("-");
            stack.pop();
        }

    }
}
