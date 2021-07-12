package kr.or.oh;

public class ArrayTest4 {

	public static void main(String[] args) {
		//초기화와 대입은 다르다. new=초기화 만들고 바로 넣기,대입은 만들고 나중에 
		//new = 동적 공간 생성// 없으면 그냥 stack에 생성
		String[] cities= {"서울","천안","대구",};
		String[] nations= new String[] {"대한민국","미국","일본","프랑스",};
		
		
		for(int i=0;i<cities.length;i++) {
			System.out.println("cities["+i+"]");
		}
		for(int i=0;i<nations.length;i++) {
			System.out.println("nations["+i+"]");
		}
	}

}
