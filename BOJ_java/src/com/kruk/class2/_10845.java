package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution10845 s = new Solution10845();
		s.solve();
	}
}

class Solution10845 {

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> queue = new ArrayDeque<Integer>();

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("push")) {
			    Push(queue, Integer.parseInt(st.nextToken()));
			} else if (command.equals("pop")) {
			    bw.write(String.valueOf(Pop(queue)));
			    bw.newLine();
			} else if (command.equals("size")) {
			    bw.write(String.valueOf(Size(queue)));
			    bw.newLine();
			} else if (command.equals("empty")) {
			    bw.write(String.valueOf(Empty(queue)));
			    bw.newLine();
			} else if (command.equals("front")) {
			    bw.write(String.valueOf(Front(queue)));
			    bw.newLine();
			} else if (command.equals("back")) {
			    bw.write(String.valueOf(Back(queue)));
			    bw.newLine();
			} else {
			    bw.write("Ä¿¸àµå ¿À·ù");
			    bw.newLine();
			}

		}
		bw.flush();
		bw.close();
	}

	private void Push(Deque<Integer> q, int n) {
		q.add(n);
	}

	private int Pop(Deque<Integer> q) {
		return q.size() != 0 ? q.poll() : -1;
	}

	private int Size(Deque<Integer> q) {
		return q.size();
	}

	private int Empty(Deque<Integer> q) {
		return q.size() == 0 ? 1 : 0;
	}

	private int Front(Deque<Integer> q) {
		return q.size() != 0 ? q.peek() : -1;
	}
	
	private int Back(Deque<Integer> q) {
		return q.size() != 0 ? q.peekLast() : -1;
	}
}
