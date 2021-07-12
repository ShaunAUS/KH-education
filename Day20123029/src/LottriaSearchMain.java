import java.util.Scanner;

public class LottriaSearchMain {

   public static void main(String[] args) {
      LotteriaProcess sv = new LotteriaProcess();
      Scanner input = new Scanner(System.in);
      do {
         System.out.println("검색할 상품 이름을 입력하세요:");
         String name = input.next();
         boolean searchResult = sv.searchMember(name);
         if(searchResult) break;
         System.out.println("해당상품이 없습니다.");
      }while(true);


   }

}