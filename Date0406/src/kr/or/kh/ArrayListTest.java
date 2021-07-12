package kr.or.kh;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		int i;
		ArrayList<String> array= new ArrayList<String>();
				array.add("한국");	
				array.add("미국");
				array.add("중국");
		System.out.println("ArrayList에 요소 추가하고 출력");
		for(i=0;i<array.size();i++){
			System.out.println(array.get(i));
		}
		System.out.println();
		System.out.println();
		array.remove("미국");
		System.out.println("ArrayList에서 요소제거후 출력");
		for(i=0; i<array.size();i++) {
			System.out.println(i);
		}
		
	}
}
