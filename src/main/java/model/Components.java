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
}
