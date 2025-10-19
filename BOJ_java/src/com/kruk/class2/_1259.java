package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.solve();
    }
}

class Solution{

    public static int anw = 0;

    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String str = br.readLine();
            if (str.equals("0")) break;

            boolean is_n = true;
            int l = str.length();
            for (int i=0; i<l/2; i++){
                if (str.charAt(i) != str.charAt(l-i-1)) {
                    is_n = false;
                    break;
                }
            }

            if (is_n) bw.write("yes");
            else bw.write("no");

            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}