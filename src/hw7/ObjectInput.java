package hw7;

import java.io.*;

public class ObjectInput {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");
		try (
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)				
			){
			
			System.out.println(file.getName() + "檔案內容如下：");
			System.out.println("===============================");
			
			while(true) {
				Object obj = ois.readObject();
				if(obj instanceof Cat) {
					((Cat) obj).speak();
				}
				if(obj instanceof Dog) {
					((Dog) obj).speak();
				}
				System.out.println("-----------------------------");
			}
		}catch(EOFException e) {
			System.out.println("資料讀取完畢!");
		}
	}
}
