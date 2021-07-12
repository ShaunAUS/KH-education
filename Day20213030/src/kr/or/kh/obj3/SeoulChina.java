	package kr.or.kh.obj3;
	
	public class SeoulChina extends China {
		
		protected int samsun;
	
		
		
		public SeoulChina() {
			super();
			
		}
	
		public SeoulChina(int jazaang, int jambong, int tang,int smasun) {
			super(jazaang, jambong, tang);
			
		}
	
		
		
		
		public int getSamsun() {
			return samsun;
		}
	
		public void setSamsun(int samsun) {
			this.samsun = samsun;
		}
	
		
		
		@Override
		public String toString() {
			return super.toString()+"SeoulChina [samsun=" + samsun + "]";
		}
		
		
			
	}
