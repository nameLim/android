package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11729_하노이탑이동순서 {
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        move(n, 1, 2, 3);
        System.out.println(answer);
        System.out.println(sb.toString());
    }

    //from에 꽂혀있는 n개의 원반을 by를 거쳐 to로 이동한다.
    private static void move(int n, int from, int by, int to){
        answer++;
        if(n==1){
            sb.append(from + " " + to + "\n");
            return;
        }

        move(n-1, from, to, by);
        sb.append(from + " " + to + "\n");
        move(n-1, by, from, to);
    }
}
