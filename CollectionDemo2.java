package datastructure;

import java.util.ArrayList;
import java.util.Collection;
/*
 * Collection
 * 		boolean add(E e)
 * 		void clear()
 * 		boolean contains(Object o)
 * 		boolean isEmpty()
 * 		boolean remove(Object o)
 * 		int size()
 * 		Object[] toArray()
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		//boolean add(E e)
		c.add("hello");
		c.add("world");
		c.add(1);
		c.add(true);
		c.add(1.2);
		System.out.println(c);
		
		//void clear()
		//c.clear();
		System.out.println(c);
		
		//boolean contains(Object o)
		boolean flag1 = c.contains("hello");
		System.out.println(flag1);
		System.out.println(c);
		//boolean isEmpty()
		boolean flag = false;
		if(c!=null&&!c.isEmpty()) {
			flag = true;
		}
		System.out.println(flag);
		
		//boolean remove(Object o)
		boolean f = c.remove("world1");
		System.out.println(f);
		System.out.println(c);
		
		//int size()
		System.out.println(c.size());
		
		//Object[] toArray()
		Object[] objs = c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
	}

}
