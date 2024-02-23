package hw5;

/* hw5_02
 * 請設計一個方法為randAvg()，
 * 從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
 * 
*/

public class RandomAvg {
	
	public static void main(String[] args) {
		RandomAvg obj = new RandomAvg();
		int[] nums = new int[10];
		double avg = 0;
		
		nums = obj.produceRandom(10);
		avg = obj.randAvg(nums);
		
		System.out.println("本次亂數結果：");
		for(int i : nums) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.printf("平均值為：%.2f", avg);
		
	}
	
	public double randAvg(int[] data) {
		int sum = 0;
		double avg = 0;
		
		for(int i : data) {
			sum+=i;
		}
		avg = (sum+.0)/data.length;
		System.out.printf("平均值為：%.2f", avg);
		
		return avg;
	}
	
	public int[] produceRandom(int q) {
		int[] nums = new int[q];
		
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = (int) (Math.random()*101);	//產生 0~100(含100)的整數亂數
		}		
		return nums;
	}
}
