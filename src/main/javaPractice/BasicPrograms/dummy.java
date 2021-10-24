package BasicPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class dummy {

	public static void main(String[] args) throws IOException {

		ArrayList list = new ArrayList();

		BufferedReader bufReader = new BufferedReader(new FileReader("F:\\Docs\\data.txt"));
		String line = bufReader.readLine();
		while (line != null) {
			list.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		FileWriter output = new FileWriter("F:\\Docs\\data.txt");
		for (int i = 0; i < list.size(); i++) {
			output.write(list.get(i).toString());
			output.write(" ");
			

		}

		output.close();
		System.out.println("Ouput printed to file");
	}

}