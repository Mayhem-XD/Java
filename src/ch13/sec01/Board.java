package ch13.sec01;

public class Board {
	
	private int bid;
	private String writer;
	private String subject;
	private String content;
	
//	생성자
	public Board() {}
	
	public Board(String writer, String subject, String content) {
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}
	
	public Board(int bid, String writer, String subject, String content) {
		this.bid = bid;
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}
//	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", writer=" + writer + ", subject=" + subject + ", content=" + content + "]";
	}
	
}
