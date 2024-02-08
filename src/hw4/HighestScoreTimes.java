package hw4;

public class HighestScoreTimes {

	public static void main(String[] args) {
		int[][] score = {
							{10, 35, 40, 100, 90, 85, 75, 70},
							{37, 75, 77, 89, 64, 75, 70, 95},
							{100, 70, 79, 90, 75, 70, 79, 90},
							{77, 95, 70, 89, 60, 75, 85, 89},
							{98, 70, 89, 90, 75, 90, 89, 90},
							{90, 80, 100, 75, 50, 20, 99, 75}
						};
		int[] student = new int[8];
		int max, index;
		
		for(int i=0 ; i<score.length ; i++) {
			max = score[i][0];
			index = 0;
			for(int j=0 ; j<score[i].length ; j++) {				
				if (score[i][j] > max) {
					max = score[i][j];
					index = j;
				}				
			}
			student[index]+=1;
		}
		
		for(int i=0 ; i<student.length ; i++) {
			System.out.printf("%d 號考最高分的次數為：%d 次%n", i+1, student[i]);
		}
	}

}
