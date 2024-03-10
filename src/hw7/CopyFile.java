package hw7;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		CopyFile copyObj = new CopyFile();
		File origin = new File(".\\src\\hw7\\Sample.txt");
		File destination = new File(".\\src\\hw7\\SampleCopy.txt");
		copyObj.copyFile(origin, destination);
	}	
	
	public void copyFile(File origin, File destination) {
		try (
				FileReader fr = new FileReader(origin);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(destination);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)
			){
			
			String str;
			while((str = br.readLine()) != null) {
				pw.println(str);
			}
			
			System.out.println("複製完成!");
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
