package SeleniumAllConceptsiWithTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDataProvider {
	
	@Parameters({"URL" ,"Password"})
	@Test
	public void readDataFromXml(String URL, String Password) {
		System.out.println("Extracted URL Name " + URL);
		System.out.println("Extracted Password Name " + Password);
		
	}

	@Test(dataProvider="getData")
	public void readDataFromDataprovide(String EmployeeID, String EmployeeName) {
		System.out.println(EmployeeID);
		System.out.println(EmployeeName);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] ="EmployeeId 1";
		data[0][1] ="EmployeeId Name 1";
		
		data[1][0] ="EmployeeId 2";
		data[1][1] ="EmployeeId Name 2";
		
		data[2][0] ="EmployeeId 3";
		data[2][1] ="EmployeeId Name 3";
		
		return data;
		
		
	}
	
	
}
