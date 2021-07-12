
public class House {
	
	
	public static int price;
	public String dong;
	public int size ;
	public String kind;
	
	
	public House() {
		this(100,32,"동판교","아파트");  				//생성자에서 매개변수 생성자호출 //매개변수 생성자
	}
	
	
	
	public House(int prirce) {
		this(price,32,"동판고","아파트");
	}
	
	
	
	public House(int price,int size) {
		this(price,size,"동판교","아파트");
	}
	
	
	
	public House(int price,int size,String dong) {
		this(price,size,dong,"아파트");
	}
	
	
	public House(int price, int size, String dong, String kind) {
		this.price=price;
		this.dong=dong;
		this.size=size;
		this.kind=kind;
	}
	
}
