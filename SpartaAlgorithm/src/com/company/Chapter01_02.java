package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//2869달팽이
//시간초과
public class Chapter01_02 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt(); //up
//        int b = in.nextInt(); //down
//        int v = in.nextInt(); //len

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());


        int day = (v-b) / (a-b);

        if( (v-b)%(a-b) != 0)
            day++;

        System.out.println(day);
    }
}
