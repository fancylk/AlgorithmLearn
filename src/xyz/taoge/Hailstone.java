package xyz.taoge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author zt851 
 *  hailstone 问题 
 * （1）输入一个正整数n； 
 * （2）如果n=1则结束；
 * （3）如果n是奇数，则n变为3n+1，否则n变为n/2； 
 * （4）转入第（2）步。
 */
public class Hailstone {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Hailstone问题[" + number + "]:结果");
		ArrayList<Integer> result = hailstone(number);
		System.out.println(result);
		System.out.print("总长度：" + result.size());
		System.out.println();
	}

	private static ArrayList<Integer> hailstone(int i) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(i);
		while (i > 1) {
			if (i % 2 == 1) {
				i = 3 * i + 1;
				result.add(i);
			} else if (i % 2 == 0) {
				i = i / 2;
				result.add(i);
			}
		}
		//实现排序接口，对结果进行排序
		/*result.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});*/
		return result;
	}

}
