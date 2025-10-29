package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class _1927{
    public static void main(String[] args) throws IOException {
        Solution1927 s = new Solution1927();
        s.solve();
    }
}

class Solution1927{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for (int i=0; i<n; i++) {
        	int x = Integer.parseInt(br.readLine());
        	if (x != 0) {
        		minHeap.offer(x);
        	} else {
        		bw.write(minHeap.isEmpty() ? "0" : String.valueOf(minHeap.poll()));
        		bw.newLine();
        	}
        }
        
        bw.flush();
        bw.close();
    }
}