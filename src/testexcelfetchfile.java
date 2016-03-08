import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Constants;
import utilities.ExcelUtility;


public class testexcelfetchfile {
	private String sTestCaseName;
	 
	private int iTestCaseRow;
	@Test(dataProvider = "Authentication")
	public void login(String userName, String password){
		System.out.println(userName + "  &  " +password);
		System.out.println(Constants.File_Path);
	}
	
	
	public static void  tb2() throws Exception{
		 Object[][] testObjArray = ExcelUtility.getTableArray("C://Users//Pratyush//git//RFTTWithPAgeobjectFactory//src//dataEngine//DataEngine.xlsx","Sheet2",19);
		 String [][] str = (String[][]) testObjArray;
		 System.out.println(str + "   my str");
	}
	
	
	
	@DataProvider
	 
	  public Object[][] Authentication() throws Exception{
	 
		    // Setting up the Test Data Excel file
	 
		 	ExcelUtility.setExcelFile(Constants.File_Path,"Sheet2");
	 
		 	sTestCaseName = this.toString();
	 
		 
	 
		  	sTestCaseName = ExcelUtility.getTestCaseName(this.toString());
	 
		  System.out.println(sTestCaseName + " coder");
		 	iTestCaseRow = ExcelUtility.getRowContains(sTestCaseName,0);
	 
		 	System.out.println(iTestCaseRow);
		    Object[][] testObjArray = ExcelUtility.getTableArray(Constants.File_Path,"Sheet2",iTestCaseRow);
	 
		    	return (testObjArray);
	 
			}

}
