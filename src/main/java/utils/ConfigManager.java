package utils;

import constants.DirectoryPaths;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class reads properties file
 */

public class ConfigManager {
    private static ConfigManager manager;
    private static Properties prop;


    /**
     * Singelton class for thread safe
     */
    private ConfigManager() throws IOException {
        prop = ConfigManager.readPropertiesFile(DirectoryPaths.CONFIG_PROPERTIES);
    }
    public static ConfigManager getInstance() {
        if (manager == null) {
            synchronized (ConfigManager.class) {

                try {
                    manager = new ConfigManager();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return manager;
    }

    /**
     * read property from file and
     * returns as String
     */
    public String getString(String key) {
        return prop.getProperty(key);
    }
    /**
     * read config.properties file
     */
    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }


}