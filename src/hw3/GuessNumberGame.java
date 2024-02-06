package hw3;

/*
 * hw3_02
 * 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
 * 猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
 * ----------------
 * 開始猜數字吧!
 * 5
 * 猜錯囉
 * 8
 * 猜錯囉
 * 3
 * 猜錯囉
 * 1
 * 答對了!答案就是1 
 * 
 * (提示：Scanner，亂數方法，無窮迴圈)
 * (進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
 */

import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		Scanner inputData;
		int anwser = (int) (Math.random()*10); //亂數產生一個0~9的數字
		int guess;
		
		System.out.println("這是一個猜數字的遊戲，來試試你的運氣，請隨意猜一個數字(0 ~ 9)!");
		System.out.println("開始猜數字吧!");
		System.out.println(anwser);
		
		
		while(true) {
			inputData = new Scanner(System.in);			
			if (inputData.hasNextInt()) {	//判斷輸入的是否為整數
				guess = inputData.nextInt();
				if (guess >= 0 && guess <= 9) { //判斷輸入是否在範圍內
					if(guess == anwser) {
						System.out.println("答對了!答案就是 "+ anwser);
					}else {
						System.out.println("猜錯囉");
						continue;
					}
					break;
				}else {
					System.out.println("輸入有誤，請輸入0 ~ 9 數字：");
					continue;
				}
			}else {
				System.out.println("輸入有誤，請輸入0 ~ 9 數字：");	
			}
		}
	}
}
