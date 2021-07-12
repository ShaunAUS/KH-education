package kr.or.kh.function;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegisterFunction {
		public static void register(Scanner input,Statement stmt,Connection conn,String sql,int cnt) {
			System.out.println("==게시판 등록==");
			System.out.println("1:등록 2:검색 3:삭제 4:수정 5:목록");
			int Dnum=input.nextInt();
			if(Dnum==1) { //제목 내용 입력
				System.out.println("제목|내용입력:");
				String titleContent=input.next();					//문자열이 메모리에 저장돼면 배열로 인식한다
				int indexI=titleContent.indexOf("|");
				String title=titleContent.substring(0,indexI);		//0 부터 파이프 기준으로 짜르기
				String content=titleContent.substring(indexI+1);	// |뒤꺼 가져오기
				System.out.println("title");
				System.out.println("content");
				System.out.println("작정자입력:");
				String author=input.next();
				System.out.println("날짜입력");
				String nal =input.next();
				System.out.println("조회수 입력");
				String readcount = input.next();
				
				try {
					 stmt= conn.createStatement();
					 sql="insert into register(no,title,contents,author,nal,readcount)values(1,'"+title+"','"+content+"','"+author+"','"+nal+"','"+readcount+"')";
					 cnt = stmt.executeUpdate(sql);
					if(cnt==1) {
						System.out.println("게시물 등록 성공");
					}else{
						System.out.println("게시물 등록 실패");
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}finally {
					try {
						conn.close();
						stmt.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				}
			}
			
			
			

		}//등록끝
		
		public static void search(Scanner input,Statement stmt,Connection conn,String sql,ResultSet rs,int cnt) {
			String title= null;
			String author=null;
			String contents=null;
			String nal=null;
			String	readcount=null;
			System.out.println("찾을 게시물 제목 입력");
			String titleSearch=input.next();
			try {
				stmt=conn.createStatement();
				sql="select no,title,contents,author,nal,readcount from register where title='"+titleSearch+"'";
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					cnt= rs.getInt("no");
					 title= rs.getString("title");
					 author=rs.getString("author");
					 contents=rs.getString("contents");
					 nal=rs.getString("nal");
					readcount=rs.getString("readcount");			
				}
				int readcountUpdate=Integer.parseInt(readcount);
				readcountUpdate++;
				readcount=String.valueOf(readcountUpdate);
				stmt=conn.createStatement();
				sql="update register set readcount='"+readcount+"'where title='"+titleSearch+"'";
				System.out.println("검색결과:");
				System.out.println("검색\t내용\t작성자\t날짜\t조회수");
				System.out.println(title+"\t"+contents+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}}
			}
	
			
		
		public static void delete(Scanner input,Statement stmt,Connection conn,String sql,ResultSet rs,int cnt) {
			
				System.out.println("삭제할 제목을 입력해주세요:");
				String titleDelete=input.next();
				try {
					stmt=conn.createStatement();
					sql="delete register where title='"+titleDelete+"'";
					cnt= stmt.executeUpdate(sql);
					if(cnt==1) {
						System.out.println("게시글 삭제완료");
					}else {
						System.out.println("게시글 삭제 실패");
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}finally {
					try {
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				}
				
			
			
		}
		public static  void update(Scanner input,Statement stmt,Connection conn,String sql,ResultSet rs,int cnt,String result) {
			String titledb=null;
			String	contentsdb=null;
			String authordb=null;
			String naldb=null;
			String readcountdb=null;
			
			System.out.println("수정할 게시글 제목 입력");
			String titleUpdate=input.next();
			try {
				stmt =conn.createStatement();
				sql="select * from register where title='"+titleUpdate+"'";
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					cnt=rs.getInt("no");
					titledb=rs.getString("titledb");
					contentsdb=rs.getString("contents");
					authordb=rs.getString("author");
					naldb=rs.getString("nal");
					readcountdb=rs.getString("readcount");
					
				}
				System.out.println("==수정전 내용==");
				System.out.println("제목\t내용\t작성자\t날짜\t조회수");
				System.out.println(titledb+"\t"+contentsdb+"\t"+authordb+"\t"+naldb+"\t"+readcountdb+"\n");
				System.out.println("정말로 수정 하시겠습니까 yes/no");
				String commit=input.next();
				if(commit.equals("yes")||commit.equals("YES")) {
					System.out.println("수정할 제목|내용 입력");
					String titleContent=input.next();
					int indexI= titleContent.indexOf("|");
					try {
						String titleUpdateFinal= titleContent.substring(0,indexI);
						String contentUpdateFinal=titleContent.substring(indexI+1);
						stmt=conn.createStatement();
						sql="update register set title='"+titleUpdateFinal+"',contents='"+contentUpdateFinal+"' where title='"+titleUpdate+"'";
						cnt=stmt.executeUpdate(sql);
						if(cnt==1){
							System.out.println("게시글 수정 완료");
						}else {
							System.out.println("게시글 수정 실패");
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}finally {
						try {
							stmt.close();
							conn.close();
							rs.close();
						} catch (Exception e) {
							
							e.printStackTrace();
						}
						
					}
					result="ok";
					else {
					return;
				
					}
				}