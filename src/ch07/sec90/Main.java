package ch07.sec90;

public class Main {

	public static void main(String[] args) {
		 method(new LoginServlet());
		 method(new FileDownLoadServlet());

	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
