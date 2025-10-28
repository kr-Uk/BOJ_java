package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2606{
    public static void main(String[] args) throws IOException {
        Solution2606 s = new Solution2606();
        s.solve();
    }
}

class Solution2606{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        
        int[][] graph = new int[v+1][v+1];
        int[] visited = new int[v+1];
        
        StringTokenizer st;
        for(int i=0; i<e; i++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	graph[start][end] = 1;
        	graph[end][start] = 1;
        }
        
        visited[1] = 1;
        dfs(graph, visited, 1, v);
        
        int result = 0;
        
        for(int i=2; i<=v; i++) {
        	if(visited[i] == 1) {
        		result++;
        	}
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

	private void dfs(int[][] graph, int[] visited, int start, int n) {
		for (int i=1; i<=n; i++) {
			if (graph[start][i] == 1) {
				if (visited[i] == 0) {
					visited[i] = 1;
					dfs(graph, visited, i, n);
				}
			}
		}
	}
    
    
}