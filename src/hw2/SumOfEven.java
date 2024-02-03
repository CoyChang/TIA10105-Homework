package hw2;

/*
 * hw2_02
 * 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
 */

public class SumOfEven {

	public static void main(String[] args) {
		int i, sum, numbers;
		numbers = 1000;
		sum = 0;
		
		for(i=0 ; i<=numbers ; i+=2) {
			if(i==0)
				continue;
			sum+=i;
		}
		System.out.printf("1~%d的偶數和為：%d", numbers, sum);
	}

}
