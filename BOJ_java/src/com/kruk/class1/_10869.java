package com.kruk.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(a+b));
		bw.newLine();
		bw.write(String.valueOf(a-b));
		bw.newLine();
		bw.write(String.valueOf(a*b));
		bw.newLine();
		bw.write(String.valueOf(a/b));
		bw.newLine();
		bw.write(String.valueOf(a%b));
		
		bw.flush();
		bw.close();
	}
}
