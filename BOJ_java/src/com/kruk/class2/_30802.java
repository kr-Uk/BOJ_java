package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _30802 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int nT = 0;
		int nP = 0;
		int nP_ones = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[6];
		for (int i=0; i<6; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<6; i++) {
			nT += arr[i] / T;
			if (arr[i]%T != 0) nT += 1;
		}
		
		nP = n / P;
		nP_ones = n % P;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(nT));
		bw.newLine();
		bw.write(nP + " " + nP_ones);
		
		bw.flush();
		bw.close();
	}
}
