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
}
