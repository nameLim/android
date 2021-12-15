package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        //최빈도수 구하기
        int[] cnt = new int[8001];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            cnt[arr[i]+4000]++;
        }

        Arrays.sort(arr);
        double avg = ((double) Arrays.stream(arr).sum())/n;
        int mid = arr[n/2];
        int range = Arrays.stream(arr).max().getAsInt()-Arrays.stream(arr).min().getAsInt();


        int max = 0;
        ArrayList<Integer> frequencyCnt = new ArrayList<>();
        for(int i=0; i<cnt.length; i++){
            if(max<cnt[i]){
                max = cnt[i];
            }
        }

        for(int i=0; i<cnt.length; i++){
            if(cnt[i]==max)
                frequencyCnt.add(i-4000);
        }

        Collections.sort(frequencyCnt);

        //최빈값
        int frequency =  frequencyCnt.size() > 1? frequencyCnt.get(1) :frequencyCnt.get(0);
        System.out.println(Math.round(avg));
        System.out.println(Math.round(mid));
        System.out.println(Math.round(frequency));
        System.out.println(Math.round(range));
    }
}
