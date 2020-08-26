package model;

import java.util.Map;

/**
 * Describes a single request body.
 */
public class Request {
    /**
     * A brief description of the request body. This could contain examples of use. CommonMark syntax MAY be used for
     * rich text representation.
     */
    private String description;

    /**
     * REQUIRED. The content of the request body. The key is a media type or media type range and the value describes
     * it. For requests that match multiple keys, only the most specific key is applicable.
     * e.g. text/plain overrides text/*
     */
    private Map<String, MediaType> content;

    /**
     * Determines if the request body is required in the request. Defaults to false.
     */
    private boolean required;
}
