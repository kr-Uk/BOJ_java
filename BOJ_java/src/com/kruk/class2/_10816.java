package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution10816 s = new Solution10816();
		s.solve();
	}
}

class Solution10816{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Map<Integer, Integer> nmap = new HashMap<Integer, Integer>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (nmap.containsKey(temp)) nmap.replace(temp, nmap.get(temp)+1);
			else nmap.put(temp, 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (!nmap.containsKey(temp)) bw.write("0");
			else {
				bw.write(String.valueOf(nmap.get(temp)));
			}
			bw.write(" ");
		}
		
		bw.flush();
		bw.close();
		
	}	
}
