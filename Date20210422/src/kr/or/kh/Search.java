	package kr.or.kh.obj1;
	
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class Search {
	  private String titleSearch;
	  private Statement stmt;
	  private String sql;
	  private String readcount;
	  private Connection conn;
	  private ResultSet rs;
	  private int cnt;
	  private String title;
	  private String content;
	  private String author;
	  private String nal;
	  private int readcountUpdate;
	  public Search() {
		  
	  }
	  public void setSearchTitle() {
		  System.out.println("찾는게시글제목입력:");
		  titleSearch = Register.input.next();
	  }
	  public void statementSqlSearch()throws SQLException {
		  stmt = conn.createStatement();
		  sql = "select no,title,content,author,nal,readcount from board where title='"+titleSearch+"'";
	  }
	  public void statementSqlReadcount()throws SQLException {
		  stmt = conn.createStatement();
		  sql = "update board set readcount='"+readcount+"'where title='"+titleSearch+"'";
	  }
	  public void searchDisplay(int cnt) {
		  if(cnt==1) {
		   System.out.println("검색결과:");
		   System.out.println("제목\t내용\t작성자\t날짜\t조회수");
		   System.out.print(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		  }else {
			  System.out.println("검색이실패되었습니다.");
		  }
	  }
	  public void close() throws SQLException {
		    rs.close();
			conn.close();
			stmt.close();
	  }
	  
	  
	  
	  
	  public void search() {					//총합 메서드 임 메서드 메서드라거ㅗ 씨벌 생성자아님
		   setSearchTitle();
		   try {
			   conn = Register.getConnection();	
			   statementSqlSearch();
			   rs = stmt.executeQuery(sql);
			   while(rs.next()) {
				   cnt = rs.getInt("no");
				   title = rs.getString("title");
				   content = rs.getString("content");
				   author = rs.getString("author");
				   nal = rs.getString("nal");			   
				   readcount = rs.getString("readcount");
			   }
			   readcountUpdate=Integer.parseInt(readcount);
			   readcountUpdate++;
			   readcount=String.valueOf(readcountUpdate);
			   statementSqlReadcount();
			   cnt=stmt.executeUpdate(sql);
			   searchDisplay(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	 
	   } 
	}
	
