package model;

import java.util.Map;

/**
 * A map of possible out-of band callbacks related to the parent operation. Each value in the map is a
 * Path Item Object that describes a set of requests that may be initiated by the API provider and the expected
 * responses. The key value used to identify the path item object is an expression, evaluated at runtime, that
 * identifies a URL to use for the callback operation.
 */
public class Callback extends ReferenceableObject<Callback> {
    /**
     * A Path Item Object used to define a callback request and expected responses. A complete example is available.
     */
    private Map<String, PathItem> pathMap;

    public Map<String, PathItem> getPathMap() {
        return pathMap;
    }

    public void setPathMap(Map<String, PathItem> pathMap) {
        this.pathMap = pathMap;
    }
}
