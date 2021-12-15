package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1300_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());


        int lf=0, rf=k;
        int answer = 0;
        while(lf<=rf){
            int mid = (lf+rf)/2;
            int cnt=0;
            for(int i=1; i<=n; i++){
                cnt+=Math.min(mid/i, n);
            }

            if (cnt < k) {
                lf = mid + 1;
            } else {
                rf = mid - 1;
                answer = mid;
            }
        }
        System.out.println(answer);
    }
}
