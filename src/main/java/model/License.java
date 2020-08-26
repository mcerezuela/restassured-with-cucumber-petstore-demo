package model;

/**
 * License information for the exposed API.
 */
public class License {
    /**
     * REQUIRED. The license name used for the API.
     */
    private String name;

    /**
     * A URL to the license used for the API. MUST be in the format of a URL.
     */
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
