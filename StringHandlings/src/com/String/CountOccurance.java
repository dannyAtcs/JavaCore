package com.String;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		String[][] ct = new String[s.length()][2];
		int i, j, count = 0;
		for (i = 0; i < s.length(); i++) {
			for (j = i; j < s.length(); j++) {
				if (s.charAt(i) == (s.charAt(j))) {
					count = count + 1;
				}
			}
			if (check(ct, s.charAt(i))) {
				ct[i][0] = "" + s.charAt(i);
				ct[i][1] = "" + count;
			}
			count = 0;
		}
		for (int it = 0; it < ct.length; it++) {
			if (ct[it][0] != null)
				System.out.println(ct[it][0] + ":" + ct[it][1]);
		}
		sc.close();
	}
   
	static boolean check(String ct[][], char c) {
		for (int i = 0; i < ct.length; i++) {
			String d = "" + c;
			System.out.println();
			if (ct[i][0] != null) {
				if (ct[i][0].equals(d)) {
					return false;
				}
			}
		}
		return true;
	}

}