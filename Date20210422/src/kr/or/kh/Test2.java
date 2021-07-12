			package kr.or.kh.obj1;
			
			
			import java.util.Scanner;
			
			public class BoardExecuter {
			   public static void main(String[] args) {
				   Scanner input = new Scanner(System.in);
				   Register registerObj = new Register();    //생성자에서 로드생성
				   Search searchObj = new Search();
				   Delete deleteObj = new Delete();
				   List listObj = new List();
				   Update updateObj = new Update();
				   while(true) {//반복문
				   System.out.println("=====게시판작성======");
				   System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
				   String protocol = input.next();
				   	
				   if(protocol.equals("R")||protocol.equals("r")) {//등록
					                     
					   registerObj.register();	   
				   }//등록
				   else if(protocol.equals("S")||protocol.equals("s")) {//검색
					  searchObj.search();	   
				   }//검색
				   else if(protocol.equals("D")||protocol.equals("d")) {//삭제
					   deleteObj.delete();
				   }//삭제
				   else if(protocol.equals("U")||protocol.equals("u")) {//수정
					   String result=updateObj.update();
					   if(result.equals("continue")) {
						   continue;
					   }
				   }//수정
				   else if(protocol.equals("L")||protocol.equals("l")) {//목록
					  listObj.list();
				   }//목록
				 }//반복문
			   }
			}
