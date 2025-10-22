package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _1920{
    public static void main(String[] args) throws IOException {
        Solution1920 s = new Solution1920();
        s.solve();
    }
}

class Solution1920{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<Integer>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) s.add(Integer.parseInt(st.nextToken()));
        
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<m; i++) {
        	if(s.contains(arr[i])) {
        		bw.write(String.valueOf(1));
        		bw.newLine();
        		continue;
        	}
        	bw.write(String.valueOf(0));
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}