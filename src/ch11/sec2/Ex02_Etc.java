package ch11.sec2;

public class Ex02_Etc {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String username = System.getProperty("user.name");
		System.out.println(osName+" "+username);
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);

	}

}
