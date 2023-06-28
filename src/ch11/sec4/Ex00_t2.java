package ch11.sec4;

public class Ex00_t2 {

	public static void main(String[] args) {
		
		System.out.println(Strings.isPalindrome("토마토"));
		int maxPal=0,x=0,y=0;
		for(int i = 100;i<1000;i++) {
			for(int k=i;k<1000;k++) {
				int mul =i*k;
				if(Strings.isPalindrome(String.valueOf(mul))) {
					if(i*k>maxPal) {
						maxPal = i * k;
						x = i; y=k;
					}
				}
			}
		}
		System.out.printf("%d * %d = %d\n",x,y,maxPal);
		
	}

}
