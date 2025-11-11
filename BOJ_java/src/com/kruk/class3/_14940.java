package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _14940{
    public static void main(String[] args) throws IOException {
        Solution14940 s = new Solution14940();
        s.solve();
    }
}

class Solution14940{
	
	static int[][] graph;
	static int[] dx = new int[] {1, -1, 0, 0};
	static int[] dy = new int[] {0, 0, 1, -1};
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        graph = new int[n][m];
        
        int start_x = 0;
        int start_y = 0;
        
        for(int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<m; j++) {
        		graph[i][j] = Integer.parseInt(st.nextToken());
        		if (graph[i][j] == 2) {
        			start_x = j;
        			start_y = i;
        		}
        	}
        }
        
        bfs(n, m, start_x, start_y);
        
        for(int i=0; i<n; i++) {
        	for (int j=0; j<m; j++) {
        		bw.write(String.valueOf(graph[i][j]) + " ");
        	}
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }

	private void bfs(int n, int m, int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {x, y});
		graph[y][x] = 0;
		
		while(!q.isEmpty()) {
			int[] coor = q.poll();
			for (int i=0; i<4; i++) {
				int _x = coor[0] + dx[i];
				int _y = coor[1] + dy[i];
				if (_x >= 0 && _x < m && _y >= 0 && _y < n){
					if ((graph[_y][_x] == 1 || graph[_y][_x] > graph[coor[1]][coor[0]]+1)
							&& graph[_y][_x] != 0) {
						q.add(new int[] {_x, _y});
						graph[_y][_x] = graph[coor[1]][coor[0]] + 1;
					}
				}
			}
		}
		
		for (int i=0; i<4; i++) {
			int _x = x + dx[i];
			int _y = y + dy[i];
			if (_x >= 0 && _x < m && _y >= 0 && _y < n){
				graph[_y][_x] = 1;
			}
		}
	}
}