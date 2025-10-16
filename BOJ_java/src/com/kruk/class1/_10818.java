package com.kruk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1000001;
		int min = 1000001;
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {	
			int a = Integer.parseInt(st.nextToken());
			if (a > max) max = a;
			if (a < min) min = a;
		}
		
		System.out.print(min + " " + max);
	}
}