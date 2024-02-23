package hw5;

/* hw5_05
 * 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
 * 請設計一個方法genAuthCode()，
 * 當呼叫此方法時，會回傳一個8位數的驗證碼，
 * 此驗證碼內容包含了英文大小寫與數字的亂數組合
 * 
*/

public class AuthCode {
	
	public static void main(String[] args) {
		AuthCode obj = new AuthCode();
		
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(obj.genAuthCode());
		
	}
	
	public String genAuthCode(){
		String authCode = "";
		char[] list = new char[62];	//數字加大小寫英文字母共62個
		for(int i=0 ; i<10 ; i++) {	//產生0~9的數字放進char陣列
			list[i] = (char)(48 + i);
		}
		
		for(int i=10 ; i<36 ; i++) {	//產生大寫英文字母放進char陣列
			list[i] = (char)(65 - 10 + i);
		}
		
		for(int i=36 ; i<62 ; i++) {	//產生小寫字母放進char陣列
			list[i] = (char)(97 - 36 + i);
		}
		
		for(int i=0 ; i<8 ; i++) {	//產生8位數的驗證碼
			authCode += list[(int)(Math.random()*62)];
		}		
		
		return authCode;
	}

}
