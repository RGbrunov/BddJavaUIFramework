package org.example.core.ui.driver;

import org.example.core.ui.browser.Browser;
import org.example.core.ui.browser.Chrome;
import org.example.core.ui.browser.Firefox;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Class created in order to recognize the org.example.core.ui.driver type.
 */
public final class BrowserFactory {

    private static final Map<DriverType, Supplier<Browser>> BROWSERS = new EnumMap<>(DriverType.class);

    static {
        BROWSERS.put(DriverType.CHROME, Chrome::new);
        BROWSERS.put(DriverType.FIREFOX, Firefox::new);
    }

    /**
     * Private Constructor for the BrowserFactory utility class.
     */
    private BrowserFactory() {
    }

    /**
     * Return the WebDriver instance specified by the environment properties.
     *
     * @param driverType Enum value specified from DriverType.
     * @return a WebDriver instance.
     */
    public static WebDriver getDriverManager(final DriverType driverType) {
        return BROWSERS.getOrDefault(driverType, Chrome::new).get().getBrowser();
    }
}
