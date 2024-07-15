package datastructure;

import java.util.ArrayList;
import java.util.Collection;
/*
 * foreach：增强for循环，一般用于遍历集合或者数组
 * 格式：
 * 		for(元素的类型 变量：集合或者数组对象){
 * 			可以直接使用变量;
 * 		}
 * 	注意：在增强for循环中不能修改集合，否则会出现并发修改异常。
 * 
 * 	public interface Iterable<T>
 * 	实现这个接口允许对象成为"foreach"语句的目标。
 */
public class ForEachDemo {

	public static void main(String[] args) {
		//创建集合对象
		Collection<String> c = new ArrayList<String>();
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//增强for循环遍历集合
		for(Object obj: c) {
			System.out.println(obj);
		}
		
		for(String s: c) {
			s = s.toUpperCase() + "其他的内容";
			System.out.println(s);
		}
		
		for(String s: c) {
			System.out.println(s);
		}
		/*
		for(String s: c) {
			c.add("android");
			System.out.println(s);
			}
			*/
		
		Collection<Student> c2 = new ArrayList<Student>();
		c2.add(new Student("张三",20));
		c2.add(new Student("李四",18));
		
		for(Student student: c2) {
			System.out.println("name: "+student.name+"	age: "+student.age);
			student.name = student.name + "xx";
			//c2.add(new Student("王五",22));
		}
		
		for(Student student: c2) {
			System.out.println("name: "+student.name+"	age: "+student.age);
		}
	}
}
