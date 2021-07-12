
public class HouseConstructorTest {

	public static void main(String[] args) {
		House house=new House();
		System.out.println(house.price+":"+house.size+house.dong);
		
		
		House house2=new House(300);
		System.out.println(house2.price+":"+house2.size+house2.dong);
		
		
		House house3=new House(300,40);
		System.out.println(house3.price+":"+house3.size+house3.dong);
		

	}

}
