package utils;

public class ExcelUtilsDemo {
public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils("C:\\Users\\Kibbcom_Predator_5\\Desktop\\testExcel1.xlsx", "Credentials");
		
		excel.getRowCount();
		System.out.println(excel.getCellDataString(1, 0));
		System.out.println(excel.getCellDataString(1, 1));
		excel.getCellDataString(1, 1);
	
	}
}
