package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution10828 s = new Solution10828();
		s.solve();
	}
}

class Solution10828 {

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<Integer>();

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
			case "push":
				Push(stack, Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write(String.valueOf(Pop(stack)));
				bw.newLine();
				break;
			case "size":
				bw.write(String.valueOf(Size(stack)));
				bw.newLine();
				break;
			case "empty":
				bw.write(String.valueOf(Empty(stack)));
				bw.newLine();
				break;
			case "top":
				bw.write(String.valueOf(Top(stack)));
				bw.newLine();
				break;
			default:
				bw.write("입력 오류");
				bw.newLine();
				break;
			}
		}
		bw.flush();
		bw.close();
	}

	private void Push(Stack<Integer> s, int n) {
		s.add(n);
	}

	private int Pop(Stack<Integer> s) {
		return s.size() != 0 ? s.pop() : -1;
	}

	private int Size(Stack<Integer> s) {
		return s.size();
	}

	private int Empty(Stack<Integer> s) {
		return s.size() == 0 ? 1 : 0;
	}

	private int Top(Stack<Integer> s) {
		return s.size() != 0 ? s.peek() : -1;
	}
}
