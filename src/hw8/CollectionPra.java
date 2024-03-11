package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPra {

	public static void main(String[] args) {
		List<Object> obj = new ArrayList<>();
		
		obj.add(100);
		obj.add(3.14);
		obj.add(21L);
		obj.add(Short.valueOf("100"));
		obj.add(5.1);
		obj.add("Kitty");
		obj.add(100);
		obj.add(new Object());
		obj.add("Snoopy");
		obj.add(new BigInteger("1000"));
		
		System.out.println("==========================");
		System.out.println("使用for印出：");
		System.out.println("==========================");
		for(int i = 0 ; i < obj.size() ; i++) {
			System.out.println(obj.get(i));
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("使用foreach印出：");
		System.out.println("==========================");
		for(Object i : obj) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("使用Iterator印出：");
		System.out.println("==========================");
		Iterator<Object> it = obj.iterator();
		while(it.hasNext()) {
			Object tempObj = it.next();
			System.out.println(tempObj);
			if(!(tempObj instanceof Number)) {
				it.remove();
			}
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("移除不是Number物件後印出：");
		System.out.println("==========================");
		
		it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
