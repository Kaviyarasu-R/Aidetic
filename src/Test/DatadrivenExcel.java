package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Fetch data from excel 
FileInputStream fileinput = new FileInputStream("C:\\Users\\elcot\\Documents\\CyberLink\\test.xlsx");

XSSFWorkbook workbook = new XSSFWorkbook(fileinput);

XSSFSheet sheetname = workbook.getSheet("Sheet1");

int rowcount = sheetname.getLastRowNum();
int columncount = sheetname.getRow(0).getLastCellNum();

System.out.println("Row" + rowcount);
System.out.println("column" +columncount);

	}

}
//div[@aria-label='Mon Jul 10 2023']