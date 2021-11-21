package com.company.kakao;

import java.util.Scanner;

public class test1 {
    static String new_id;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new_id = sc.nextLine();

        new_id = new_id.toLowerCase(); //소문자로 치환
        new_id = new_id.replaceAll("[^a-z0-9-_.]",""); //특정 특수문자

        new_id = new_id.replaceAll("[.]{2,}",".");

        if(new_id.startsWith(".")){ //맨 앞, 맨 뒤에 .이 오면 삭제
            new_id = new_id.substring(1);
        } else if(new_id.endsWith(".")) {
            new_id = new_id.substring(0,new_id.length()-1);
        }

        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if(new_id.endsWith(".")) {
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        if (new_id.equals("")){ // 공백이 입력되면 문자 a를 대입
            new_id = "a";
        }
        if(new_id.length() <= 2){
            for(int i = new_id.length(); i < 3; i++){
                new_id = new_id.concat(new_id.substring(new_id.length()-1));
            }
        }

        System.out.println(new_id);
    }
}
