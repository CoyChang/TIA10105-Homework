package hw4;

/* hw4_03
 * 有個字串陣列如下(八大行星)：
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * 
 * (提示：字元比對，String方法)
 * 
*/

public class CalculateVowel {

	public static void main(String[] args) {
		String[] planet = {
							"mercury", "venus", "earth", "mars",
							"jupiter", "saturn", "uranus", "neptune"
						  };	//八大行星字串陣列
		int numVowel = 0;	//宣告存放總數的變數
		
		for(String str: planet) {
			char[] planetToChar = str.toCharArray();
			for(char c: planetToChar) {
				switch(c) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						numVowel++;
						break;
				}
			}
		}
		System.out.println("共有 " + numVowel +" 個字母");
	}
}


