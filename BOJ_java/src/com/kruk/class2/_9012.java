package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class _9012{
    public static void main(String[] args) throws IOException {
        Solution9012 s = new Solution9012();
        s.solve();
    }
}

class Solution9012{
	
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Character> c;
        
        for (int i=0; i<n; i++) {
        	c = new Stack<Character>();
        	String temp = br.readLine();
        	for (int idx=0; idx<temp.length(); idx++) {
        		if (temp.charAt(idx) == '(') c.push('(');
        		else if(!c.empty())c.pop();
        		else {
        			c.push(')');
        			break;
        		}
        		
        	}
        	
        	if(c.empty()) bw.write("YES");
        	else bw.write("NO");
        	bw.newLine();
        	
        }
        
        bw.flush();
        bw.close();
    }
}