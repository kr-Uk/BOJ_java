package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2630{
    public static void main(String[] args) throws IOException {
        Solution2630 s = new Solution2630();
        s.solve();
    }
}

class Solution2630{
	
	static int[][] graph;
	static int[] result = new int[] {0, 0};
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        graph = new int[n][n];
        
        StringTokenizer st;
        
        for (int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<n; j++) graph[i][j] = Integer.parseInt(st.nextToken());
        }
        
        search(0, 0, n);
        
        bw.write(String.valueOf(result[0]));
        bw.newLine();
        bw.write(String.valueOf(result[1]));
        
        bw.flush();
        bw.close();
    }

	private void search(int x, int y, int n) {
		
		if (n==1) {
			result[graph[y][x]]++;
			return;
		}
		
		boolean zero = true;
		boolean one = true;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(graph[y+i][x+j] != 0) {
					zero = false;
					break;
				}
			}
		}
		
		if (zero){
			result[0]++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(graph[y+i][x+j] != 1) {
					one = false;
					break;
				}
			}
		}
		
		if (one){
			result[1]++;
			return;
		}
		
		search(x, y, n/2);
		search(x+n/2, y, n/2);
		search(x, y+n/2, n/2);
		search(x+n/2, y+n/2, n/2);
		
		return;
	}
    
    
}