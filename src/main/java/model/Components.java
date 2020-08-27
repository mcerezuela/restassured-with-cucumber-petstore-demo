package model;

import java.util.Map;

public class Components {
    /**
     * An object to hold reusable Schema Objects.
     */
    private Map<String, IReferenceable<Schema>> schemas;

    /**
     * An object to hold reusable Response Objects.
     */
    private Map<String, IReferenceable<Response>> responses;

    /**
     * An object to hold reusable Parameter Objects.
     */
    private Map<String, IReferenceable<Parameter>> parameters;

    /**
     * An object to hold reusable Example Objects.
     */
    private Map<String, IReferenceable<Example>> examples;

    /**
     * An object to hold reusable Request Body Objects.
     */
    private Map<String, IReferenceable<RequestBody>> requestBodies;

    /**
     * An object to hold reusable Header Objects.
     */
    private Map<String, IReferenceable<Header>> headers;

    /**
     * An object to hold reusable Security Scheme Objects.
     */
    private Map<String, IReferenceable<SecurityScheme>> securitySchemes;

    /**
     * An object to hold reusable Link Objects.
     */
    private Map<String, IReferenceable<Link>> links;

    /**
     * An object to hold reusable Callback Objects.
     */
    private Map<String, IReferenceable<Callback>> callbacks;

    public Map<String, IReferenceable<Schema>> getSchemas() {
        return schemas;
    }

    public void setSchemas(Map<String, IReferenceable<Schema>> schemas) {
        this.schemas = schemas;
    }

    public Map<String, IReferenceable<Response>> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, IReferenceable<Response>> responses) {
        this.responses = responses;
    }

    public Map<String, IReferenceable<Parameter>> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, IReferenceable<Parameter>> parameters) {
        this.parameters = parameters;
    }

    public Map<String, IReferenceable<Example>> getExamples() {
        return examples;
    }

    public void setExamples(Map<String, IReferenceable<Example>> examples) {
        this.examples = examples;
    }

    public Map<String, IReferenceable<RequestBody>> getRequestBodies() {
        return requestBodies;
    }

    public void setRequestBodies(Map<String, IReferenceable<RequestBody>> requestBodies) {
        this.requestBodies = requestBodies;
    }

    public Map<String, IReferenceable<Header>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, IReferenceable<Header>> headers) {
        this.headers = headers;
    }

    public Map<String, IReferenceable<SecurityScheme>> getSecuritySchemes() {
        return securitySchemes;
    }

    public void setSecuritySchemes(Map<String, IReferenceable<SecurityScheme>> securitySchemes) {
        this.securitySchemes = securitySchemes;
    }

    public Map<String, IReferenceable<Link>> getLinks() {
        return links;
    }

    public void setLinks(Map<String, IReferenceable<Link>> links) {
        this.links = links;
    }

    public Map<String, IReferenceable<Callback>> getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(Map<String, IReferenceable<Callback>> callbacks) {
        this.callbacks = callbacks;
    }
}
