package ryancharuk.LabEight.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		String s;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		s = reader.readLine();
		System.out.println(s.matches("^[\\w]{1,20}$"));
	}
}
