package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1546 {
	public static void main(String[] args) throws IOException {
		Solution1546 s = new Solution1546();
		s.solve();
	}
}

class Solution1546{

	public void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double max = 0;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) max = arr[i];
		}
		
		double ans = 0;
		
		for(int i=0; i<n; i++) {
			ans += (arr[i]/max)*100;
		}
		
		bw.write(String.valueOf(ans/n));
		bw.flush();
		bw.close();
	}
	
}
