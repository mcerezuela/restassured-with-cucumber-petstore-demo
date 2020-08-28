package model;

/**
 * The object provides metadata about the API. The metadata MAY be used by the clients if needed, and MAY be presented
 * in editing or documentation generation tools for convenience.
 */
public class Info {
    /**
     * REQUIRED. The title of the API.
     */
    private String title;

    /**
     * A short description of the API. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * A URL to the Terms of Service for the API. MUST be in the format of a URL.
     */
    private String termsOfService;

    /**
     * The contact information for the exposed API.
     */
    private Contact contact;

    /**
     * The license information for the exposed API.
     */
    private License license;

    /**
     * 	REQUIRED. The version of the OpenAPI document (which is distinct from the OpenAPI Specification version or
     * 	the API implementation version).
     */
    private String version;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.title = description;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
