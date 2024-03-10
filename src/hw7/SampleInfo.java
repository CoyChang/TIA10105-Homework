package hw7;

import java.io.*;

public class SampleInfo {

	public static void main(String[] args) throws IOException{
		File file = new File(".\\src\\hw7\\Sample.txt");
		
		FileReader fr = new FileReader(file);
		LineNumberReader lnr = new LineNumberReader(fr);
		String str;
		int line = 0;	//總行數
		 int totalChars = 0;	//字元個數
		long size = file.length();

		
		while((str = lnr.readLine()) != null) {
			System.out.println(str);
			totalChars += str.length();
			line = lnr.getLineNumber();
		}
			
		System.out.println();
		System.out.println("=======================");
		System.out.println(file.getName() + "檔案資訊：");
		System.out.println("=======================");
		System.out.println("File size: " + size + " Bytes");
		System.out.println("共有 " + totalChars + " 個字元");
		System.out.println("有 "+ line + " 列資料");

		lnr.close();
		fr.close();
	}

}
