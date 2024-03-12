package hw9;


//程式未完成，還需要再修改
public class TestDepTakeOut {

	public static void main(String[] args) {
		Money money = new Money();
		Mom mom = new Mom(money);
		Bear bear = new Bear(money);	
		mom.start();
		bear.start();
	}
}

class Money {
	private int deposit = 0;	//帳戶存款
	
	synchronized public void mom(int money) {		
		while(deposit > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();		
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit += money;
		System.out.println("媽媽存了" + money + "帳戶共有：" + deposit);
		notify();	
	}
	
	synchronized public void bear(int money) {
		while(deposit < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit -= money;
		System.out.println("熊大領了" + money + "帳戶共有：" + deposit);
		if(deposit < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();	
		}
	}
}

class Mom extends Thread {
	Money money;
	
	public Mom(Money money) {
		this.money = money;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++)
			money.mom(2000);	//媽媽一次匯2000元
	}
}

class Bear extends Thread {
	Money money;
	
	public Bear(Money money) {
		this.money = money;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++)
			money.bear(1000);	//熊大一次提款1000元
	}
}
