		
				package kr.or.kh;
				
				
				import java.sql.Connection;
				
				import java.sql.DriverManager;
				
				import java.sql.ResultSet;
				
				import java.sql.SQLException;
				
				import java.sql.Statement;
				
				import java.util.Scanner;
			
			
				public class BoardExecuter {
				
				public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				while(true) {//반복문
				
				System.out.println("=====게시판작성======");
				
				System.out.println("R:등록 S:검색 D:삭제 U:수정 L:목록");
				
				String protocol = input.next();
				
				Connection conn=null;
				
				Statement stmt=null;
				
				ResultSet rs=null;
				
				String sql=null;
				
				int cnt=0;
				
				try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "khdangsn", "dkdlxl");
				
				} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				
				} catch (SQLException e) {
				
				e.printStackTrace();
				
				}
				
				if(protocol.equals("R")||protocol.equals("r")) {//등록
				
				// 0 1234
				
				System.out.println("제목|내용입력:");
				
				String titleContent = input.next();
				
				int indexI = titleContent.indexOf("|");
				
				String title = titleContent.substring(0,indexI);
				
				String content = titleContent.substring(indexI+1);
				
				System.out.println("작성자입력:");
				
				String author = input.next();
				
				System.out.println("날짜입력:");
				
				String nal = input.next();
				
				System.out.println("조회수입력:");
				
				String readcount = input.next();
				
				try {
				
				stmt = conn.createStatement();
				
				sql = "insert into board(no,title,content,author,nal,readcount) values(board_seq.nextval,'"+title+"','"+content+"','"+author+"','"+nal+"','"+readcount+"')";
				
				cnt=stmt.executeUpdate(sql);
				
				if(cnt==1) {
				
				System.out.println("게시글이 등록되었습니다.");
				
				}else {
				
				System.out.println("게시글등록이실패되었습니다.");
				
				}
				
				} catch (SQLException e) {
				
				e.printStackTrace();
				
				} finally {
				
				try {
				
				conn.close();
				
				stmt.close();
				
				} catch (SQLException e) {
				
				e.printStackTrace();
				
				}
				
				} 
				
				}//등록
				
				else if(protocol.equals("S")||protocol.equals("s")) {//검색
				
				String title=null;
				
				String content=null;
				
				String author=null;
				
				String nal=null;
				
				String readcount=null;
				
				System.out.println("찾는게시글제목입력:");
				
				String titleSearch = input.next();
				
				try {
				
				stmt = conn.createStatement();
				
				sql = "select no,title,content,author,nal,readcount from board where title='"+titleSearch+"'";
				
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
				
				cnt = rs.getInt("no");
				
				title = rs.getString("title");
				
				content = rs.getString("content");
				
				author = rs.getString("author");
				
				nal = rs.getString("nal"); 
				
				readcount = rs.getString("readcount");
				
				}
				
				System.out.println("검색결과:");
				
				System.out.println("제목\t내용\t작성자\t날짜\t조회수");
				
				System.out.print(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
				
				} catch (SQLException e) {
				
				e.printStackTrace();
				
				} finally {
				
				try {
				
				rs.close();
				
				conn.close();
				
				stmt.close();
				
				} catch (SQLException e) {
				
				e.printStackTrace();
				
				}
				
				} 
				
				}//검색
				
				else if(protocol.equals("D")||protocol.equals("d")) {//삭제
				
				System.out.println("삭제할제목입력:");
				
				String titleDelete = input.next();
				
				try {
				
				stmt = conn.createStatement();
				
				sql = "delete board where title='"+titleDelete+"'";
				
				cnt=stmt.executeUpdate(sql);
				
				if(cnt==1) {
				
				System.out.println("게시글이삭제되었습니다.");
				
				}else {
				
				System.out.println("게시글이삭제실패되었습니다.");
				
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
				
				}//삭제
				
				else if(protocol.equals("U")||protocol.equals("u")) {//수정
				
				String titledb=null;
				
				String contentdb=null;
				
				String authordb=null;
				
				String naldb=null;
				
				String readcountdb=null;
				
				System.out.println("수정할 게시글 제목입력:");
				
				String titleUpdate = input.next();
				
				stmt = conn.createStatement();
				
				sql ="select no,title,content,author,nal,readcount from board where title='"+titleUpdate+"'";
				
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
				
				cnt = rs.getInt("no");
				
				titledb = rs.getString("title");
				
				contentdb = rs.getString("content");
				
				authordb = rs.getString("author");
				
				naldb = rs.getString("nal");
				
				readcountdb = rs.getString("readcount"); 
				
				}
				
				System.out.println("===수정전게시글입니다.===");
				
				System.out.println("제목\t내용\t작성자\t날짜\t조회수");
				
				System.out.println(titledb+"\t"+contentdb+"\t"+authordb+"\t"+naldb+"\t"+readcountdb+"\n");
				
				System.out.println("정말로수정하겠습니까?yes/no");
				
				String commit = input.next();
				
				if(commit.equals("yes")||commit.equals("YES")) {
				
				
				
				}else {
				
				continue;
				
				}
				
				}//수정
				
				else if(protocol.equals("L")||protocol.equals("l")) {//목록
				
				System.out.println("=====전체출력======");
				
				System.out.println("제목\t내용\t작성자\t날짜\t조회수");
				
				try {
				
				stmt = conn.createStatement();
				
				sql = "select no,title,content,author,nal,readcount from board";
				
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
				
				cnt = rs.getInt("no");
				
				String title = rs.getString("title");
				
				String content = rs.getString("content");
				
				String author = rs.getString("author");
				
				String nal = rs.getString("nal");
				
				String readcount = rs.getString("readcount");
				
				System.out.print(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
				
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
				
				}//목록
				
				}//반복문
				
				}
				
				}
				
