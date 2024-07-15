package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 需求：1. 定义一个方法，返回指定列表中指定元素的索引位置
 *      2. 判断元素是否存在
 */
public class ListTest {

	public static void main(String[] args) {
		//创建对象
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add(true);
		list.add(1);
		list.add(1.2);
		list.add('a');
		System.out.println("请输入想要查找的元素的个数");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			Scanner sc2 = new Scanner(System.in);
			String s = sc2.nextLine();
			int index = index(list, s);
			
			boolean flag = contains(list, s);
			//boolean flag1 = list.contains(s);
			if(flag == true) {
				System.out.println("该元素在列表的第"+(index+1)+"个位置");
			}else {
				System.out.println("该元素不存在");
			}
		}
	}
	
	public static int index(List list, Object other) {
		for(int i=0;i<list.size();i++) {
			//获取列表中的元素
			Object obj = list.get(i);
			String s = obj.toString();
			//使用列表中的元素和指定的元素进行比较
			if(s.equals(other)) {
				return i;
			}
		}
		//查找不到指定的元素
		return -1;
	}
	
	public static boolean contains(List list, Object other) {
		//获取指定元素在指定列表中的索引位置
		int index = index(list, other);
		
		//如果索引位置大于等于0，则认为元素存在，否则不存在
		if(index >= 0) {
			return true;
		}else {
			return false;
		}
	}
}
