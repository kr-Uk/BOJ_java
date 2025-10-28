package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399{
    public static void main(String[] args) throws IOException {
        Solution11399 s = new Solution11399();
        s.solve();
    }
}

class Solution11399{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        int result = 0;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
        	sum += arr[i];
        	result += sum;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}