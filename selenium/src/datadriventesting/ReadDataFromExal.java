package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import

    




public class ReadDataFromExal {

	public static void main(String[] args)throws EncryptedContentInfo IQException {
		//step1:create FileInputStream Object
		FileInputStream fis = new FileInputStream("./testdata/Book1.xlsx");
		
		//step2:create respective file type object
		workbook workbook = WorkbookFactory.create(fis);
		
		//step3:call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
	}



