package ch13.sec90;

import java.util.List;

public class Exercise07 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		list.forEach(x->System.out.println(x.getTitle()+"-"+x.getContent()));

	}

}
