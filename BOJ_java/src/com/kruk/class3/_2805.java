/**
 * sum ���� int�� �ƴ� long���� �ϱ� !!
 * upperbound // min���� mid+1 => ������� min-1
 * ��? ���̰� �� ���� -> min�� ���� -> ���̰� �� ���� �̸� ���̰� �� ������ ���̴ϱ� !
 */

package com.kruk.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2805{
    public static void main(String[] args) throws IOException {
        Solution2805 s = new Solution2805();
        s.solve();
    }
}

class Solution2805{
    
    void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken()); // m�� long���� �б�
        
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        int max = 0;
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }
        
        int min = 0;
        int ans = 0;
        
        while(min <= max) {
            int mid = (min + max) / 2;
            long sum = 0L;
            
            for(int a : arr) {
                if (a > mid) sum += (a - mid);
            }
            
            if (sum >= m) {
                ans = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
