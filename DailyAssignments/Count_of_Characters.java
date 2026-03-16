package assignment_16March;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

public class Count_of_Characters {

	@Test
	public void processExcelData() throws IOException {
		List<Integer> numberList = new ArrayList<>();

		FileInputStream fis = new FileInputStream("D:\\M65\\Selenium\\SeleniumFile\\Assignment.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			Row row = sh.getRow(i);
			if (row == null)
				continue;

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell == null)
					continue;

				if (cell.getCellType() == CellType.NUMERIC) {
					numberList.add((int) cell.getNumericCellValue());
				} else {
					System.out.println("Non-numeric found: " + cell.toString());
				}
			}
		}

		wb.close();
		fis.close();

		for (Integer num : numberList) {
			checkNumberProperties(num);
		}
	}

	public void checkNumberProperties(int num) {
		String type = (num % 2 == 0) ? "Even" : "Odd";
		String primeStatus = isPrime(num) ? " & Prime Number" : "";

		System.out.println(num + " is " + type + primeStatus);
	}

	public boolean isPrime(int n) {
		if (n <= 1 || n % 2 == 0)
			return false;
		if (n == 2)
			return true;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}