package hw7;

import java.io.*;

public class RandomData {

	public static void main(String[] args) throws Exception{
		try {
			File file = new File(".\\src\\hw7\\Data.txt");
			int random = 0;
			
			FileWriter fio = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fio);
			PrintWriter pw = new PrintWriter(bw);
			
			for(int i=0 ; i<10 ; i++) {
				random = (int) (Math.random()*1000)+1;
				System.out.println(random);
				if(i < 9) {
					pw.print(random + ",");
				}else {
					pw.println(random);
				}				
			}		
			
			System.out.println("寫入完成!");
			bw.close();
			fio.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
