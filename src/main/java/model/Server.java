package model;

import java.util.Map;

/**
 * An object representing a Server.
 */
public class Server {
    /**
     * REQUIRED. A URL to the target host. This URL supports Server Variables and MAY be relative, to indicate that
     * the host location is relative to the location where the OpenAPI document is being served. Variable
     * substitutions will be made when a variable is named in {brackets}.
     */
    private String url;

    /**
     * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text
     * representation.
     */
    private String description;

    /**
     * A map between a variable name and its value. The value is used for substitution in the server's URL template.
     */
    private Map<String, ServerVariable> variables;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, ServerVariable> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, ServerVariable> variables) {
        this.variables = variables;
    }
}
