package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2609 {
	public static void main(String[] args) throws IOException {
		Solution2609 s = new Solution2609();
		s.solve();
	}
}

class Solution2609{
	public void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean going = true;
		int temp = 1;
		
		while(going) {
			going = false;
			for(int i=2; i<=Math.max(a, b); i++) {
				if (a%i == 0 && b%i == 0) {
					temp *= i;
					a /= i;
					b /= i;
					going = true;
					break;
				}
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(String.valueOf(temp));
		bw.newLine();
		bw.write(String.valueOf(a*b*temp));
		bw.flush();
		bw.close();
	}
	
}
