package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution2751 s = new Solution2751();
		s.solve();
	}
}

class Solution2751{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		for (int i=0; i<n; i++) {
			bw.write(String.valueOf(arr[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}	
}
