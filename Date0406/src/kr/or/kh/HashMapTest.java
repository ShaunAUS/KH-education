package kr.or.kh;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> hashTest= new HashMap<String,String>();
		hashTest.put("id", "ladagers");
		hashTest.put("pw", "1234");
		System.out.println(hashTest.get("id"));
		System.out.println(hashTest.get("pw"));
	}
}
