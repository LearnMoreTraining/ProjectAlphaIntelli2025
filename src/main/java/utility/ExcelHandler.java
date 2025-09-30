package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {

    public static String getExcelData(String sheetName,int row , int column){
        File f = new File("src/main/resources/testdata/TestData.xlsx");
        FileInputStream fis;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
           workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(column).getStringCellValue();
    }
}
