package ryancharuk.LabNine.HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Task2 {
	public static void main(String[] args) throws IOException {

		BasicFileAttributes attributes;

		try (FileWriter fileWriter = new FileWriter("C:/NewFileTask2.txt")) {
			Path file = Path.of("C:/NewFileTask2.txt");
			attributes = Files.readAttributes(file, BasicFileAttributes.class);
			fileWriter.write("Название файла: " + file.getFileName() + ". Путь файла: "
					+ file.getParent() + ". Дата создания файла: " + attributes.creationTime());
		}
	}
}
