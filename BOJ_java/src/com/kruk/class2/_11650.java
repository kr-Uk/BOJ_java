package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class _11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution11650 s = new Solution11650();
		s.solve();
	}
}

class Solution11650{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<Coor> c = new ArrayList<Coor>();
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			c.add(new Coor(x, y));
		}
		
		Collections.sort(c);
		
		for (int i=0; i<n; i++) {
			bw.write(String.valueOf(c.get(i).x) + " " + String.valueOf(c.get(i).y));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}	
}

class Coor implements Comparable<Coor>{
	int x;
	int y;
	
	public Coor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int compareTo(Coor c) {
		if(this.x > c.x ||
				(this.x == c.x && this.y > c.y)) {
			return 1;
		} else return -1;
	}
}