package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11726{
    public static void main(String[] args) throws IOException {
        Solution11726 s = new Solution11726();
        s.solve();
    }
}

class Solution11726{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] dp = new int[1001];
        
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3; i<1001; i++) dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}