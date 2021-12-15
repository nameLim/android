package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2805_나무자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        int end = 0;
        int start = 0;
        for(int i=0; i<n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end, tree[i]);
        }

        Arrays.sort(tree);

        int result = 0;
        while(start<=end){
            int mid = (start+end)/2;
            int total = 0;

            for (int i=0; i<n; i++) {
                if (tree[i] > mid) {
                    total += tree[i] - mid;
                }
            }
            if (total < m) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }

        }
        System.out.println(result);
    }
}
