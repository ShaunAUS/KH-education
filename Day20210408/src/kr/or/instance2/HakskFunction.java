package kr.or.instance2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HakskFunction {
	public static void register(int cnt, Scanner input, Connection conn,Statement stmt) {

		System.out.println("======메뉴 선택======");		
		System.out.println("1.등록");	
		System.out.println("2.찾기");	
		System.out.println("3.삭제");	
		System.out.println("4.전체출력");
		System.out.println("5.수정");
		System.out.println("-----------------");
		System.out.println("0.종료");
		System.out.println("번호를 선택해 주세요...");
		
		int cnt = input.nextInt();
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		if(cnt<0||cnt>5) {
			System.out.println("오류발생");
		}
		
		if(cnt==1) {//등록
		
			System.out.println("=======메뉴 선택======");
			System.out.println("1.학생");
			System.out.println("2.교수");
			System.out.println("3.관리자");
			System.out.println("4.이전메뉴");
			System.out.println("번호를 선택해 주세요.."); 
			
			cnt = input.nextInt();
			
			if(cnt<0||cnt>5) {
				System.out.println("오류발생");
			}
			
		if(cnt==1) {//학생등록
		
			System.out.println("나이입력:");			
			String age = input.next();			
			System.out.println("이름입력:");			
			String irum = input.next();			
			System.out.println("학번입력:");
			String hakbun = input.next();
			
		//데이터베이스
		
		//1.로드(load)내가자바언어에게mysql데이터베이스를사용할꺼야인식
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
		
		//2.연결(Connection DriverManager.getConnection(url,id,password);
		
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		//3.준비 3-1 문장준비
		
		// 		3-2 공간준비
		
			String sql = "insert into student(age,irum,hakbun) values('"+age+"','"+irum+"','"+hakbun+"')";	//문장설정
			stmt = conn.createStatement();																	//공간설정
		
		//4.실행 execute
		
		cnt = stmt.executeUpdate(sql); 				//INSERT UPDATE DELETE 전용메서드 //실행시 처리됀 행의 개수  //실패시 0 
		
		if(cnt<0||cnt>2) {
		System.out.println("오류발생");
		}
		
		if(cnt==1) {		
		System.out.println(cnt+"건학생이 등록되었습니다.");		
		}else {		
		System.out.println("학생등록이 실패하였습니다.");
		
		}
		
		} catch (ClassNotFoundException e) {		
		e.printStackTrace();		
		} catch (SQLException e) {		
		e.printStackTrace();

		
		} finally {
		
		//5.종료
		
		try {
		
		conn.close();		
		stmt.close();
		
		} catch (SQLException e) {		
		e.printStackTrace();
		
		}
				
		}
		
		}//학생등록
		
		
		
		else if(cnt==2) {//교수등록
		
		System.out.println("나이입력:");		
		String age = input.next();		
		System.out.println("이름입력:");		
		String irum = input.next();		
		System.out.println("과목입력:");		
		String subject = input.next();
		
		//1.로드(load)내가자바언어에게mysql데이터베이스를사용할꺼야인식
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.연결 Connection
		
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		//3.준비 공간준비,쿼리준비
		
		String sql = "INSERT INTO professor(age,irum,subject) values('"+age+"','"+irum+"','"+subject+"')";
		
		stmt = conn.createStatement();
		
		//4.실행
		
		cnt = stmt.executeUpdate(sql);					//실행됀 행의 개수 출력
		
		
		
		if(cnt<0||cnt>2) {
			System.out.println("오류발생");
			}

		
		if(cnt==1) {		
		System.out.println("교수님이 등록되었습니다.");		
		}else {		
		System.out.println("교수님등록이실패되었습니다.");		
		}
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		//5.종료
		
		stmt.close();
		
		conn.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		} 
		
		}//교수등록
		
		else if(cnt==3) {//관리자
		
		try {
		
		System.out.println("나이입력:");		
		String age = input.next();		
		System.out.println("이름입력:");		
		String irum = input.next();		
		System.out.println("부서입력:");		
		String part = input.next();
		
		//로드
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//연결
		
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		//준비 쿼리준비,공간준비
		
		String sql = "insert into manager(age,irum,part) values('"+age+"','"+irum+"','"+part+"')";
		
		stmt = conn.createStatement();		
		cnt = stmt.executeUpdate(sql);
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) { 
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		stmt.close();
		
		conn.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		}
		
		}//관리자
		
		}//등록끝
		
	}
	public static void search(int cnt,Scanner input, Connection conn, Statement stmt, ResultSet rs) {

		else if(cnt==2) {//찾기
		
		System.out.println("찾을이름을 입력:");		
		String irumSearch = input.next();		
		System.out.println("학생,교수,관리자중입력");		
		String gubun = input.next();
		
		
		String age=null;
		String irum=null;
		String hakbun=null;
		String subject=null;
		String part=null;
		
		
		if(gubun==null||gubun=="") {
			System.out.println("오류발생");
		}
		
		if(gubun.equals("학생")) {//학생찾기
		 
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		
		String sql = "select no,age,irum,hakbun from student where irum='"+irumSearch+"'";
		stmt = conn.createStatement();
		
		
		rs=stmt.executeQuery(sql);    //SELECT 전용 메서드 //RESULT SET 을 리턴한다
		
		
		
		while(rs.next()) {
		
		int no = rs.getInt("no");
		age = rs.getString("age");
		irum = rs.getString("irum");
		hakbun = rs.getString("hakbun");
		
		}
		
		System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t학번:"+hakbun+"\n");
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		stmt.close();
		
		conn.close();
		
		rs.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		} 
		
		}//학생찾기
		

		
		

		if(gubun==null||gubun=="") {
			System.out.println("오류발생");
		}

		
		else if(gubun.equals("교수")) {//교수찾기
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		
		String sql = "select no,age,irum,subject from professor where irum='"+irumSearch+"'";
		stmt = conn.createStatement();
						
		rs=stmt.executeQuery(sql); //insert,update,delete executeUpdate(), select executeQuery();
						
		while(rs.next()) {
		
		int no = rs.getInt("no");
		age = rs.getString("age");
		irum= rs.getString("irum");
		subject = rs.getString("subject");
		
		}
		
		System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t과목:"+subject+"\n");
		
		} catch (ClassNotFoundException e) {		
		e.printStackTrace();		
		} catch (SQLException e) {		
		e.printStackTrace();	
		
		
		} finally {		
		try {		
		stmt.close();		
		conn.close();		
		rs.close();		
		} catch (SQLException e) {		
		e.printStackTrace();		
		}		
		}
		
		}//교수찾기
		
		else if(gubun.equals("관리자")) {
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		
		String sql = "select no,age,irum,part from manager where irum='"+irumSearch+"'";
		stmt = conn.createStatement();
		
		
		
		rs=stmt.executeQuery(sql);
		
		
		
		while(rs.next()) {
		
		int no = rs.getInt("no");		
		age = rs.getString("age");		
		irum = rs.getString("irum");		
		part = rs.getString("part");
		
		}
		
		System.out.print("나이:"+age+"\t"+"이름:"+irum+"\t부서:"+part+"\n");
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		stmt.close();
		
		rs.close();
		
		conn.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		} 
		
		}
		
		
		
		}//찾기끝
		
		puvlic static void delete() {

			else if(cnt==3) {//삭제
			
			System.out.println("삭제할이름을 입력:");
			
			String irumDelete = input.next();
			
			System.out.println("학생,교수,관리자,중입력");
			
			String gubun = input.next();
			
			if(gubun.equals("학생")) {//학생삭제 
			
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			
			
			
			String sql = "delete from student where irum='"+irumDelete+"'";
			stmt = conn.createStatement();
			
			
			
			cnt=stmt.executeUpdate(sql);				//실행 되 처리된 행 갯수 출력
			
			if(cnt==1) {
			
			System.out.println(cnt+"건 학생이삭제되었습니다.");
			
			}else {
			
			System.out.println(cnt+"건 학생삭제가실패되었습니다.");
			
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
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
			
			}//학생삭제
			
			
			
			
			else if(gubun.equals("교수")) {//교수삭제
			
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			
			
			String sql = "delete from professor where irum='"+irumDelete+"'";
			stmt = conn.createStatement();
			
			
			cnt = stmt.executeUpdate(sql);
			
			if(cnt==1) {
			
			System.out.println(cnt+"건 교수님이삭제되었습니다.");
			
			}else {
			
			System.out.println(cnt+"건 교수님이삭제가안되었습니다.");
			
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			} catch (SQLException e) {
			
			e.printStackTrace();
			
			} finally {
			
			try {
			
			stmt.close();
			
			conn.close();
			
			} catch (SQLException e) {
			
			e.printStackTrace();
			
			}
			
			}
			
			}//교수삭제
			
			else if(gubun.equals("관리자")) {//관리자
			
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			
			String sql = "delete from manager where irum='"+irumDelete+"'";
			
			stmt = conn.createStatement();
			
			cnt=stmt.executeUpdate(sql);
			
			if(cnt==1) {
			
			System.out.println(cnt+"건 관리자님이삭제되었습니다.");
			
			}else {
			
			System.out.println(cnt+"건 관리자님이삭제가안되었습니다.");
			
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			} catch (SQLException e) {
			
			e.printStackTrace();
			
			} finally {
			
			try {
			
			stmt.close();
			
			conn.close();
			
			} catch (SQLException e) {
			
			e.printStackTrace();
			
			}
			
			}
			
			}//관리자
			
		}
	}
	public static void list() {
		
	}
	public static void update() {
		
	}
	public static void main(String[] args) {
		
		else if(cnt==3) {//삭제
		
		System.out.println("삭제할이름을 입력:");
		
		String irumDelete = input.next();
		
		System.out.println("학생,교수,관리자,중입력");
		
		String gubun = input.next();
		
		if(gubun.equals("학생")) {//학생삭제 
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		
		
		String sql = "delete from student where irum='"+irumDelete+"'";
		stmt = conn.createStatement();
		
		
		
		cnt=stmt.executeUpdate(sql);				//실행 되 처리된 행 갯수 출력
		
		if(cnt==1) {
		
		System.out.println(cnt+"건 학생이삭제되었습니다.");
		
		}else {
		
		System.out.println(cnt+"건 학생삭제가실패되었습니다.");
		
		}
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
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
		
		}//학생삭제
		
		
		
		
		else if(gubun.equals("교수")) {//교수삭제
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		
		String sql = "delete from professor where irum='"+irumDelete+"'";
		stmt = conn.createStatement();
		
		
		cnt = stmt.executeUpdate(sql);
		
		if(cnt==1) {
		
		System.out.println(cnt+"건 교수님이삭제되었습니다.");
		
		}else {
		
		System.out.println(cnt+"건 교수님이삭제가안되었습니다.");
		
		}
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		stmt.close();
		
		conn.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		}
		
		}//교수삭제
		
		else if(gubun.equals("관리자")) {//관리자
		
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
		
		String sql = "delete from manager where irum='"+irumDelete+"'";
		
		stmt = conn.createStatement();
		
		cnt=stmt.executeUpdate(sql);
		
		if(cnt==1) {
		
		System.out.println(cnt+"건 관리자님이삭제되었습니다.");
		
		}else {
		
		System.out.println(cnt+"건 관리자님이삭제가안되었습니다.");
		
		}
		
		} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		} finally {
		
		try {
		
		stmt.close();
		
		conn.close();
		
		} catch (SQLException e) {
		
		e.printStackTrace();
		
		}
		
		}
		
		}//관리자
		
	}
}
