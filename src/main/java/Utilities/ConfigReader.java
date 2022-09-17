package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //configuration properties file daki datalari okumamizi sagliyor
    private static Properties properties;
    static {
        String path = "src/main/resources/configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }catch (Exception e){
            System.out.println("Configuration file couldn't found.");
        }
    }
    //will return value from config
    public static String getProperty(String key){

        return properties.getProperty(key);
    }

    // how to use
    // ConfigReader.getProperty("osmanNumara") burada numara girişi olamadan ve tüm caselerde kullanılabilir. girişler sadece tek bir yerden kullanlabilir.

}
