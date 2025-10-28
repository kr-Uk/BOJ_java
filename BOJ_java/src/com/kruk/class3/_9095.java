package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _9095{
    public static void main(String[] args) throws IOException {
        Solution9095 s = new Solution9095();
        s.solve();
    }
}

class Solution9095{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[12];
        
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        
        for(int i=4; i<=11; i++) {
        	arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
        }
        
        for(int i=0; i<n; i++) {
        	bw.write(String.valueOf(arr[Integer.parseInt(br.readLine())]));
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}