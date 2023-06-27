package ch10;

public class Ex07_MultiCatch {

	public static void main(String[] args) {
		String str = null;
		int value = 0;
		try {
			str = args[0];
			value = Integer.parseInt(str);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 숫자형식");
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			
		}
		System.out.println(value);
		
	}

}
