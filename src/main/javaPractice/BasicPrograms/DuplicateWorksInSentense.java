package BasicPrograms;
///incomplete
public class DuplicateWorksInSentense {

	public static void main(String[] args) {
		
		String inputstring = "yash rao yash pooja yash rahul dinky";
		
		System.out.println("Given Sentense is" + inputstring);
		
		String[] inputarray = inputstring.split(" ");
		
		int wordsLength = inputarray.length;
		System.out.println(wordsLength);
		
		int count = 0;
		String doubleStringname ="";
		
		for(int i=0;i<wordsLength;i++) {
			for (int j = i + 1; j < wordsLength; j++) {
	            if (inputarray[i] == inputarray[j]) {
	               System.out.print(inputarray[j] + " ");
	               break;
	            }
				
				
			}
			
			
		}

	}

}
