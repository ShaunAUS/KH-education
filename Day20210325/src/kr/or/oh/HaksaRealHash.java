package kr.or.oh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaRealHash{

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>(); 
      //String[][] student = new String[2][3];
      //String[][] professor = new String[2][3];
      //String[][] manager = new String[2][3];
      while(true) {//반복문
      System.out.println("======메뉴 선택======");
      System.out.println("1.등록");
      System.out.println("2.찾기");
      System.out.println("3.삭제");
      System.out.println("4.전체출력");
      System.out.println("-----------------");
      System.out.println("0.종료");
      System.out.println("번호를 선택해 주세요...");
        int cnt = input.nextInt();
        if(cnt==1) { //등록의 시작
           System.out.println("등록");
           System.out.println("=======메뉴 선택======");
           System.out.println("1.학생");
           System.out.println("2.교수");
           System.out.println("3.관리자");
           System.out.println("4.이전메뉴");
           System.out.println("번호를 선택해 주세요..");
           cnt = input.nextInt();
           if(cnt==1) {
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
              /*int bunho=0;
              for(int i=0;i<student.length;i++)
              {                  
              System.out.println(++bunho+"번학생등록");              
              System.out.println("나이:");
              student[i][0]=input.next();
              System.out.println("이름:");
              student[i][1]=input.next();
              System.out.println("학번:");
              student[i][2]=input.next();
              } 
              */          
           }else if(cnt==2) {
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
              /*int bunho=0;
              for(int i=0;i<professor.length;i++)
              {                                
              System.out.println(++bunho+"번교수등록");
              System.out.println("나이:");
              professor[i][0]=input.next();
              System.out.println("이름:");
              professor[i][1]=input.next();
              System.out.println("과목:");
              professor[i][2]=input.next();
              }*/
           }else if(cnt==3) {
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
              /*int bunho=0;
              for(int i=0;i<manager.length;i++)
              {                                
              System.out.println(++bunho+"번관리자등록");
              System.out.println("나이:");
              manager[i][0]=input.next();
              System.out.println("이름:");
              manager[i][1]=input.next();
              System.out.println("부서:");
              manager[i][2]=input.next();
              }*/
           }else if(cnt==4) {
              continue;
           }
        }else if(cnt==2) {
        	System.out.println("찾을 이름을 입력해주세요");
        	System.out.println("이름:");
        	String irumSearch = input.next();
        	String gubun="";
        	String irumSearch="";
        	
        	
        	for(int i=0;i<haksaList.size();i++) {
        		HashMap<String,String>haksaHash=haksaList.get(i);
        		gubun=haksaHash.get("gubun");
        		irumSearch=haksaHash.get3("");
        		if(gubun.equals("학생"));{
        			if(irum.equals(irumSearch)) {
        				System.out.print("나이:"+haksaHash.get("age")+"\t");
        				System.out.print("이름:"+haksaHash.get("irum")+"\t");
        				System.out.println("학번:"+haksaHash.get("hakbun")+"\t");
        			}
        		}else if(gubun.equals("교수")) {
        			if(irum.equals(irumSearch)) {
        				System.out.println("나이:"+haksaHash.get("age")+"\t");
        				System.out.println("이름:"+haksaHash.get("irum")+"\t");
        				System.out.println("과목:"+haksaHash.get("subject")+"\n");
        			}
        		}else if(gubun.equals("관리자")) {
        			if(irum.equals(irumSearch)) {
        				System.out.println("age");
        			}
        		}
        	}
           System.out.println("찾기");
        }else if(cnt==3) {
           System.out.println("삭제할 사람 이름 입력 해주세요");
           System.out.print("이름:");
           String irum=input.next();
           for(int i=0;i<haksaList.size();i++);
           HashMap<String,String> haksaHash=haksaList.get(i);
           String gubun = haksaHash.get("gubun");
             if(gubun.equals("학생")) {
            	 haksaList.remove(i);
            	 System.out.println(irum+"님을 삭제");
             }
           
        }else if(cnt==4) {
           System.out.println("===전체출력====");
           for(int i=0;i<haksaList.size();i++) {
              HashMap<String,String> haksaHash=haksaList.get(i);
              String gubun=haksaHash.get("gubun");
              if(gubun.equals("학생")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("학번: " );
                 System.out.print(haksaHash.get("hakbun")+"\n");
              }
              else if(gubun.equals("교수")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("과목: " );
                 System.out.print(haksaHash.get("subject")+"\n");
                 
              }
              else if(gubun.equals("관리자")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("부서: " );
                 System.out.print(haksaHash.get("part")+"\n");                 
              }              
           }
           System.out.println("계속하시려면1,종료하시려면0을 입력해주세요");
           
           /*System.out.println("전체출력");
           System.out.println("===학생전체출력====");
           for(int i=0;i<student.length;i++) {           
                 System.out.print("이름:\t"+student[i][1]+" ");
                 System.out.print("나이:\t"+student[i][0]+" ");
                 System.out.print("학번:\t"+student[i][2]+"\n");
              }           
           System.out.println("===교수전체출력====");
           for(int i=0;i<professor.length;i++) {           
                 System.out.print("이름:\t"+professor[i][1]+" ");
                 System.out.print("나이:\t"+professor[i][0]+" ");
                 System.out.print("과목:\t"+professor[i][2]+"\n");
              }
           System.out.println("===관리자전체출력====");
           for(int i=0;i<manager.length;i++) {           
                 System.out.print("이름:\t"+manager[i][1]);
                 System.out.print("나이:\t"+manager[i][0]);
                 System.out.print("부서:\t"+manager[i][2]+"\n");
              }
              */
        }else if(cnt==0) {
           System.out.println("프로그램종료");
           System.exit(0);
        }
     }//반복문
   }

}