package model;

/**
 * Contact information for the exposed API.
 */
public class Contact {
    /**
     * The identifying name of the contact person/organization.
     */
    private String name;

    /**
     * The URL pointing to the contact information. MUST be in the format of a URL.
     */
    private String url;

    /**
     * The email address of the contact person/organization. MUST be in the format of an email address.
     */
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
