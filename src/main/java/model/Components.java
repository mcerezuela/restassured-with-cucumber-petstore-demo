package model;

import java.util.Map;

public class Components {
    /**
     * An object to hold reusable Schema Objects.
     */
    private Map<String, Schema> schemas;

    /**
     * An object to hold reusable Response Objects.
     */
    private Map<String, Response> responses;

    /**
     * An object to hold reusable Parameter Objects.
     */
    private Map<String, Parameter> parameters;

    /**
     * An object to hold reusable Example Objects.
     */
    private Map<String, Example> examples;

    /**
     * An object to hold reusable Request Body Objects.
     */
    private Map<String, RequestBody> requestBodies;

    /**
     * An object to hold reusable Header Objects.
     */
    private Map<String, Header> headers;

    /**
     * An object to hold reusable Security Scheme Objects.
     */
    private Map<String, SecurityScheme> securitySchemes;

    /**
     * An object to hold reusable Link Objects.
     */
    private Map<String, Link> links;

    /**
     * An object to hold reusable Callback Objects.
     */
    private Map<String, Callback> callbacks;

    public Map<String, Schema> getSchemas() {
        return schemas;
    }

    public void setSchemas(Map<String, Schema> schemas) {
        this.schemas = schemas;
    }

    public Map<String, Response> getResponses() {
        return responses;
    }

    public void setResponses(Map<String, Response> responses) {
        this.responses = responses;
    }

    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Map<String, Example> getExamples() {
        return examples;
    }

    public void setExamples(Map<String, Example> examples) {
        this.examples = examples;
    }

    public Map<String, RequestBody> getRequestBodies() {
        return requestBodies;
    }

    public void setRequestBodies(Map<String, RequestBody> requestBodies) {
        this.requestBodies = requestBodies;
    }

    public Map<String, Header> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Header> headers) {
        this.headers = headers;
    }

    public Map<String, SecurityScheme> getSecuritySchemes() {
        return securitySchemes;
    }

    public void setSecuritySchemes(Map<String, SecurityScheme> securitySchemes) {
        this.securitySchemes = securitySchemes;
    }

    public Map<String, Link> getLinks() {
        return links;
    }

    public void setLinks(Map<String, Link> links) {
        this.links = links;
    }

    public Map<String, Callback> getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(Map<String, Callback> callbacks) {
        this.callbacks = callbacks;
    }
}
