package model;

import java.util.Map;

/**
 * Describes a single API operation on a path.
 */
public class Operation {
    /**
     * A list of tags for API documentation control. Tags can be used for logical grouping of operations by resources
     * or any other qualifier.
     */
    private String[] tags;

    /**
     * A short summary of what the operation does.
     */
    private String summary;

    /**
     * A verbose explanation of the operation behavior. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * Additional external documentation for this operation.
     */
    private ExternalDocumentation externalDocs;

    /**
     * Unique string used to identify the operation. The id MUST be unique among all operations described in the API.
     * The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely identify an
     * operation, therefore, it is RECOMMENDED to follow common programming naming conventions.
     */
    private String operationId;

    /**
     * A list of parameters that are applicable for this operation. If a parameter is already defined at the Path Item,
     * the new definition will override it but can never remove it. The list MUST NOT include duplicated parameters.
     * A unique parameter is defined by a combination of a name and location. The list can use the Reference Object to
     * link to parameters that are defined at the OpenAPI Object's components/parameters.
     */
    private  IReferenceable<Parameter>[] parameters;

    /**
     * The request body applicable for this operation. The requestBody is only supported in HTTP methods where the
     * HTTP 1.1 specification RFC7231 has explicitly defined semantics for request bodies. In other cases where the
     * HTTP spec is vague, requestBody SHALL be ignored by consumers.
     */
    private  IReferenceable<RequestBody> requestBody;

    /**
     * REQUIRED. The list of possible responses as they are returned from executing this operation.
     */
    private Responses responses;

    /**
     * A map of possible out-of band callbacks related to the parent operation. The key is a unique identifier for
     * the Callback Object. Each value in the map is a Callback Object that describes a request that may be initiated
     * by the API provider and the expected responses.
     */
    private Map<String, IReferenceable<Callback>> callbacks;

    /**
     * Declares this operation to be deprecated. Consumers SHOULD refrain from usage of the declared operation.
     * Default value is false.
     */
    private Boolean deprecated;

    /**
     * A declaration of which security mechanisms can be used for this operation. The list of values includes
     * alternative security requirement objects that can be used. Only one of the security requirement objects need
     * to be satisfied to authorize a request. To make security optional, an empty security requirement ({}) can be
     * included in the array. This definition overrides any declared top-level security. To remove a top-level
     * security declaration, an empty array can be used.
     */
    private SecurityRequirement[] security;

    /**
     * An alternative server array to service this operation. If an alternative server object is specified at the
     * Path Item Object or Root level, it will be overridden by this value.
     */
    private Server[] servers;

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public  IReferenceable<Parameter>[] getParameters() {
        return parameters;
    }

    public void setParameters( IReferenceable<Parameter>[] parameters) {
        this.parameters = parameters;
    }

    public  IReferenceable<RequestBody> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody( IReferenceable<RequestBody> requestBody) {
        this.requestBody = requestBody;
    }

    public Responses getResponses() {
        return responses;
    }

    public void setResponses(Responses responses) {
        this.responses = responses;
    }

    public Map<String, IReferenceable<Callback>> getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(Map<String, IReferenceable<Callback>> callbacks) {
        this.callbacks = callbacks;
    }

    public Boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public SecurityRequirement[] getSecurity() {
        return security;
    }

    public void setSecurity(SecurityRequirement[] security) {
        this.security = security;
    }

    public Server[] getServers() {
        return servers;
    }

    public void setServers(Server[] servers) {
        this.servers = servers;
    }
}
