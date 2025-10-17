package com.kruk.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = n;
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (a < 2) {
				ans--;
				continue;
			}
			for (int j=2; j<=Math.sqrt(a);j++) {
				if (a % j == 0) {
					ans--;
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}
