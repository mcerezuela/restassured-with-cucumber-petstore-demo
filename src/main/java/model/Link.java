package model;

import java.util.Map;

/**
 * The Link object represents a possible design-time link for a response. The presence of a link does not guarantee
 * the caller's ability to successfully invoke it, rather it provides a known relationship and traversal mechanism
 * between responses and other operations.
 *
 * Unlike dynamic links (i.e. links provided in the response payload), the OAS linking mechanism does not require
 * link information in the runtime response.
 *
 * For computing links, and providing instructions to execute them, a runtime expression is used for accessing values
 * in an operation and using them as parameters while invoking the linked operation.
 */
public class Link extends ReferenceableObject<Link> {
    /**
     * A relative or absolute URI reference to an OAS operation. This field is mutually exclusive of the operationId
     * field, and MUST point to an Operation Object. Relative operationRef values MAY be used to locate an existing
     * Operation Object in the OpenAPI definition.
     */
    private String operationRef;

    /**
     * The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually
     * exclusive of the operationRef field.
     */
    private String operationId;

    /**
     * A map representing parameters to pass to an operation as specified with operationId or identified via
     * operationRef. The key is the parameter name to be used, whereas the value can be a constant or an expression
     * to be evaluated and passed to the linked operation. The parameter name can be qualified using the parameter
     * location [{in}.]{name} for operations that use the same parameter name in different locations (e.g. path.id).
     */
    private Map<String, Object> parameters;

    /**
     * A literal value or {expression} to use as a request body when calling the target operation.
     */
    private Object requestBody;

    /**
     * A description of the link. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * A server object to be used by the target operation.
     */
    private Server server;

    public String getOperationRef() {
        return operationRef;
    }

    public void setOperationRef(String operationRef) {
        this.operationRef = operationRef;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Object getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}
