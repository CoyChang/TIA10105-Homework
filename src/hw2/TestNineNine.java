package hw2;

/*
 * hw2_01
 * 請建立一個TestNineNine.java程式，可輸出九九乘法表
 * 一：使用for迴圈 + while迴圈
 * 二：使用for迴圈 + do while迴圈
 * 三：使用while迴圈 + do while迴圈
 */

public class TestNineNine {

	public static void main(String[] args) {
		int i,j;
		//for + while
		System.out.println("使用for + while：");
		for(i=1 ; i<=9 ; i++) {
			j=1;
			while(j<=9){
				System.out.printf("%d * %d = %d\t", j, i, j*i);
				j++;
			}
			System.out.println();
		}
		
		System.out.println();
		//for + do...while
		System.out.println("使用for + do...while：");
		for(i=1 ; i<=9 ; i++) {
			j=1;
			do {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
				j++;
			}while(j<=9);
			System.out.println();
		}	
		
		System.out.println();
		//while + do...while
		System.out.println("使用while + do...while：");
		i=1;
		while(i<=9) {
			j=1;
			do {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
				j++;
			}while(j<=9);
			i++;
			System.out.println();
		}

	}

}
