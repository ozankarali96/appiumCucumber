package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

    private static final String CONFIGFILEPATH = "./config.properties";

    public static String getValue(String key) throws Exception {

        File file = new File(CONFIGFILEPATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }
    public String getDriverName() throws Exception {
        String driverName = PropertiesReader.getValue("driverName");
        return driverName;
    }
    public String getPlatformName() throws Exception {
        String platformName = PropertiesReader.getValue("platformName");
        return platformName;
    }
    public String getPlatformVersion() throws Exception {
        String platformVersion = PropertiesReader.getValue("platformVersion");
        return platformVersion;
    }
    public String getDeviceName() throws Exception {
        String deviceName = PropertiesReader.getValue("deviceName");
        return deviceName;
    }
    public String getAppName() throws Exception {
        String appName = PropertiesReader.getValue("appName");
        return appName;
    }
    public String getappiumHubUrl() throws Exception {
        String appiumHubUrl = PropertiesReader.getValue("appiumHubUrl");
        return appiumHubUrl;
    }

}