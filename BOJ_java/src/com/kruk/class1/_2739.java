package com.kruk.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<10; i++) {
			bw.write(n + " * " + i + " = " + (n * i) + "\n");

//			bw.write(String.valueOf(n));
//			bw.write(" * ");
//			bw.write(String.valueOf(i));
//			bw.write(" = ");
//			bw.write(String.valueOf(n*i));
//			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
