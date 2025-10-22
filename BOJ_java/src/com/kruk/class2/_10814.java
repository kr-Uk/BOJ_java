package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class _10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution10814 s = new Solution10814();
		s.solve();
	}
}

class Solution10814{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			String value = st.nextToken();
			if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
			map.get(key).add(value);
		}
		
		for (Integer key : map.keySet()) {
			for (String s : map.get(key)) {
				bw.write(String.valueOf(key) + " " + s);
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		
	}	
}
