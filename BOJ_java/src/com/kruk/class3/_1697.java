package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697{
    public static void main(String[] args) throws IOException {
        Solution1697 s = new Solution1697();
        s.solve();
    }
}

class Solution1697{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        if (k <= n) {
        	bw.write(String.valueOf(n-k));
        	bw.flush();
        	return;
        } else {
        	int[] visited = new int[100001];
        	
        	Queue<Integer> q = new LinkedList<Integer>();
        	q.add(n);
        	visited[n] = 1;
        	
        	while(!q.isEmpty()) {
        		int curr = q.poll();
        		
        		if (curr == k) {
        			bw.write(String.valueOf(visited[curr]-1));
        			bw.flush();
        			return;
        		}
        		
        		int[] next = {curr-1, curr+1, curr*2};
        		for(int nx : next) {
        			if (nx >= 0 && nx <= 100000 && visited[nx] == 0) {
        				visited[nx] = visited[curr]+ 1;
        				q.add(nx);
        			}
        		}
        	}
        }
        
    }
}