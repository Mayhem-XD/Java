package ch11.sec1;

import java.util.HashMap;
import java.util.Map;

public class Ex02_HashCode {

	public static void main(String[] args) {
		Key key1 = new Key(3);
		Key key2 = new Key(3);
		System.out.println(key1.equals(key2));
		System.out.println(key1.hashCode()+" , "+key2.hashCode());
		
		Map<Key, String> hashMap = new HashMap<>();
		
		hashMap.put(key1, "James");
		hashMap.put(key2, "Maria");

		
		System.out.println(hashMap.get(key1));
		System.out.println(hashMap.get(key2));
		
		
		// Key class에서 hashCode method를 재정의하기 이전
		System.out.println(key1.hashCode() + ", " + key2.hashCode());
		
		Map<Key2, String> hashMap2 = new HashMap<>();
//		key값이 같으면 안돼
		Key2 key21 = new Key2(3);
		Key2 key22 = new Key2(4);	//	같으면 기존 key가 가리키는 value를 변경함
		hashMap2.put(key21, "James");
		hashMap2.put(key22, "Maria");
		System.out.println(key21.hashCode() + ", " + key22.hashCode());
		// Key class에서 hashCode method를 재정의
		System.out.println(hashMap2.get(key21));
		System.out.println(hashMap2.get(key22));
		
	}

}
