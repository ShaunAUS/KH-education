package kr.or.kh.obj6;

public class HyundaCar extends Car {
	
	protected String carirum;

	public HyundaCar() {
		super();
		
	}

	public HyundaCar(Engine engine, Door door, String carirum) {
		super(engine, door);
		this.carirum=carirum;
	}

	
	@Override
	public String toString() {
		return super.toString()+"HyundaCar [carirum=" + carirum + "]";
	}
	/*
	public static void main(String[] args) {
		Engine engine= new Engine("현대엔진");
		Door door= new Door(4);
		
		HyundaCar hyundacar= new HyundaCar(engine,door,"소나타");
		System.out.println(HyundaCar.toString());
	}
	*/
}
