package model;

/**
 * This is the root document object of the OpenAPI document (https://swagger.io/specification/#oas-document).
 */
public class OpenAPISpecification {
    /**
     * REQUIRED. This string MUST be the semantic version number of the OpenAPI Specification version that the OpenAPI
     * document uses. The openapi field SHOULD be used by tooling specifications and clients to interpret the OpenAPI
     * document. This is not related to the API info.version string.
     */
    private String openapi;

    /**
     * REQUIRED. Provides metadata about the API. The metadata MAY be used by tooling as required.
     */
    private Info info;

    /**
     * An array of Server Objects, which provide connectivity information to a target server. If the servers property
     * is not provided, or is an empty array, the default value would be a Server Object with a url value of /.
     */
    private Server[] servers;

    /**
     * REQUIRED. The available paths and operations for the API.
     */
    private Paths paths;

    /**
     * An element to hold various schemas for the specification.
     */
    private Components components;

    /**
     * A declaration of which security mechanisms can be used across the API. The list of values includes alternative
     * security requirement objects that can be used. Only one of the security requirement objects need to be satisfied
     * to authorize a request. Individual operations can override this definition. To make security optional, an empty
     * security requirement ({}) can be included in the array.
     */
    private SecurityRequirement[] security;

    /**
     * A list of tags used by the specification with additional metadata. The order of the tags can be used to reflect
     * on their order by the parsing tools. Not all tags that are used by the Operation Object must be declared. The
     * tags that are not declared MAY be organized randomly or based on the tools' logic. Each tag name in the list
     * MUST be unique.
     */
    private Tag[] tags;

    /**
     * Additional external documentation.
     */
    private ExternalDocumentation externalDocs;

    public String getOpenapi() {
        return openapi;
    }

    public void setOpenapi(String openapi) {
        this.openapi = openapi;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Server[] getServers() {
        return servers;
    }

    public void setServers(Server[] servers) {
        this.servers = servers;
    }

    public Paths getPaths() {
        return paths;
    }

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public SecurityRequirement[] getSecurity() {
        return security;
    }

    public void setSecurity(SecurityRequirement[] security) {
        this.security = security;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }
}
