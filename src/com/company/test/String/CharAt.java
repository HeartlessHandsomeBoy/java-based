package com.company.test.String;

/**
 * @author Brave
 * @Classname CharAt
 * @Description String 类的charAt方法
 * @Date 2020/5/8 11:54
 * @Version V1.0
 */
public class CharAt {
	public static void main(String[] args) {
		String s = "com.company";
		/*char c = s.charAt(0);
		System.out.println("c的值是:"+c);
			//输出：c的值是:c

		*/

		char c = s.charAt(2);
		System.out.println("c的值是:"+c);
		/*	//输出：c的值是:m
		*/

		/*
		结论：charAt方法的用法是字符串的第index下标个位置的字符，类型为char
			[index下标从0开始]
		 */


	}
}
