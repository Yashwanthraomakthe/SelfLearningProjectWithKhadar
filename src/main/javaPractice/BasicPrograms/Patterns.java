package BasicPrograms;

import org.testng.annotations.Test;

public class Patterns {

	@Test()
	public void RightTriangleStarPattern() {
		int i, j = 0;
		int row = 6;
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
	}
	// -------------------------------------------------------------------------------//

	

}
