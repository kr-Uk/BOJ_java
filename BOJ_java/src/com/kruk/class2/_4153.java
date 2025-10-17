package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int a_pow = (int) Math.pow(a, 2);
			int b = Integer.parseInt(st.nextToken());
			int b_pow = (int) Math.pow(b, 2);
			int c = Integer.parseInt(st.nextToken());
			int c_pow = (int) Math.pow(c, 2);
			
			if (a == 0 && b == 0 && c == 0) break;
			
			if (a_pow + b_pow == c_pow
					|| b_pow + c_pow == a_pow
					|| c_pow + a_pow == b_pow) bw.write("right");
			else bw.write("wrong");
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
