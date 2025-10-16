package com.kruk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int iter = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			String result = "";
			
			for (int j=0; j<s.length(); j++) {
				for (int k=0; k<iter; k++) result += String.valueOf(s.charAt(j));
			}
			
			System.out.println(result);
		}
	}
}
