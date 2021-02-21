package BasicPrograms;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class StringPatterns {

	@Test(enabled = false)
	public void patternNoOfTimesCheck() {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abbbabbaba");

		int count = 0;
		while (m.find()) {
			count++;
			System.out.println(m.group() + " number of occourences " + count);

		}
		// System.out.println("number of occourencess " + count);
		System.out.println("++++++++++++++++++++++++++++++++ ");
	}

	// ----------------------------------------------------------------------------------------
	// Check this part
	@Test(enabled = false)
	public void charactorClass() {

		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("a1b7@z#");
		while (m.find()) {
			System.out.println(m.find());
		}

		System.out.println("++++++++++++++++++++++++++++++++ ");
	}

	// ----------------------------------------------------------------------------------------
	@Test(enabled = false)
	public void StringSplit() {

		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("Yashwanth software solutuions");
		for (String s1 : s) {
			System.out.println(s1);
		}

		System.out.println("++++++++++++++++++++++++++++++++ ");
	}

	// ----------------------------------------------------------------------------------------
	@Test(enabled = false)
	public void StringSplitWithoutPatternClass() {

		String s = "Yashwanth software solutuions";
		String[] s1 = s.split(" ");
		for (String s2 : s1)
			System.out.println(s2);
	}

	// ----------------------------------------------------------------------------------------
	@Test(enabled=false)
	public void Stringtokenizer() {

		StringTokenizer st = new StringTokenizer("Yashwanth software solutuions");
		int count = 0;
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			count++;

		}
		System.out.println("Number of words " + count);
	}

	// ----------------------------------------------------------------------------------------

	@Test(enabled=false)
	public void StringtokenizerUse2() {

		StringTokenizer st = new StringTokenizer("25-05-1990" , "-");
		int count = 0;
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			count++;

		}
		System.out.println("Number of words " + count);
	}

	// ----------------------------------------------------------------------------------------
	@Test()
	public void PrintValidPhoneNumber() {

		Pattern p = Pattern.compile("[7-9][0-9][]{9}");
		//Matcher m = p.matcher(args[0]);
		//if(m.find()&&m.group().equals(args[0])) {
			System.out.println("Valid Number");
		//}else
			System.out.println("Invalid number");
	}

	// ----------------------------------------------------------------------------------------
}
