package ch13.sec01;

//	import java.util.* 		사용가능한데 비권장

import java.util.ArrayList;
import java.util.List;

public class Ex02_BoardList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
//		객체 추가
		list.add(new Board(1,"James","title","contents"));
		list.add(new Board(2,"Maria","subject","something"));
//		객체 순회 출력
		list.forEach(x->System.out.println(x));
		
		list = generateBoard(3);
		list.forEach(x->System.out.println(x));
		
		Board board = searchBoard(list, 102);
		System.out.println("검색결과> "+board);
		
		
	}

	private static List<Board> generateBoard(int count) {
		List<Board> list = new ArrayList<Board>();
		for(int i=1;i<=count;i++) {
			list.add(new Board(100+i,"저자"+i,"제목"+i,"내용"+i));	// Board board = new Board(내용) ~ list.add(board)
		}
		return list;
	}
	
	private static Board searchBoard(List<Board> list,int id) {
		for(Board board: list) {
			if(board.getBid()==id) return board;
		}
		return null;
		
	}
	
	
}
