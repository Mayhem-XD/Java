package ch00.sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise07_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int addSum = 0;
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			if(check())
				addSum++;
		}
		System.out.println(addSum);
	}
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if (prev != now) {		
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;	
				}
				else 
					return false;	
			}
		}    
		return true;
	}

}
