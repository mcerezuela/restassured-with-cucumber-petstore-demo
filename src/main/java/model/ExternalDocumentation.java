package model;

/**
 * Allows referencing an external resource for extended documentation.
 */
public class ExternalDocumentation {
    /**
     * A short description of the target documentation. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * REQUIRED. The URL for the target documentation. Value MUST be in the format of a URL.
     */
    private String url;
}
