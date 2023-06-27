package ch11.sec1;

import java.util.Objects;

public class Key2 {
	int number;
//	String name;
	Key2(int number){ this.number = number;}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key2) {
			Key2 key = (Key2) obj;
			if (number == key.number)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
//		return number;
//		return Objects.hash(number,name);
		return Objects.hash(number);
	}
}

