		package kr.or.kh.obj1;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Scanner;
		
		public class Register {
		  private String titleContent;
		  private String author;
		  private String nal;
		  private String readcount;
		  public static Connection conn;
		  private Statement stmt;
		  private String title;
		  private String content;
		  private String sql;
		  private int indexI;
		  private int cnt;
		  public static Scanner input;
		  static {
			  input = new Scanner(System.in);
		  }
		  public Register() {								
			  try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		  }
		  public void setTitleContent() {
			  System.out.println("제목|내용입력:");
			  titleContent = input.next();
			  setTitleContent(titleContent);
		  }
		  public void setTitleContent(String titleContent) {
			   indexI = titleContent.indexOf("|");
			   title = titleContent.substring(0,indexI);
			   content = titleContent.substring(indexI+1);
			   
		  }
		  public void setAuthor() {
			  System.out.println("작성자입력:");
			  author = input.next();
		  }
		  public void setNal() {
			  System.out.println("날짜입력:");
			  nal = input.next();
		  }
		  public void setReadCount() {
			  System.out.println("조회수입력:");
			  readcount = input.next();
		  }
		  public static Connection getConnection()throws SQLException {
			  conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "khdangsn", "dkdlxl");
			  return conn;
		  }
		  public void statementSql()throws SQLException {
			  stmt = conn.createStatement();
			  sql = "insert into board(no,title,content,author,nal,readcount) values(board_seq.nextval,'"+title+"','"+content+"','"+author+"','"+nal+"','"+readcount+"')";
		  }
		  public void registerDisplay(int cnt) {
			  if(cnt==1) {
				   System.out.println("게시글이 등록되었습니다.");
			   }else {
				   System.out.println("게시글등록이실패되었습니다.");
			   }
		  }
		  public void close() throws SQLException {
			  conn.close();
			  stmt.close();
		  }
		  
		  
		  
		  
		  public void register() {
			   setTitleContent();
			   setAuthor();
			   setNal();
			   setReadCount();
			   try {
				   conn=getConnection();
				   statementSql();
				   cnt=stmt.executeUpdate(sql);
				   registerDisplay(cnt);
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
