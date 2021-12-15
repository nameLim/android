package com.company;

import java.util.Scanner;

//성공
//10250번 ACM호텔
public class Chapter01_03 {

    public static void main(String[] args) {
        Chapter01_03 C = new Chapter01_03();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int i=0; i<T; i++) {
            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();
            int tmp = (N%H) == 0 ? H*100 : (N%H)*100;
            int q = (N%H) == 0 ? (N/H) : (N/H)+1;
            System.out.println(tmp+q);
        }
    }
}
