package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _11866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution11866 s = new Solution11866();
		s.solve();
	}
}

class Solution11866{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) list.add(i);
		
		int idx = -1;
		
		bw.write("<");
		idx = ((idx+k) % n);
		bw.write(list.get(idx).toString());
		list.remove(idx--);
		n--;
		
		while(list.size() > 0) {
			idx = (idx+k) % n;
			bw.write(", " + list.get(idx).toString());
			list.remove(idx--);
			n--;
		}
		
		bw.write(">");
		
		bw.flush();
		bw.close();
		
	}	
}