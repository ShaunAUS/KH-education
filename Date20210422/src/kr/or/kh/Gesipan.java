package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import kr.or.kh.function.RegisterFunction;

public class Gesipan {

	public static void main(String[] args) {	
		
		//클래스는 자동 초기화 돼는데, 메인함수 안에서는 값지정!!!!
		Scanner input= new Scanner(System.in); 
		while(true) {//while문 시작
		System.out.println("===게시판===");
		System.out.println("1:등록 2:검색 3:삭제 4:수정 5:목록");
		int num=input.nextInt();
		Connection conn=null;
		Statement stmt=null;
		String sql= null;
		ResultSet rs=null;

		int cnt;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?mysql?characterEncoding=utf-8","root","");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		if(num==1) {//등록
			RegisterFunction.register(input, stmt, conn, sql, cnt);
			
		
		}
		
		
		
		else if(num==2) {//검색시작
			
			RegisterFunction.search(input, stmt, conn, sql, rs, cnt);
		}
		else if(num==3) {
			RegisterFunction.delete(input, stmt, conn, sql, rs, cnt);
		
		}
		
		else if(num==4) {//수정 시작
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
					
					}else {
					continue;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					stmt.close();
					conn.close();
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			}
		}//수정끝
		else if(num==5) {//목록 시작
			System.out.println("==전체출력==");
			System.out.println("제목\t내용\t작성자\t날짜\t조회수\n");
			try {
				stmt =conn.createStatement();
				sql= "select no,title,contents,author,nal,readcount from register";
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					cnt=rs.getInt("no");
					String title=rs.getString("title");
					String contents=rs.getString("contents");
					String author=rs.getString("author");
					String nal=rs.getString("nal");
					String readcount=rs.getString("readcount");
					System.out.println(title+"\t"+contents+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					conn.close();
					stmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}//목록 끝
		}//while문 끝
	}}
	
	
