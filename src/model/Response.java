package model;

import java.util.Map;

/**
 * Describes a single response from an API Operation, including design-time, static links to operations based on
 * the response.
 */
public class Response {
    /**
     * REQUIRED. A short description of the response. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * Maps a header name to its definition. RFC7230 states header names are case insensitive. If a response header is
     * defined with the name "Content-Type", it SHALL be ignored.
     */
    private Map<String, Header> headers;

    /**
     * A map containing descriptions of potential response payloads. The key is a media type or media type range and
     * the value describes it. For responses that match multiple keys, only the most specific key is applicable.
     * e.g. text/plain overrides text/*
     */
    private Map<String, MediaType> content;

    /**
     * A map of operations links that can be followed from the response. The key of the map is a short name for the
     * link, following the naming constraints of the names for Component Objects.
     */
    private Map<String, Link> links;
}
