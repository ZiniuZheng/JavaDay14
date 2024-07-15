package datastructure;

import java.util.LinkedList;
/*
 * List的常用子类：
 * 		ArrayList
 * 			底层是数组结构，查询快，增删慢
 * 		LinkedList
 * 			底层结构是链表，查询慢，增删快
 * 
 * 如何选择使用不同的集合？
 * 		如果查询多，增删少，则使用ArrayList
 * 		如果查询少，增删多，则使用LinkedList
 * 		如果你不知道使用什么，则使用ArrayList
 * 
 * LinkedList的特有功能：
 * 			void addFirst(E e)
 * 			void addLast(E e)
 * 			E getFirst()
 * 			E getLast()
 * 			E removeFirst()
 * 			E removeLast()
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		//创建对象
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("world");
		
		//void addFirst(E e): 将元素添加到索引为0的位置
		list.addFirst("java");
		
		//void addLast(E e): 将元素添加到索引为size()-1的位置
		list.addLast("android");
		
		//E getFirst(): 获取索引为0的元素
		System.out.println(list.getFirst());
		
		//E getLast(): 获取索引为size()-1的元素
		System.out.println(list.getLast());
		
		//输出list
		System.out.println(list);
		
		//E removeFirst(): 删除索引为0的元素并返回
		System.out.println(list.removeFirst());
		
		//E removeLast(): 删除索引为size()-1的元素并返回
		System.out.println(list.removeLast());
		
		//输出list
		System.out.println(list);
	}
}
