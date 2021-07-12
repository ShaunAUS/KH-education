package kr.or.kh;


public class Card {
	
	String kind;  //인스턴스 변수 
	int number;
	
	
	//카드 폭  =클래스변수,스태틱변수
	static int height; //카드 높이 
	static int width=50;
	
	
	public static void main(String[] args) {
		Card card= new Card();
		card.kind="spade";
		card.number=4;
		
	
		
		
				
		Card.height=25;    					//클래스 이름 직접 사용 
		System.out.println(card.kind);
		System.out.println(Card.width);
		
	}
	
}
