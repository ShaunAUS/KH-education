	package kr.or.kh.obj1;
	
	import java.io.Serializable;
	
	public class ManagerDTO implements Serializable {
	   private int no;
	   public String age;
	   public String irum;
	   public String part;
	   public ManagerDTO(int no, String age, String irum, String part) {
		   super();
		   this.no = no;
		   this.age = age;
		   this.irum = irum;
		   this.part = part;
	   }
	   
	   public ManagerDTO() {
		   super();
		   // TODO Auto-generated constructor stub
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
		
		public String getPart() {
			return part;
		}
		
		public void setPart() {
			this.part = part;
		}
		
		@Override
		public String toString() {
			return "ManagerDTO [no=" + no + ", age=" + age + ", irum=" + irum + ", part=" + part + "]";
		}   
	}
