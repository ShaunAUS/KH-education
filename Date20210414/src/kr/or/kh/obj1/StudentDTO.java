	package kr.or.kh.obj1;
	
	import java.io.Serializable;
	
	public class StudentDTO implements Serializable {
		
		  private int no;
		  public String age;				//입출력 할거만 뽑음
		  public String irum;
		  public String hakbun;
		  
		  public StudentDTO(int no, String age, String irum, String hakbun) {
			  super();
			  this.no = no;
			  this.age = age;
			  this.irum = irum;
			  this.hakbun = hakbun;
		  }
		  
		  public StudentDTO() {
			  super();
			  
		  }
		  
		public int getNo() {
			return no;
		}
	
		public void setNo(int no) {
			this.no = no;
		}
	
		public String getAge() {
			return age;
		}
	
		public void setAge() {
			    System.out.println("나이입력:");
				age = Register.input.next();
				if(age==null||age=="") {
					System.out.println("에러");
				}
		}
	
		public String getIrum() {
			return irum;
		}
	
		public void setIrum() {
			System.out.println("이름입력:");
			irum = Register.input.next();
			if(irum==null||irum=="") {
				System.out.println("에러");
			}
		}
	
		public String getHakbun() {
			return hakbun;
		}
	
		public void setHakbun() {
			  System.out.println("학번입력:");
			  hakbun = Register.input.next();
			  if(hakbun==null||hakbun=="") {
					System.out.println("에러");
			  }
		}
	
		@Override
		public String toString() {
			return "StudentDTO [no=" + no + ", age=" + age + ", irum=" + irum + ", hakbun=" + hakbun + "]";
		}	  
	}
