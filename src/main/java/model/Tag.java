package model;

/**
 * Adds metadata to a single tag that is used by the Operation Object. It is not mandatory to have a Tag Object per
 * tag defined in the Operation Object instances.
 */
public class Tag {
    /**
     * REQUIRED. The name of the tag.
     */
    private String name;

    /**
     * A short description for the tag. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * Additional external documentation for this tag.
     */
    private ExternalDocumentation externalDocs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }
}
