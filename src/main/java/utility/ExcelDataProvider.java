package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
    XSSFWorkbook xwb;

    public ExcelDataProvider() throws EncryptedDocumentException, IOException {
        File fw = new File("src/main/java/testData/Book1.xlsx");
        FileInputStream fis = new FileInputStream(fw);
        xwb = new XSSFWorkbook(fis);
    }

    public String getStringData(String sheetName, int row, int column) {
        return xwb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    }
}
