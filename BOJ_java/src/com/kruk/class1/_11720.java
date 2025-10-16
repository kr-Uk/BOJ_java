package com.kruk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			result += s.charAt(i)-'0';
		}
		
		System.out.println(result);
	}
}
