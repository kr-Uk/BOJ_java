package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _1012{
    public static void main(String[] args) throws IOException {
        Solution1012 s = new Solution1012();
        s.solve();
    }
}

class Solution1012{
	
	static int[][] graph;
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int test=0; test<t; test++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            graph = new int[n][m];
            
            for(int i=0; i<k; i++) {
            	st = new StringTokenizer(br.readLine());
            	int x = Integer.parseInt(st.nextToken());
            	int y = Integer.parseInt(st.nextToken());
            	graph[y][x] = 1;
            }
            
            int result = 0;
            
            for(int j=0; j<n; j++) {
            	for(int l=0; l<m; l++) {
            		if (graph[j][l] == 1) {
            			graph[j][l] = 0;
            			bfs(j, l, n, m);
            			result++;
            		}
            	}
            }
            
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }

	private void bfs(int y, int x, int n, int m) {
		Deque<int[]> q = new ArrayDeque<int[]>();
		q.add(new int[]{x, y});
		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		while(!q.isEmpty()){
			int[] temp = q.poll();
			int _x = temp[0];
			int _y = temp[1];
			
			for(int i=0; i<4; i++) {
				int nx = _x + dx[i];
				int ny = _y + dy[i];
				
				if (0 <= nx && nx < m && 0 <= ny && ny < n) {
					if (graph[ny][nx] == 1) {
						graph[ny][nx] = 0;
						q.add(new int[] {nx, ny});
					}
				}
			}
			
		}
	}
}