package com.kruk.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		int index = 0;
		
		for (int i=1; i<10; i++) {
			int a = Integer.parseInt(br.readLine());
			if (a > result) {
				result = a;
				index = i;
			}
		}
		
		System.out.println(result);
		System.out.println(index);
	}
}
