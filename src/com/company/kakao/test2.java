package com.company.kakao;

import java.util.Scanner;

public class test2 {
    static String[] info;
    static String[] query;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b;
        a = a.replaceAll("[^a-z0-9-,/\\s/g]","");
        info = a.split("[,]");

        for(int i = 0; i< info.length; i++){
            System.out.println(info[i]);
            b = info[i].split(" ");
            for (int j = 0; j <b.length; j++){
                System.out.println(b[j]);
            }
        }


    }
}
