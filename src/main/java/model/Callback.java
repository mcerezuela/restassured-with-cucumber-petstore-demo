package model;

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
    private PathItem pathItem;

    /**
     *
     */
    private String expression;

    public PathItem getPathItem() {
        return pathItem;
    }

    public void setPathItem(PathItem pathItem) {
        this.pathItem = pathItem;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
