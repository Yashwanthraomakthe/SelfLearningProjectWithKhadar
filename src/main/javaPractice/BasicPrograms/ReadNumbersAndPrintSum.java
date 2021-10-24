package BasicPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadNumbersAndPrintSum {

	public static void main(String[] args) throws IOException {

		URL path = ReadNumbersAndPrintSum.class.getResource("input.txt");
		File f = new File(path.getFile());

		BufferedReader bufReader = new BufferedReader(new FileReader(f));
		//String line = bufReader.readLine();
		int line = bufReader.read();
		
		ArrayList list = new ArrayList();
		Scanner scan = new Scanner(f);

		int count = 1;
		while (scan.hasNext() && count <= 7) {
			count++;
			if (scan.hasNextInt()) {
				list.add(scan);

			} else
				System.out.println("Error");
		}

		scan.close();
		System.out.println(list);

	}
}