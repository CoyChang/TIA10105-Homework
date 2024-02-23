package hw5;

/* hw5_03
 * 利用Overloading，
 * 設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
 * 可以找出二維陣列的最大值並回傳
 * 
*/

public class OverloadingMax {
	
	public static void main(String[] arge) {		
		int[][] intArray = {
							{1, 6, 3},
							{9, 5, 2}	
						   };
		
		double[][] doubleArray = {
									{1.2, 3.5, 2.2},
									{7.4, 2.1, 8.2}
								 };
		OverloadingMax obj = new OverloadingMax();
		System.out.println(obj.maxElement(intArray));
		System.out.println(obj.maxElement(doubleArray));
	}
	
	public int maxElement(int x[][]) {
		int indexI = 0, indexJ = 0, max = 0;
		for(int i=0 ; i<x.length ; i++) {
			for(int j=0 ; j<x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
					indexI = i;
					indexJ = j;
				}
			}
		}		
		return x[indexI][indexJ];
	}
	
	public double maxElement(double x[][]) {
		int indexI = 0, indexJ = 0;
		double max = 0;
		for(int i=0 ; i<x.length ; i++) {
			for(int j=0 ; j<x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
					indexI = i;
					indexJ = j;
				}
			}
		}		
		return x[indexI][indexJ];
	}
}
