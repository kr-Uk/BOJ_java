package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11724{
    public static void main(String[] args) throws IOException {
        Solution11724 s = new Solution11724();
        s.solve();
    }
}

class Solution11724{
	
	static int[][] graph;
	static boolean[] visited;
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	graph[a][b] = 1;
        	graph[b][a] = 1;
        }
        
        int ans = 0;
        
        for(int i=1; i<=n; i++) {
        	if (!visited[i]) {
        		dfs(i, n);
        		ans++;
        	}
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

	private void dfs(int start, int n) {
		visited[start] = true;
		for(int i=1; i<=n; i++) {
			if(graph[start][i] != 0 && !visited[i]) dfs(i, n);
		}
		
		return;
	}
}