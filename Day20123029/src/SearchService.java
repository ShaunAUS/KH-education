
public class SearchService {

	private Member[] members;         // new member클래스가 --배열 클래스로 생성
	
	public SearchService() {
		members = new Member[5];
		members[0]=new Member("민재",185,92,"대한민국");
		members[1]=new Member("찬수",170,50,"대한민국");
		members[2]=new Member("수혁",180,80,"대한민국");
		members[3]=new Member("수찬",150,20,"대한민국");
		members[4]=new Member("영수",150,20,"대한민국");
	}
	
	
	boolean searchMember(String name) {
		boolean searchResult=false;
		for(int i =0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult=true;
			}
		}
		return searchResult;
	}
	
	private void printInfo(Member member) {
		System.out.println(member.getName()+"으로 찾은결과");
		System.out.println("이름"+member.getName());
		System.out.println("신장"+member.getHeight());
		System.out.println("몸무게"+member.getWeight());
		System.out.println("국가"+member.getNation());
		
	}
}
