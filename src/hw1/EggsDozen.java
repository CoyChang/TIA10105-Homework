package hw1;

/* hw1_02
 * 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
 */

public class EggsDozen {

	public static void main(String[] args) {
		int egg = 200;	//蛋的數量
		int dozen = egg/12;	//算有幾打
		int remainder = egg%12;	//算不足一打的數量
		
		System.out.printf("%d 顆蛋共是 %d 打又 %d 顆", egg, dozen, remainder);
	}

}
