package com.kruk.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Solution1181 s = new Solution1181();
		s.solve();
	}
}

class Solution1181{
	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) arr[i] = br.readLine();
		
		Set<String> stringHashSet = new HashSet<String>();
		
		for(String s : arr) stringHashSet.add(s);
		
		int idx = 0;
		n = stringHashSet.size();
		String[] newArr = new String[n];
		
		for (String s : stringHashSet) newArr[idx++] = s;
		
//		newArr = bubbleSort(newArr, n); 
//		Arrays.sort(newArr);
		Arrays.sort(newArr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				else if(o1.length() == o2.length()) return o1.compareTo(o2);
				else return -1;
			}
		});
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<n; i++) {
			bw.write(newArr[i]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	private String[] bubbleSort(String[] arr, int n) {
		
		for (int i=1; i<n; i++) {
			for (int j=0; j<n-i; j++) {
				if((arr[j].length() == arr[j+1].length() && arr[j].compareTo(arr[j+1]) > 0)
						|| (arr[j].length() > arr[j+1].length())) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
		
		return arr;
	}
}