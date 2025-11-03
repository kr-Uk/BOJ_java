package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _18870{
    public static void main(String[] args) throws IOException {
        Solution18870 s = new Solution18870();
        s.solve();
    }
}

class Solution18870{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int[] sorted_arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) {
        	int temp = Integer.parseInt(st.nextToken());
        	arr[i] = temp;
        	sorted_arr[i] = temp;
        }
        
        sorted_arr = Arrays.stream(sorted_arr).distinct().toArray();
        Arrays.sort(sorted_arr);
        
        for(int i=0; i<n; i++) {
        	bw.write(String.valueOf(Arrays.binarySearch(sorted_arr, arr[i])) + " ");
        }
        
        bw.flush();
        bw.close();
    }
}