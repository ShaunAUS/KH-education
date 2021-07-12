package kr.or.kh.obj2;

public class ManSchool extends School {
	
	protected int gisul;

		public ManSchool() {
			super();
			
		}
	
		
		public ManSchool(int kor, int eng, int mat,int gisul) {
			super(kor, eng, mat);
			this.gisul=gisul;
						
						
		}
		
		
		
		public int getGisul() {
			return gisul;
		}


		public void setGisul(int gisul) {
			this.gisul = gisul;
		}


		
		
		@Override
		public String toString() {
			return super.toString()+"ManSchool [gisul=" + gisul + "]";
		}


		
public static void main(String[] args) {
	ManSchool manSchool=new ManSchool(100,90,80,70);
	
	System.out.println(manSchool.toString());
	manSchool.setKor(90);
	manSchool.setEng(90);
	manSchool.setMat(90);
	manSchool.setGisul(90);
	
	
	int result=manSchool.getKor();
	System.out.println(result);
	
}		
		
}