package BasicPrograms;

import static org.testng.Assert.assertEquals;

/*
 * Methods in String class
 * substring()	returns the substring of the string
 * replace()	replaces the specified old character with the specified new character
 * charAt()	returns the character present in the specified location
getBytes()	converts the string to an array of bytes
indexOf()	returns the position of the specified character in the string
compareTo()	compares two strings in the dictionary order
trim()	removes any leading and trailing whitespaces
format()	returns a formatted string
split()	breaks the string into an array of strings
toLowerCase()	converts the string to lowercase
toUpperCase()	converts the string to uppercase
valueOf()	returns the string representation of the specified argument
toCharArray()	converts the string to a char array
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.exec.util.StringUtils;
import org.testng.annotations.Test;

public class StringOperations {
//-----------------------------------------------------------------------------------------------//
	// @Test(enabled = false)
	public void reverseStringWithoutUsingMethods() {
		String str = "Yashwanth";
		System.out.println("The string is:" + str);
		String revstr = " ";
		int strlength = str.length();
		for (int i = strlength - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);

		}

		System.out.println("Reversed String is " + revstr);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// -----------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void reverseStringUsingStrigBuilder() {
		String str = "Yashwanth";
		System.out.println("The string is:" + str);

		StringBuilder input1 = new StringBuilder();
		input1.append(str);
		input1.reverse();

		System.out.println("Reversed String is " + input1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// ------------------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void reverseStringUsingStrigBuffer() {
		String str = "malayalam";
		System.out.println("The string is:" + str);

		StringBuffer sbr = new StringBuffer(str);
		StringBuffer s = sbr.reverse();

		System.out.println("Reversed String is " + s);
		if (sbr.equals(s)) {
			System.out.println("Given string is polindram");
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// ------------------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void reverseStringUsingListIterator() {
		String input = "Geeks For Geeks";
		char[] hello = input.toCharArray();

		List<Character> trial1 = new ArrayList<Character>();

		for (char c : hello)
			trial1.add(c);

		Collections.reverse(trial1);
		ListIterator<Character> li = trial1.listIterator();
		while (li.hasNext())
			System.out.println(li.next());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

//------------------------------------------------------------------------------------------------------//
	// @Test()
	public void duplicateCharactorsInString() {

		String str = "Yashwanth";
		char[] charArray = str.toCharArray();
		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					System.out.print(charArray[j] + " ");
					break;
				}
			}
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

//------------------------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void CharToStringandStringToChar() {

		// Method 1: Using toString() method
		char ch = 'a';
		String str = Character.toString(ch);
		System.out.println("String is: " + str);

		// Method 2: Using valueOf() method
		String str2 = String.valueOf(ch);
		System.out.println("String is: " + str2);

		/// String to Charactor////

		System.out.println("Given input String is 'Yashwanth' ");

		String str3 = "Yashwanth";
		int stringlength = str3.length();
		System.out.println("Given String lenth is " + stringlength);

		for (int i = 0; i < stringlength; i++) {
			char ch1 = str3.charAt(i);
			System.out.println("Generated Charactor is " + ch1);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//----------------------------------------------------------------------------------------------------------

	@Test(enabled = false)
	public void removeWhitespaces() {
		String str = "      Geeks     for    Geeks        ";

		// Call the replaceAll() method
		str = str.replaceAll("\\s", "");

		System.out.println(str);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//-------------------------------------------------------------------------------------------------------------

	@Test(enabled = false)
	public void StringSort() {

		String original = "edcba";
		char[] chars = original.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//-------------------------------------------------------------------------------------------------------------

	@Test(enabled = false)
	public void occurrenceOfCharacterInString() {

		String str = "Yashwanth";
		// ASCII values ranges upto 256
		int counter[] = new int[256];

		// String length
		int len = str.length();

		/*
		 * This array holds the occurrence of each char, For example ASCII value of A is
		 * 65 so if A is found twice then counter[65] would have the value 2, here 65 is
		 * the ASCII value of A
		 */
		for (int i = 0; i < len; i++)
			counter[str.charAt(i)]++;

		// We are creating another array with the size of String
		char array[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {

				/*
				 * If a char is found in String then set the flag so that we can print the
				 * occurrence
				 */
				if (str.charAt(i) == array[j])
					flag++;
			}

			if (flag == 1)
				System.out
						.println("Occurrence of char " + str.charAt(i) + " in the String is:" + counter[str.charAt(i)]);
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// -------------------------------------------------------------------------------------------------------------

	@Test(enabled = false)
	public void Stringcharcount() {

		String someString = "elephant";
		char someChar = 'e';
		int count = 0;

		for (int i = 0; i < someString.length(); i++) {
			if (someString.charAt(i) == someChar) {
				count++;
			}
		}
		// assertEquals(2, count);
		System.out.println("Charactor count " + count);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//-------------------------------------------------------------------------------------------------------------

	//@Test()
	public void ReversWordsInString() {

		String original = "Vitech Systems Asia";

		System.out.println("Original String" + original);
		String[] s = original.split(" ");

		String[] array = new String[s.length];

		for (int i = s.length - 1; i >= 0; i--) {
			String s1 = s[i];
			System.out.print(s1);
			System.out.print(" ");

		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//-------------------------------------------------------------------------------------------------------------

	// @Test(enabled=false)
	public void ReplaceWords() {

		String original = "USAPyramidIndiaIndiaPyramidDas";

		System.out.println("Original String" + original);
		String[] s = original.split(" ");

		String[] array = new String[s.length];

		for (int i = s.length - 1; i >= 0; i--) {
			String s1 = s[i];
			System.out.print(s1);
			System.out.print(" ");

		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
//-------------------------------------------------------------------------------------------------------------

	// @Test()
	public void SeparateNumberFromAlphanumericSting() {

		String str = "avbkjd1122klj4 543 af";

		System.out.println("Original String" + str);
		str = str.replaceAll("[^\\d]", " ");
		str = str.trim();
		str = str.replaceAll(" +", " ");
		System.out.println("Modified String" + str);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

//-------------------------------------------------------------------------------------------------------------
	// @Test()
	public void reverseWordsInString() {

		String input = "This is March";
		// Ouput:"sihT si hcraM";
		String[] newinput = input.split(" ");

		int noOfWords = newinput.length;
		System.out.println("Number of words in String " + noOfWords);
		String newWord = " ";
		for (int i = 0; i < noOfWords; i++) {
			String word = newinput[i];
			int wordlength = word.length();
			for (int i1 = wordlength - 1; i1 >= 0; i1--) {
				newWord = newWord + word.charAt(i1);
			}
		}
		String reversewordsSentense = " ";
		reversewordsSentense = reversewordsSentense + " " + newWord;
		System.out.println("Revered words Sentence " + reversewordsSentense);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	// -------------------------------------------------------------------------------------------------------------

	@Test()
	public void AnagramString() {

		String n1 = "SILENT";
		String n2 = "LISTEN";

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		int n1Length = n1.length();
		int n2Length = n2.length();
		for (int i = 0; i < n1Length; i++) {
			char c = n1.charAt(i);
			list1.add(c);

		}
		Collections.sort(list1);
		for (int i = 0; i < n2Length; i++) {
			char c = n2.charAt(i);
			list2.add(c);

		}
		Collections.sort(list2);

		if (list1.equals(list2)) {
			System.out.println("Given Strings are Anagram");
		} else
			System.out.println("Given Strings are not Anagram");

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
// -------------------------------------------------------------------------------------------------------------

}
