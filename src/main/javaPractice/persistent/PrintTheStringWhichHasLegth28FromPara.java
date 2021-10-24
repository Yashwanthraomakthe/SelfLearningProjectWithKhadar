package persistent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class PrintTheStringWhichHasLegth28FromPara {

	public static void main(String[] args) throws IOException {

		URL path = PrintTheStringWhichHasLegth28FromPara.class.getResource("input.txt");
		File f = new File(path.getFile());

		BufferedReader bufReader = new BufferedReader(new FileReader(f));
		String line = bufReader.readLine();

		while (line != null) {
			line.trim();
			int eachlineLength = line.length();
			if (eachlineLength == 28) {
				System.out.println(line);
			}
			line = bufReader.readLine();
		}
		bufReader.close();
	}

}