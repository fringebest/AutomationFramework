package config;

import test.TestNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getProperties();
        setProperties();
        getProperties();
    }

    public static void getProperties(){

        try{
            InputStream inputStream = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
            prop.load(inputStream);
            String browser = prop.getProperty("browser");
            System.out.println(browser);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            e.getCause();
        }
    }

    public static void setProperties(){
        try{OutputStream outputStream = new FileOutputStream(projectPath + "/src/test/java/config/config.properties");
                 prop.setProperty("browser","chrome");
                 prop.store(outputStream,null);
        }catch (Exception e){
                e.getCause();
                e.getMessage();
                e.getStackTrace();
        }

    }
}
