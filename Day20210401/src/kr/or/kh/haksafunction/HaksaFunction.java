package kr.or.kh.haksafunction;

import java.util.HashMap;
import java.util.Scanner;

public class HaksaFunction {
	
	public static void register(int cnt,Scanner input,ArrayList<Hashmap<String,String>>) {//등록함수
		
	
    if(cnt==1) { //등록의 시작
        System.out.println("등록");
        System.out.println("=======메뉴 선택======");
        System.out.println("1.학생");
        System.out.println("2.교수");
        System.out.println("3.관리자");
        System.out.println("4.이전메뉴");
        System.out.println("번호를 선택해 주세요..");
        cnt = input.nextInt();
        if(cnt==1) {//학생시작
           HashMap<String,String> haksaHash = new HashMap<String,String>();
           System.out.println("나이:");
           String age = input.next();
           System.out.println("이름:");
           String irum = input.next();
           System.out.println("학번:");
           String hakbun = input.next();
           haksaHash.put("age", age);
           haksaHash.put("irum", irum);
           haksaHash.put("hakbun", hakbun);
           haksaHash.put("gubun", "학생");
           haksaList.add(haksaHash);
           System.out.println("학생이등록되었습니다.");

           //학생끝
        }else if(cnt==2) { //교수의 시작
           HashMap<String,String> haksaHash = new HashMap<String,String>();
           System.out.println("나이:");
           String age = input.next();
           System.out.println("이름:");
           String irum = input.next();
           System.out.println("과목:");
           String subject = input.next();
           haksaHash.put("age", age);
           haksaHash.put("irum", irum);
           haksaHash.put("subject", subject);
           haksaHash.put("gubun", "교수");
           haksaList.add(haksaHash);
           System.out.println("교수님이 등록되었습니다.");
  
           
           
           //교수끝
        }else if(cnt==3) { // 관리자의 시작
           HashMap<String,String> haksaHash = new HashMap<String,String>();
           System.out.println("나이:");
           String age = input.next();
           System.out.println("이름:");
           String irum = input.next();
           System.out.println("부서:");
           String part = input.next();
           haksaHash.put("age", age);
           haksaHash.put("irum", irum);
           haksaHash.put("part", part);
           haksaHash.put("gubun", "관리자");
           haksaList.add(haksaHash);
           System.out.println("관리자님등록되었습니다.");
     
           
           
           //관리자의 끝
        	}
        } //등록함수의끝
    public static void 
    }//클레스의 끝
