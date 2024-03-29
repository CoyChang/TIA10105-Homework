package hw10;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean left = false;
		
		
		while(!left) {
			System.out.println("請輸入數字：");
			String regex = "\\d+(\\.\\d+)?";
			String numStr = input.next();
			double num = 0;
			
			if(numStr.matches(regex)) {
				num = Double.parseDouble(numStr);
			}else {
				System.out.println("數字格式不正確，請再輸入一次");
				continue;
			}
			
			System.out.println("欲格式化成(1)千分位 (2)百分比 (3)科學記號：");
			int choose = input.nextInt();
			switch(choose) {
				case 1:
					System.out.printf("%,.0f%n", num);
					break;
				case 2:
					System.out.printf("%.0f%%%n", num*100);
					break;
				case 3:
					System.out.printf("%.1E%n", num);
					break;
				default:
                    System.out.println("無效的選擇，請重新輸入");
                    continue;
						
			}
			left = true;			
		}
		input.close();
	}
}
