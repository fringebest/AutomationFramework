package utils;

public class ExcelUtilsDemo {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        ExcelUtils excel = new ExcelUtils(projectPath + "/excel/file_example_XLS_100.xlsx","Sheet1");
    }
}
