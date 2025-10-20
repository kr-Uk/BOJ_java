package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _2798{
    public static void main(String[] args) throws IOException {
        Solution2798 s = new Solution2798();
        s.solve();
    }
}

class Solution2798{

    public static int anw = 0;

    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        Deque<Integer> stack = new ArrayDeque<Integer>();

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        comb(arr, n, m, 0, stack);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(String.valueOf(anw));
        bw.flush();
        bw.close();
    }

    private void comb(int[] arr, int n, int m, int idx, Deque<Integer> stack) {
        if (stack.size() == 3) {
            int sum = 0;
            for(int num : stack){
                sum += num;
            }

            if (sum <= m) {
                anw = Math.max(sum, anw);
            }
            return;
        }

        for (int i=idx; i<n; i++){
            stack.push(arr[i]);
            comb(arr, n, m, i+1, stack);
            stack.pop();
        }

    }
}