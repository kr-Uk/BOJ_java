package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _1764{
    public static void main(String[] args) throws IOException {
        Solution1764 s = new Solution1764();
        s.solve();
    }
}

class Solution1764{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> s1 = new TreeSet<String>();
        Set<String> s2 = new TreeSet<String>();
        
        for(int i=0; i<n; i++) s1.add(br.readLine());
        for(int i=0; i<m; i++) s2.add(br.readLine());
        
        s1.retainAll(s2);
        
        bw.write(String.valueOf(s1.size()));
        bw.newLine();
        for(String s : s1) {
        	bw.write(s);
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}