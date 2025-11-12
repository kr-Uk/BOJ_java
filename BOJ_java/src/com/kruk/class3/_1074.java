package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1074{
    public static void main(String[] args) throws IOException {
        Solution1074 s = new Solution1074();
        s.solve();
    }
}

class Solution1074{
	
	static int[][] graph;
	static int cnt = 0;
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        graph = new int[(int) Math.pow(2, n)][(int) Math.pow(2, n)];
        
        Z(n, 0, 0);
        
        bw.write(String.valueOf(graph[r][c]));
        
        
        bw.flush();
        bw.close();
    }
    
	private void Z(int n, int x, int y) {
		if (n == 1) {
			graph[y][x] = cnt++;
			graph[y][x+1] = cnt++;
			graph[y+1][x] = cnt++;
			graph[y+1][x+1] = cnt++;
		} else {
			int d =(int) Math.pow(2, n)/2;
			Z(n-1, x, y);
			Z(n-1, x+d, y);
			Z(n-1, x, y+d);
			Z(n-1, x+d, y+d);
		}
		return;
	}
}