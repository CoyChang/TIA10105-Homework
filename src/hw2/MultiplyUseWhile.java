package hw2;

/*
 * hw2_04
 * 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
 */

public class MultiplyUseWhile {

	public static void main(String[] args) {
		int i =1, sum = 1;
		while(i<=10) {
			sum*=i;
			i++;
		}
		System.out.println("1~10的連乘積為： " + sum);
	}

}
