package ch13;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		System.out.println(list.get(0));	//	Java
		System.out.println(list.get(2));	//	Servlet
		System.out.println(list.size()); 	//	3
		
		for(int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
		System.out.println();
		
		for(String element:list) System.out.print(element + " ");
		System.out.println();
		
		list.forEach(x->System.out.println(x));	// lambda x: print(x) (in Python)
		
		list.remove(1);
		list.forEach(x->System.out.println(x));
		System.out.println(list.get(1));	// Servlet -> index 바뀜 | for loop 안에서 list의 element 삭제 ㄴ
		
		list.add("JDbC");
		list.add("spring");
		list.forEach(x->System.out.println(x));
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("spring"));
//		list.clear();
		
		
	}

}

