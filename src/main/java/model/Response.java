package model;

import java.util.Map;

/**
 * Describes a single response from an API Operation, including design-time, static links to operations based on
 * the response.
 */
public class Response extends ReferenceableObject<Response>{
    /**
     * REQUIRED. A short description of the response. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * Maps a header name to its definition. RFC7230 states header names are case insensitive. If a response header is
     * defined with the name "Content-Type", it SHALL be ignored.
     */
    private Map<String, IReferenceable<Header>> headers;

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
    private Map<String, IReferenceable<Link>> links;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, IReferenceable<Header>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, IReferenceable<Header>> headers) {
        this.headers = headers;
    }

    public Map<String, MediaType> getContent() {
        return content;
    }

    public void setContent(Map<String, MediaType> content) {
        this.content = content;
    }

    public Map<String, IReferenceable<Link>> getLinks() {
        return links;
    }

    public void setLinks(Map<String, IReferenceable<Link>> links) {
        this.links = links;
    }
}
