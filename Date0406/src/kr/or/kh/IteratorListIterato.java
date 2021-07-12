package kr.or.kh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIterato {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("축구");
		a1.add("농구");
		a1.add("야구");
		a1.add("격투기");
		System.out.println("Iterator을 이용한 출력");
		Iterator<String> it= a1.iterator();
		while(it.hasNext()) {
			System.out.println();
		}
		
	System.out.println();
	System.out.println("ListIterator을 이용한 전방향 출력");
	ListIterator<String> lt = new a1.ListIterator();
	while(lt.hasNext()) {
		System.out.println(lt.next());
		
	}
	
	while(lt.hasPrevious()) {
		System.out.println(lt.previous());
	}
	}

}
