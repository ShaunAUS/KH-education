
public class Hero {
	int hp;
	
	
	Hero(){
		this.hp=100;
	}
	
	static public void run() {
		System.out.println("도망");
	}
	public static void main(String[] args) {
		Hero.run();
	}
}
