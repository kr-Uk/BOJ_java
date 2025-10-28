package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _11723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution11723 s = new Solution11723();
		s.solve();
	}
}

class Solution11723 {
	
	static Set<Integer> set = new HashSet<Integer>();

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("add")) {
			    Add(Integer.parseInt(st.nextToken()));
			} else if (command.equals("check")) {
			    bw.write(String.valueOf(Check(Integer.parseInt(st.nextToken()))));
			    bw.newLine();
			} else if (command.equals("remove")) {
				Remove(Integer.parseInt(st.nextToken()));
			} else if (command.equals("toggle")) {
			    Toggle(Integer.parseInt(st.nextToken()));
			} else if (command.equals("all")) {
				All(set);
			} else if (command.equals("empty")) {
			    Empty(set);
			} else {
			    bw.write("Ä¿¸àµå ¿À·ù");
			    bw.newLine();
			}

		}
		bw.flush();
		bw.close();
	}

	private void Add(int n) {
		set.add(n);
	}

	private int Check(int n) {
		return set.contains(n) ? 1 : 0;
	}
	
	private void Remove(int n) {
		if (set.contains(n)) set.remove(n);
	}
	
	private void Toggle(int n) {
		if (set.contains(n)) set.remove(n);
		else set.add(n);
	}
	
	private void All(Set<Integer> s) {
		Set<Integer> temp = new HashSet<Integer>();
		for(int i=1; i<=20; i++) temp.add(i);
		set = temp;
	}
	
	private void Empty(Set<Integer> s) {
		Set<Integer> temp = new HashSet<Integer>();
		set = temp;
	}
}
