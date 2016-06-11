package xyz.taoge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author zt851 
 *  hailstone ���� 
 * ��1������һ��������n�� 
 * ��2�����n=1�������
 * ��3�����n����������n��Ϊ3n+1������n��Ϊn/2�� 
 * ��4��ת��ڣ�2������
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
		System.out.print("Hailstone����[" + number + "]:���");
		ArrayList<Integer> result = hailstone(number);
		System.out.println(result);
		System.out.print("�ܳ��ȣ�" + result.size());
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
		//ʵ������ӿڣ��Խ����������
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
