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
		GuessNumberGame obj = new GuessNumberGame();
		obj.game1(new Scanner(System.in));	//執行猜0~9數字的程式
		System.out.println("結束第一個遊戲!");
		System.out.println("============================================================");		
		obj.game2(new Scanner(System.in));	//執行猜0~100數字的程式
	}
	
	public void game1(Scanner inputData) {	//猜0~9數字的程式
		int anwser = (int) (Math.random()*10); //亂數產生一個0~9的數字
		int guess;
		
		System.out.println("這是一個猜數字的遊戲，來試試你的運氣，請隨意猜一個數字(0 ~ 9)!");
		System.out.println("開始猜數字吧!");
		//System.out.println(anwser);
		
		
		while(true) {
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
	
	public void game2(Scanner inputData) {	//猜0~100數字的程式
		int anwser = (int) (Math.random()*101); //亂數產生一個0~100的數字
		int guess;
		int min = 0, max = 100; //暫存目前猜的最小及最大數
		
		System.out.println("這是一個猜數字的遊戲，來試試你的運氣，請隨意猜一個數字(0 ~ 100)!");
		System.out.println("開始猜數字吧!");
		
		while(true) {
			if (inputData.hasNextInt()) {	//判斷輸入的是否為整數
				guess = inputData.nextInt();
				if (guess >= 0 && guess <= 100) { //判斷輸入是否在範圍內							
					if(guess == anwser) {
						System.out.println("答對了!答案就是 "+ anwser);						
					}else if(guess > anwser){
						max = guess - 1;	//當使用者所猜的數大於答案，將最大數的範圍設為使用者所猜的數字-1			
						System.out.println("數字太大，猜小一點!!，範圍在："+min+" ~ "+max+"之間");
						continue;
					}else {
						min = guess + 1;	//當使用者所猜的數小於答案，將最小數的範圍設為使用者所猜的數字+1			
						System.out.println("數字太小，猜小一點!!，範圍在："+min+" ~ "+max+"之間");
						continue;
					}
					break;
				}else {
					System.out.println("輸入有誤，請輸入0 ~ 100 數字：");
					continue;
				}
			}else {
				System.out.println("輸入有誤，請輸入0 ~ 100 數字：");	
			}
		}
	}
	
}
