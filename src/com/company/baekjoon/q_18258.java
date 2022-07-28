package com.company.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();

        while(T-- >0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    que.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if(que.peek() == null)   sb.append(-1).append('\n');
                    else                sb.append(que.peek()).append('\n');
                    break;
                case "back":
                    if(que.peekLast() == null)   sb.append(-1).append('\n');
                    else                sb.append(que.peekLast()).append('\n');
                    break;
                case "empty":
                    if(que.isEmpty())   sb.append(1).append('\n');
                    else                sb.append(0).append('\n');
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "pop":
                    if(que.poll() == null)      sb.append(-1).append('\n');
                    else                        sb.append(que.poll()).append('\n');
                    break;
            }
        }
        System.out.println(sb);

    }
}
