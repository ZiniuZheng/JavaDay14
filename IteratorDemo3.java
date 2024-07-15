package datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * 需求：判断集合中是否包含元素java，如果有则添加元素android
 * Exception in thread "main" java.util.ConcurrentModificationException：并发修改异常
 * 迭代器是依赖于集合的，相当于集合的一个副本，当迭代器在操作的时候，如果发现和集合不一样，则抛出异常
 * 
 * 解决方案：
 * 		你就别使用迭代器
 * 		在使用迭代器进行遍历的时候使用迭代器来进行修改
 * 		用ListIterator
 */
public class IteratorDemo3 {

	public static void main(String[] args) {
		//创建集合对象
		List c = new ArrayList();
		
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println(c);
		/*
		//我们可以通过遍历来获取集合中的每一个元素，然后进行比较即可
		Iterator it = c.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if(s.equals("java")) {
				c.add("android");
			}
		}
		System.out.println(c);
		*/
		
		ListIterator lit = c.listIterator();
		while(lit.hasNext()) {
			String s = (String)lit.next();
			if(s.equals("java")) {
				lit.remove();
				lit.add("android");
			}
		}
		System.out.println(c);
	}
}
