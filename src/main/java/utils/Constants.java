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
    public static final String CALLBACK_JSON = propertiesService.getProperty("callback_json");
    public static final String LINK_JSON = propertiesService.getProperty("link_json");
    public static final String SIMPLE_API_JSON = propertiesService.getProperty("simple_api_json");
    public static final String DATA_SET_JSON = propertiesService.getProperty("data_set_json");

}
