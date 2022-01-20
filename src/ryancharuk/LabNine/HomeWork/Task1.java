package ryancharuk.LabNine.HomeWork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	private static int getMaxValue(byte[] min) {
		int maxValue = min[0];
		for (byte b : min) {
			if ((int) b > maxValue)
				maxValue = b;
		}
		return maxValue;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите имя файла: ");
		byte[] min = new byte[256];

		try (FileInputStream file = new FileInputStream(reader.readLine())) {
			while (file.available() > 0) {
				int read = file.read();
				min[read]++;
			}

			for (int i = 0; i < min.length; i++) {
				if (min[i] == getMaxValue(min)) {
					System.out.print((char) i + " ");
				}
			}
		}
		reader.close();
	}
}
