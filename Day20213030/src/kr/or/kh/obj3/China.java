package kr.or.kh.obj3;

public class China {
	
	protected int jazaang;
	protected int jambong;
	protected int tang;
	
	
	public China() {
		super();
		
	}
	
	public China(int jazaang, int jambong, int tang) {
		super();
		this.jazaang = jazaang;
		this.jambong = jambong;
		this.tang = tang;
	}
	
	
	
	
	public int getJazaang() {
		return jazaang;
	}


	public void setJazaang(int jazaang) {
		this.jazaang = jazaang;
	}


	public int getJambong() {
		return jambong;
	}


	public void setJambong(int jambong) {
		this.jambong = jambong;
	}


	public int getTang() {
		return tang;
	}


	public void setTang(int tang) {
		this.tang = tang;
	}


	
	
	@Override
	public String toString() {
		return "China [jazaang=" + jazaang + ", jambong=" + jambong + ", tang=" + tang + "]";
	}


}
