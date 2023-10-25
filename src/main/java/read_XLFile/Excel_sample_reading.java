package read_XLFile;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;



 

public class Excel_sample_reading {

	@Test
	public void read_excel_file_aspercondition() throws IOException
	{
		read_excel_file("Smoke_2","Email");
		
	}
	public void read_excel_file(String testName,String columnName) throws IOException {
		String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Samba");
        //System.out.println(sheet.getRow(2).getCell(3));

		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			Cell cell = row.getCell(0);//fixing cell index as 0 becasuse our test cases are mapped in cell 0 then running the row loops
			String value = cell.getStringCellValue();
			//System.out.println(value);
			if(value.equals(testName)){
				Row rownew = sheet.getRow(0);//fixing the rowindex as 0 because our columns are mapped in row 0 then running the column loops
				for (int j = 0; j < lastCell; j++) {
					Cell cellnew = rownew.getCell(j);
					String valuenew = cell.getStringCellValue();
					if(cellnew.toString().equals(columnName)) {

				System.out.println(sheet.getRow(i).getCell(j));

					}
				}
			}
		}
	}
}


	

 


