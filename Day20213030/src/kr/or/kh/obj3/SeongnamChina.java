	package kr.or.kh.obj3;
	
	public class SeongnamChina extends China {
		
		protected int jaengban;
	
		public SeongnamChina() {
			super();
			
		}
	
		public SeongnamChina(int jazaang, int jambong, int tang, int jaengban) {
			super(jazaang, jambong, tang);
			
		}
	
		
		
		public int getJaengban() {
			return jaengban;
		}
	
		public void setJaengban(int jaengban) {
			this.jaengban = jaengban;
		}
	
		@Override
		public String toString() {
			return super.toString()+"SeongnamChina [jaengban=" + jaengban + "]";
		}
		
		
		
	}
