package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11659{
    public static void main(String[] args) throws IOException {
        Solution11659 s = new Solution11659();
        s.solve();
    }
}

class Solution11659{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken()); 
        
        int[] sum = new int[n+1];
        sum[1] = arr[0];
        
        for(int i=2; i<=n; i++) {
        	sum[i] = arr[i-1] + sum[i-1];
        }
        
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	bw.write(String.valueOf(sum[end] - sum[start-1]));
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}