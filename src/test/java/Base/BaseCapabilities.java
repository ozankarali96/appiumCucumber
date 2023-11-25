package Base;
import Utilities.PropertiesReader;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.Set;

public class BaseCapabilities {
    public static IOSDriver driver;
    private static Logger logger = LogManager.getLogger(BaseCapabilities.class);

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities dc = new DesiredCapabilities();
        PropertiesReader propertiesReader = new PropertiesReader();
       
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, propertiesReader.getDriverName());
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, propertiesReader.getPlatformName());
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertiesReader.getPlatformVersion());
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, propertiesReader.getDeviceName());
        dc.setCapability(MobileCapabilityType.APP, propertiesReader.getAppName());

        logger.info("Driver capabilities loaded.");
        URL url = new URL(propertiesReader.getappiumHubUrl());
        logger.info("Driver getting ready...");
        driver = new IOSDriver(url, dc);
        logger.info("Driver is ready");

    }
    @After
    public void tearDown() {
        logger.info("Driver will quit...");
        driver.quit();
    }
}
