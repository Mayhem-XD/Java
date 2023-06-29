package ch13.sec01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		int n = 10000,m=100000;
//		List 앞에 10000회 추가하는 경우
		long startTime = System.nanoTime();
		for(int i=0;i<n;i++) al.add(0,String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("list 시간 "+(endTime-startTime)+" ns");		// 13 ms
//		LinkedList 앞에
		startTime = System.nanoTime();
		for(int i=0;i<n;i++) ll.add(0,String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("linked 시간 "+(endTime-startTime)+" ns");		// 2 ms
//		List 뒤에 100000회 추가하는 경우
		startTime = System.nanoTime();
		for(int i=0;i<m;i++) al.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("list 시간 "+(endTime-startTime)+" ns");		// 10 ms
//		LinkedList 뒤에
		startTime = System.nanoTime();
		for(int i=0;i<m;i++) ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("linked 시간 "+(endTime-startTime)+" ns");	// 34 ms

	}

}
