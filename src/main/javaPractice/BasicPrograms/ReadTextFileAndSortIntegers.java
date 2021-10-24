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

public class ReadTextFileAndSortIntegers {

	public static void main(String[] args) throws IOException {

		ArrayList list = new ArrayList();

		URL path = ReadTextFileAndSortIntegers.class.getResource("input.txt");
		File f = new File(path.getFile());
		// reader = new BufferedReader(new FileReader(f));

		BufferedReader bufReader = new BufferedReader(new FileReader(f));
		String line = bufReader.readLine();
		while (line != null) {
			list.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		URL path1 = ReadTextFileAndSortIntegers.class.getResource("Output.txt");
		File f1 = new File(path.getFile());

		//BufferedWriter bufwriter = new BufferedWriter(new FileWriter(f1));
		FileWriter output = new FileWriter(f1);
		for (int i = 0; i < list.size(); i++) {
			output.write(list.get(i).toString());
			output.append("\n");

		}

		output.close();
		System.out.println("Ouput printed to file");
	}

}