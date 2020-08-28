package utils;

public class Constants {

    private static final String TEST_PROPERTIES = "/test_config.properties";

    private static PropertiesService propertiesService = createPropertiesService();

    private static PropertiesService createPropertiesService() {
        return new PropertiesService(new String[] {
                TEST_PROPERTIES,
        });
    }

    public static final String PET_STORE_JSON = propertiesService.getProperty("pet_store_json");

}
