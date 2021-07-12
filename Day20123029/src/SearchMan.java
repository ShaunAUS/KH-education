import java.util.Scanner;

public class SearchMan {

	public static void main(String[] args) {
		
		SearchService sv = new SearchService();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("검색할 이름 입력");
			String name=input.next();
			boolean searchResult=sv.searchMember(name);
			if(searchResult)break;
			
			System.out.println("해당회원 없음");
		}while(true);
	}
		
}


