package BasicPrograms;

import org.testng.annotations.Test;

public class NumbersOperations {

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void arthameticOperations() {
		int a = 10;
		int b = 20;
		int addition = a + b;
		int substraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		System.out.println("First Number " + a);
		System.out.println("Secound Number " + b);
		System.out.println("The addition of two Numbers is " + addition);
		System.out.println("The substraction of two Numbers is " + substraction);
		System.out.println("The multiplication of two Numbers is " + multiplication);
		System.out.println("The division of two Numbers is " + division);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void EvenOrOddNumber() {
		int givenNumber = 9;
		System.out.println("Given Number is" + givenNumber);
		if (givenNumber % 2 == 0) {
			System.out.println("Given Number is EVEN");
		}

		else {
			System.out.println("Given Number is ODD");
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void PowerOfNumber() {
		int inputNumber = 6;
		int Power = inputNumber * inputNumber;
		System.out.println("Given number is " + inputNumber);
		System.out.println("The Power of Given number is " + Power);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void QuotientandRemainder() {

		int FirstNumber = 25;
		int SecoundNumber = 4;

		int quotient = FirstNumber / SecoundNumber;
		int remainder = FirstNumber % SecoundNumber;

		System.out.println("Given First Number: " + FirstNumber);
		System.out.println("Given Secound Number: " + SecoundNumber);
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void LeapYearLogic() {
		int year = 2004;
		System.out.println("Enter any Year:" + year);

		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			} else
				isLeap = true;
		} else {
			isLeap = false;
		}

		if (isLeap == true)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void SimpleIntrest() {

		int principalAmount = 5000;
		System.out.println("Principal Amount is: " + principalAmount);

		int RateOfInterest = 5;
		System.out.println("RateOfInterest is: " + RateOfInterest);

		int Time = 2;
		System.out.println("Time: " + Time);

		int SimpleInterest = principalAmount * RateOfInterest * Time / 100;
		System.out.println("Simple Interest for given inputs is " + SimpleInterest);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void CircleAreaandCircumference() {
		double radius = 1;
		double Circumference = 2 * Math.PI * (radius);
		System.out.println("Circumference of circle is " + Circumference);

		double Area = Math.PI * (radius * radius);
		System.out.println("Circumference of circle is " + Area);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// --------------------------------------------------------------------------------------------//
	@Test(enabled=false)
	public void reverseNumber() {
		int num = 123;
		System.out.println("Given Number is " + num);
		int revnum = 0;

		while (num != 0) {
			revnum = revnum * 10;
			revnum = revnum + num % 10;
			num = num / 10;
		}
		System.out.println("Revers of given number is " + revnum);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	
	
	
	// --------------------------------------------------------------------------------------------//
		@Test(enabled=false)
		public void swapNumbersWithThridNumber() {
			int n1 = 4;
			int n2 = 6;
			int temp;
			System.out.println("Given No1 is " + n1);
			System.out.println("Given No2 is " + n2);
			
			temp=n1;
			n1=n2;
			n2=temp;
			
			System.out.println("Swaped No1 is " + n1);
			System.out.println("Swaped No2 is " + n2);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}
		
		// --------------------------------------------------------------------------------------------//
		
		@Test(enabled=false)
		public void swapNumbersWithOutThridNumber() {
			int n1 = 4;
			int n2 = 6;
			System.out.println("Given No1 is " + n1);
			System.out.println("Given No2 is " + n2);
			
			n1 = n1 + n2;
			n2=n1-n2;
			n1=n1-n2;
			
			System.out.println("Swaped No1 is " + n1);
			System.out.println("Swaped No2 is " + n2);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		}
		
		// --------------------------------------------------------------------------------------------//
}
