package ch11.sec1;

public class Key {
	int number;
	Key(int number){ this.number = number;}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if (number == key.number)
				return true;
		}
		return false;
	}
}

