package com.company;

import java.util.Scanner;

//성공
// 1929번 M부터 N까지 소수 구하기
public class Chapter01_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        int[] arr = new int[N+1];
        for(int i=2; i<=N; i++) {
            if(arr[i]==0) {
                if(i>=M)System.out.println(i);
                for(int j=0; j<arr.length; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
    }
}
