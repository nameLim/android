package com.company;

import java.util.Scanner;

//2839 설탕
// 성공 , 참고
public class Chapter01_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int answer = 0;
        while (true) {
            if(T%5==0){
                answer += T/5;
                System.out.println(answer);
                break;
            }
            else {
                T -= 3;
                answer++;
            }
            if (T<0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
