package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution1018 s = new Solution1018();
		s.solve();
	}
}

class Solution1018{

	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] chessBoard = new String[n];
		
		for(int i=0; i<n; i++) chessBoard[i] = br.readLine();
		int result = 2500;

		for(int startY=0; startY<n-7; startY++) {
			for(int startX=0; startX<m-7; startX++) {
				int startWhite = 0;
				int startBlack = 0;
				for(int y=startY; y<startY+8; y++) {
					for(int x=startX; x<startX+8; x++) {
						if((y-startY+x-startX) % 2 == 0) { // 0,0
							if(chessBoard[y].charAt(x) == 'B') startWhite++;
							else startBlack++;
							
						} else {
							if(chessBoard[y].charAt(x) == 'W') startWhite++;
							else startBlack++;
						}
					}
				}
				
				int temp = Math.min(startWhite, startBlack);
				result = Math.min(result, temp);
			}
		}

		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		
	}	
}
