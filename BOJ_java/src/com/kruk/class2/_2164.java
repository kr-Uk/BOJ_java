package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class _2164{
    public static void main(String[] args) throws IOException {
        Solution2164 s = new Solution2164();
        s.solve();
    }
}

class Solution2164{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i=1; i<=n; i++) q.add(i);
        
        while(q.size() > 1) {
        	q.remove();
        	q.add(q.remove());
        }
        
        bw.write(String.valueOf(q.element()));
        bw.flush();
        bw.close();
    }
}