package kr.or.kh.obj7;



public class HaksaProject {

	public static void main(String[] args) {
		Register registerObj = new Register();
		Search searchObj = new Search();
		Delete deleteObj = new Delete();
		List listObj = new List();
		Update updateObj = new Update();
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
		int cnt=0;
		int bunho=0;
		try {
        cnt = Register.input.nextInt();
        if(cnt<0||cnt>5) {
          throw new HaksaMenuException("학사메뉴가음수이거나5이상이면안된다.");
        }
		}catch (HaksaMenuException e) {
		  e.printStackTrace();
		  continue;
		}
		
        if(cnt==1) {
        	registerObj.register();
        	if(cnt==4) {
        		continue;
        	}
        }else if(cnt==2) {
        	searchObj.search();
        	System.out.println("계속하시려면1,종료하시려면0을 입력해주세요.");
            try {
        	    bunho = Register.input.nextInt();
        	    if(bunho<0||bunho>1) {
        		   throw new HaksaMenuException("음수이거나1이상의숫자가들어왔어요");        		  
        	    }
            }catch (HaksaMenuException e) {
				e.printStackTrace();
				continue;
			}
        	if(bunho==1) {
        		continue;
        	}else {
        		System.out.println("프로그램을종료합니다.");
        		System.exit(0);
        	}
        }else if(cnt==3) {
        	deleteObj.delete();
            System.out.println("계속하시려면1,종료하시려면0을입력해주세요.");
            try {
                 bunho = Register.input.nextInt();
                 if(bunho<0||bunho>1) {
        		    throw new HaksaMenuException("음수이거나1이상의숫자가들어왔어요");
        	    }
            }catch (HaksaMenuException e) {
				e.printStackTrace();
				continue;
			}
            if(bunho==1) {
            	continue;
            }else {
            	System.out.println("프로그램을종료합니다.");
            	System.exit(0);
            }
        	
        }else if(cnt==4) {
        	listObj.list();
        	System.out.println("계속하시려면1,종료하시려면0을 입력해주세요");
        	bunho = Register.input.nextInt();
        	try {
        	    if(bunho<0||bunho>1) {
        		throw new HaksaMenuException("음수이거나1이상의숫자가들어왔어요");
        	    }
        	}catch (HaksaMenuException e) {
				e.printStackTrace();
			}
        	if(bunho==1) {
        		continue;
        	}else {
        		System.out.println("프로그램을종료합니다.");
        		System.exit(0);
        	}        	        
        }else if(cnt==0) {
        	System.out.println("프로그램종료");
        	System.exit(0);
        }else if(cnt==5) {
        	updateObj.update();
        	System.out.println("계속하시려면1,종료하시면0을 입력해주세요.");
        	bunho = Register.input.nextInt();
        	try {
        	   if(bunho<0||bunho>1) {
        		throw new HaksaMenuException("음수이거나1이상의숫자가들어왔어요");
        	   }
        	}catch (HaksaMenuException e) {
				e.printStackTrace();
				continue;
			}
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
