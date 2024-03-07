package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		boolean inputIsValid = false;
		
		while(!inputIsValid) {
			try {
				System.out.println("請輸入x的值：");
				int x = Integer.parseInt(input.nextLine());

				System.out.println("請輸入y的值：");
				int y = Integer.parseInt(input.nextLine());
				
				Calculator cal = new Calculator();
                int result = cal.powerXY(x, y);
                System.out.println(x + "的" + y + "次方等於" + result);

                inputIsValid = true; //輸入值都符合要求，跳出迴圈				
		
			}catch(CalException e) {
				System.out.println(e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("輸入格式不正確");
			}
		}
		input.close();
	}

}
