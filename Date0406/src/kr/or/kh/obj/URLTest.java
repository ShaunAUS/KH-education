package kr.or.kh.obj;


      //url                // inetaddress클래스
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;
public class URLTest {

	public static void main(String[] args) {
		
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		URL url = new URL("https://www.naver.com/");
		is= url.openStream();
		isr= new InputStreamReader(is,"UTF-8");
		br = new BufferedReader(isr);
		String str = "";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}
	//finally is. close   isr. close   br. close

}
