package kr.or.kh.obj7;

public class Radio {

	int price;

	public Radio() {
		super();
		
	}

	public Radio(int price) {
		super();
		this.price = price;
	}
	
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Radio [price=" + price + "]";
	}

	
	
	public static void main(String[] args) {
		
		Radio radio=new Radio(1000);
	}
}
