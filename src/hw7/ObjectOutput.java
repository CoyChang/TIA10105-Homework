package hw7;

import java.io.*;

public class ObjectOutput {

	public static void main(String[] args) throws Exception {
		String directoryPath = "C:\\data";
		String fileName = "Object.ser";
		Object[] obj = {
							new Cat("Cat 1"),
							new Cat("Cat 2"),
							new Dog("Dog 1"),
							new Dog("Dog 2")
						};
		
		File directory = new File(directoryPath);
		
		if(!directory.exists()) {
			directory.mkdirs();
		}
		
		File file = new File(directory, fileName);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i=0 ; i<obj.length ; i++) {
			oos.writeObject(obj[i]);
		}	
		oos.close();
		fos.close();
		
		System.out.println("寫入完成!");
	}
}
