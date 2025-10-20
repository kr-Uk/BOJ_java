package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11050{
    public static void main(String[] args) throws IOException {
        Solution11050 s = new Solution11050();
        s.solve();
    }
}

class Solution11050{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int num = 1;
        int den = 1;
        
        for(int i=0; i<k; i++) {
        	num *= (n-i);
        	den *= (k-i);
        }
        
        bw.write(String.valueOf(num/den));
        bw.flush();
        bw.close();
    }
}