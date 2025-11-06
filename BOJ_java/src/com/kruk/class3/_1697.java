package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        } else {
        	int[] dp = new int[k+1];
            
            int cnt = 0;
            for (int i=n; i<=k; i++) {
            	dp[i] = cnt;
            	cnt++;
            }
            
            cnt = 0;
            
            for (int i=n; i>=0; i--) {
            	dp[i] = cnt;
            	cnt++;
            }
            
            for(int i=n+1; i<=k; i++) {
            	dp[i] = Math.min(dp[i], dp[i-1]+1);
            	if (i%2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
            
            bw.write(String.valueOf(dp[k]));
        }
        
        bw.flush();
        bw.close();
    }
}