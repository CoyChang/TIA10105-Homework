package hw9;

public class EatGame extends Thread{
	int counter = 1;
	
	public EatGame() {
		
	}
	
	public EatGame(String name) {
		super(name);
	}
	
	public void run() { // 執行緒執行的地方
		while (counter <= 10) {
			System.out.println(getName()+"吃了第"+counter+"碗飯");
			counter++;

			try {
				Thread.sleep((int)(Math.random()*2501)+500); // 暫停500~3000毫秒
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+"吃完了！");
	}	

	public static void main(String[] args) {
		EatGame t1 = new EatGame("饅頭人");
		EatGame t2 = new EatGame("詹姆士");
		System.out.println("-----大胃王快食比賽開始-----");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束-----");		
	}

}
