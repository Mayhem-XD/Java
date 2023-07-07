package mysql.Ex07_BBS;

import java.util.List;

import mysql.Ex07_BBS.dao.BoardDao;
import mysql.Ex07_BBS.entity.Board;

public class BoardTest {

	public static void main(String[] args) {

		BoardDao bDao = new BoardDao();
		
//		Board b1 = new Board("첫번째 글","첫번째 글입니다.","james");
//		Board b2 = new Board("두번째 글","두번째 글입니다.","maria");
//		bDao.insertBoard(b1);
//		bDao.insertBoard(b2);
		
		List<Board> list = bDao.getBoardList("uid","maria" ,10, 0);
		
		for(Board b:list)
			System.out.println(b);
		System.out.println("=========================================");
		
		Board board = bDao.getBoard(5);
		System.out.println(board);
		System.out.println("=========================================");
		
		bDao.increaseViewCount(5);
		Board board2 = bDao.getBoard(5);
		System.out.println(board2);
		
		System.out.println("=========================================");
		bDao.increaseReplyCount(3);
		Board board3 = bDao.getBoard(3);
		System.out.println(board3);
		
		System.out.println("=========================================");
		Board board4 = bDao.getBoard(3);
		board4.setTitle("세번째 글 수정");
		board4.setContent("세번째 글을 수정");
		board4.setViewCount(2);
		board4.setReplyCount(3);
		bDao.updateBoard(board4);
		System.out.println(board4);
		
		System.out.println("=========================================");
		bDao.deleteBoard(2);
		list = bDao.getBoardList("uid", "maria", 10, 0);
		list.forEach(x->System.out.println(x));
		
		
	}

}
