public class LotteriaProcess {
    Lotteria[] lotteria;
    
    public LotteriaProcess() {									//배열 생성자
       lotteria= new Lotteria[5];
       lotteria[0]=new Lotteria("감자튀김",500,2,1000);
       lotteria[1]=new Lotteria("콜라",2000,2,4000);
       lotteria[2]=new Lotteria("햄버거",3000,2,6000);
       lotteria[3]=new Lotteria("롱스틱",1000,2,2000);
       lotteria[4]=new Lotteria("아이스크림",1000,2,2000);
    }
    
    boolean searchMember(String name) {
       boolean searchResult = false;
       for(int i=0;i<lotteria.length;i++) {
          if(lotteria[i].getSangpumName().equals(name)) {
             printInfo(lotteria[i]);
             searchResult=true;
          }
       }
       return searchResult;
    }
    private void printInfo(Lotteria lotteria) {
       System.out.println(lotteria.getSangpumName()+"으로 찾은 결과");
       System.out.println("상품이름:"+lotteria.getSangpumName());
       System.out.println("상품단가:"+lotteria.getSangpumDan());
       System.out.println("상품수량:"+lotteria.getSangpumSu());
       System.out.println("상품금액:"+lotteria.getSangpumMoney());
    }
}