package demo02Stream;

import java.util.ArrayList;

/*
 * ����for���������ೡ��
 */
public class Demo01ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("����ӱ,98");
		list.add("¹��,95");
		list.add("��С��,87");
				
		ArrayList<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String record = list.get(i);
			String[] array = record.split(",");
			String score = array[1];
			newList.add(score);
		}
		
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < newList.size(); i++) {
			String score = newList.get(i);
			int num = Integer.parseInt(score);
			numList.add(num);
		}
		
		ArrayList<Integer> resultList = new ArrayList<>();
		for (int i = 0; i < numList.size(); i++) {
			int num = numList.get(i);
			if (num > 90) {
				resultList.add(num);
			}
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
		
		
		
	}
	
}
