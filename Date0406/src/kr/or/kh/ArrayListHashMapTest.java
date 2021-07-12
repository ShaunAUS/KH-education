package kr.or.kh;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMapTest {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>>haksaList=new ArrayList<HashMap<String,String>>();
		HashMap<String,String> haksaHash = new HashMap<String,String>();
		haksaList.add(haksaHash);
		System.out.println(haksaList.get(0));
	}

}
