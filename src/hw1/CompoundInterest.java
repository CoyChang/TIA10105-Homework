package hw1;

/* hw1_05
 * 某人在銀行存入150萬，銀行利率為2%，
 * 如果每年利息都繼續存入銀行，請用程式計算10年後，
 * 本金加利息共有多少錢 (用複利計算，公式：本利和 = 本金*(1+年利率)^期間)
 */

public class CompoundInterest {

	public static void main(String[] args) {
		int principal = 1_500_000;	//本金
		double interest = 0.02;	//銀行利率
		double total = principal * Math.pow((1+interest), 10);	//計算本利和
		
		System.out.printf("存入本金：%d%n銀行利率：%.0f%%%n10年後本利合：%.0f", principal, interest*100, total);

	}

}
