package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1463{
    public static void main(String[] args) throws IOException {
        Solution1463 s = new Solution1463();
        s.solve();
    }
}

class Solution1463{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+1];
        
        for(int i=0; i<n; i++) {
        	arr[i+1] = i;
        }
        
        for(int i=1; i<=n; i++) {
        	if (i+1 <= n) arr[i+1] = Math.min(arr[i+1], arr[i]+1);
        	if (i*2 <= n) arr[i*2] = Math.min(arr[i*2], arr[i]+1);
        	if (i*3 <= n) arr[i*3] = Math.min(arr[i*3], arr[i]+1);
        }
        
        bw.write(String.valueOf(arr[n]));
        
        bw.flush();
        bw.close();
    }
}