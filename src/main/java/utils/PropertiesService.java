package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesService {
    public Properties properties;

    public PropertiesService(String[] sources) {
        properties = new Properties();
        loadProperties(sources);
    }

    private void loadProperties(String[] sources) {
        try {
            for (String source : sources) {
                properties.load(getClass().getResourceAsStream(source));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
