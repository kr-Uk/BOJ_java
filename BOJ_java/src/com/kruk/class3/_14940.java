package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _14940{
    public static void main(String[] args) throws IOException {
        Solution14940 s = new Solution14940();
        s.solve();
    }
}

class Solution14940{
	
	static int[][] graph;
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        graph = new int[n][m];
        
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<m; j++) graph[i][j] = Integer.parseInt(st.nextToken());
        }
        
        bfs(n, m);
        
        bw.flush();
        bw.close();
    }

	private void bfs(int n, int m) {
		
		
	}
}