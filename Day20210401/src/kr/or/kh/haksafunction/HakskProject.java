package kr.or.kh.haksafunction;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaProject {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>(); 
    
      
      while(true) {//반복문
      System.out.println("======메뉴 선택======");
      System.out.println("1.등록");
      System.out.println("2.찾기");
      System.out.println("3.삭제");
      System.out.println("4.전체출력");
      System.out.println("5.수정");
      System.out.println("-----------------");
      System.out.println("0.종료");
      System.out.println("번호를 선택해 주세요...");
        int cnt = input.nextInt();
        if(cnt==1) {
        	HaksaFunction.register(cnt, input,haksaList);
              
           }else if(cnt==4) {
              continue;
           }//끝
        }else if(cnt==2) { //찾기의 시작
           System.out.println("찾을이름을 입력해주세요.");
           System.out.println("이름:");
           String irum = input.next();
           String gubun="";
           String irumSearch="";
           for(int i=0;i<haksaList.size();i++) {
              HashMap<String,String> haksaHash = haksaList.get(i);
               gubun = haksaHash.get("gubun");
               irumSearch = haksaHash.get("irum");
               if(gubun.equals("학생")) {
                  if(irum.equals(irumSearch)) {
                     System.out.print("나이:"+haksaHash.get("age")+"\t");
                     System.out.print("이름:"+haksaHash.get("irum")+"\t");
                     System.out.print("학번:"+haksaHash.get("hakbun")+"\n");
                  }
               }else if(gubun.equals("교수")) {
                  if(irum.equals(irumSearch)) {
                     System.out.print("나이:"+haksaHash.get("age")+"\t");
                     System.out.print("이름:"+haksaHash.get("irum")+"\t");
                     System.out.print("과목:"+haksaHash.get("subject")+"\n");
                  }
               }else if(gubun.equals("관리자")) {
                  if(irum.equals(irumSearch)) {
                     System.out.print("나이:"+haksaHash.get("age")+"\t");
                     System.out.print("이름:"+haksaHash.get("irum")+"\t");
                     System.out.print("부서:"+haksaHash.get("part")+"\n");
                  }
               }
           }
           System.out.println("계속하시려면1,종료하시려면0을 입력해주세요.");
           int bunho = input.nextInt();
           if(bunho==1) {
              continue;
           }else {
              System.out.println("프로그램을종료합니다.");
              System.exit(0);
           }//찾기의끝
        }else if(cnt==3) {
           String irumDelete="";
           String gubun="";
           System.out.println("삭제할사람의 이름을 입력해 주세요.");
           System.out.print("이름 : ");
           String irum = input.next();
            for(int i=0;i<haksaList.size();i++) {
               HashMap<String,String> haksaHash = haksaList.get(i);
               gubun = haksaHash.get("gubun");
               irumDelete = haksaHash.get("irum");
               if(gubun.equals("학생")) {
                  if(irum.equals(irumDelete)) {
                  haksaList.remove(i);         
                  }
               }else if(gubun.equals("교수")) {
                  if(irum.equals(irumDelete)) {
                  haksaList.remove(i);         
                  }
               }else if(gubun.equals("관리자")) {
                  if(irum.equals(irumDelete)) {
                  haksaList.remove(i);
                  }
               }
            }
            System.out.println(irum+"님삭제하였습니다.");
            System.out.println("계속하시려면1,종료하시려면0을입력해주세요.");
            int bunho = input.nextInt();
            if(bunho==1) {
               continue;
            }else {
               System.out.println("프로그램을종료합니다.");
               System.exit(0);
            }
           
        }else if(cnt==4) {
           System.out.println("===전체출력====");
           for(int i=0;i<haksaList.size();i++) {
              HashMap<String,String> haksaHash=haksaList.get(i);
              String gubun=haksaHash.get("gubun");
              if(gubun.equals("학생")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("학번: " );
                 System.out.print(haksaHash.get("hakbun")+"\n");
              }
              else if(gubun.equals("교수")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("과목: " );
                 System.out.print(haksaHash.get("subject")+"\n");
                 
              }
              else if(gubun.equals("관리자")) {
                 System.out.print("이름: " );
                 System.out.print(haksaHash.get("irum")+"\t");
                 System.out.print("나이: " );
                 System.out.print(haksaHash.get("age")+"\t");
                 System.out.print("부서: " );
                 System.out.print(haksaHash.get("part")+"\n");                 
              }              
       
           }
        }else if(cnt==0) {
           System.out.println("프로그램종료");
           System.exit(0);
        }else if(cnt==5) {
           System.out.println("수정할이름을입력하세요.");
           System.out.println("이름:");
           String irum = input.next();
           String gubun = "";
           String irumUpdate="";
           for(int i=0;i<haksaList.size();i++) {
              HashMap<String,String> haksaHash = haksaList.get(i);
              gubun=haksaHash.get("gubun");
              irumUpdate = haksaHash.get("irum");
              if(gubun.equals("학생")) {
                 if(irum.equals(irumUpdate)) {
                    System.out.print("나이:"+haksaHash.get("age")+"\t");
                    System.out.print("이름:"+haksaHash.get("irum")+"\t");
                    System.out.print("학번:"+haksaHash.get("hakbun")+"\n");
                    System.out.println("변경하기전내용입니다.수정할까요yes/no");
                    String commit = input.next();
                    if(commit.equals("yes")||commit.equals("YES")) {
                       haksaHash = new HashMap<String,String>();
                       System.out.println("나이:");
                       String age = input.next();
                       System.out.println("이름:");
                       irum = input.next();
                       System.out.println("학번:");
                       String hakbun = input.next();
                       haksaHash.put("age", age);
                       haksaHash.put("irum", irum);
                       haksaHash.put("hakbun", hakbun); 
                       haksaHash.put("gubun", "학생");
                       haksaList.set(i, haksaHash);
                       System.out.println("학생이수정되었습니다.");
                    }else {
                       continue;
                    }
                 }                 
              }else if(gubun.equals("교수")) {
                 if(irum.equals(irumUpdate)) {
                    System.out.print("나이:"+haksaHash.get("age")+"\t");
                    System.out.print("이름:"+haksaHash.get("irum")+"\t");
                    System.out.print("과목:"+haksaHash.get("subject")+"\n");
                    System.out.println("변경하기전내용입니다.수정할까요yes/no");
                    String commit = input.next();
                    if(commit.equals("yes")||commit.equals("YES")) {
                       haksaHash = new HashMap<String,String>();
                       System.out.println("나이:");
                       String age = input.next();
                       System.out.println("이름:");
                       irum = input.next();
                       System.out.println("과목:");
                       String subject = input.next();
                       haksaHash.put("age", age);
                       haksaHash.put("irum", irum);
                       haksaHash.put("subject", subject); 
                       haksaHash.put("gubun", "교수");
                    haksaList.set(i, haksaHash);
                    System.out.println("교수님수정되었습니다.");
                 }if(cnt==4){
                    continue;
                 }
                }
              }else if(gubun.equals("관리자")) {
                 if(irum.equals(irumUpdate)) {
                    System.out.print("나이:"+haksaHash.get("age")+"\t");
                    System.out.print("이름:"+haksaHash.get("irum")+"\t");
                    System.out.print("부서:"+haksaHash.get("part")+"\n");
                    System.out.println("변경하기전내용입니다.수정할까요yes/no");
                    String commit = input.next();
                    if(commit.equals("yes")||commit.equals("YES")) {
                       haksaHash = new HashMap<String,String>();
                       System.out.println("나이:");
                       String age = input.next();
                       System.out.println("이름:");
                       irum = input.next();
                       System.out.println("부서:");
                       String part = input.next();
                       haksaHash.put("age", age);
                       haksaHash.put("irum", irum);
                       haksaHash.put("part", part); 
                       haksaHash.put("gubun", "관리자");
                    haksaList.set(i, haksaHash);
                    System.out.println("관리자님수정되었습니다.");
                 }else {
                    continue;
                 }
                }
              }
           } 
           System.out.println("계속하시려면1,종료하시면0을 입력해주세요.");
           int bunho = input.nextInt();
           if(bunho==1) {
              continue;
           }else {
              System.out.println("프로그램을종료합니다.");
              System.exit(0);
           }
        }
     }//반복문
   }

}