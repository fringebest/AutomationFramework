package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String sheetPath,String sheetName){
        try{
            workbook = new XSSFWorkbook(sheetPath);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            e.getStackTrace();
        }

    }
    public static void getRowCount(){
        try{

            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("Number of row count is: " + rowCount);
        } catch (Exception e){
            e.getStackTrace();
            e.getMessage();
            e.getCause();
        }

    }

    public static void getCellData(int rowNum, int cellNum){
       try{

           String cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
           System.out.println("Return of the cell data: " + cellData);
       }catch (Exception e){
           System.out.println(e.getCause());;
           System.out.println(e.getMessage());
           e.getStackTrace();
       }

    }

    public static void main(String[] args) {
        getRowCount();
        getCellData(1,1);
    }
}
