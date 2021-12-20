package ryancharuk.LabNine;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class Run {

	public static void main(String[] args) throws IOException {
		BufferedInputStream reader = new BufferedInputStream(new FileInputStream("dsadsa"));
		try  {
			int a;
			while ((a = reader.read()) >= 0) {
				System.out.print((char) a);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
