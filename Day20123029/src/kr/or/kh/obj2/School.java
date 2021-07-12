	package kr.or.kh.obj2;
	
	public class School {
	
		protected int kor;
		protected int eng;
		protected int mat;
		
		
		
		public School(int kor, int eng, int mat) {         
			super();
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		
		
		public School() {
			this(0,0,0);
			
		}
		
	
		
		
		public int getKor() {
			return kor;
		}
	
	
		public void setKor(int kor) {
			this.kor = kor;
		}
	
	
		public int getEng() {
			return eng;
		}
	
	
		public void setEng(int eng) {
			this.eng = eng;
		}
	
	
		public int getMat() {
			return mat;
		}
	
	
		public void setMat(int mat) {
			this.mat = mat;
		}
		@Override
		public String toString() {
			return "School [kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
		}
		
	}
