package model;

import java.util.Map;

public class Parameter {
    /**
     * Describes how the parameter value will be serialized depending on the type of the parameter value. Default
     * values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form.
     */
    private String style;

    /**
     * When this is true, parameter values of type array or object generate separate parameters for each value of
     * the array or key-value pair of the map. For other types of parameters this property has no effect. When style
     * is form, the default value is true. For all other styles, the default value is false.
     */
    private boolean explode;

    /**
     * Determines whether the parameter value SHOULD allow reserved characters, as defined by
     * RFC3986 :/?#[]@!$&'()*+,;= to be included without percent-encoding. This property only applies to parameters
     * with an in value of query. The default value is false.
     */
    private boolean allowReserved;

    /**
     * The schema defining the type used for the parameter.
     */
    private Schema schema;

    /**
     * Example of the parameter's potential value. The example SHOULD match the specified schema and encoding
     * properties if present. The example field is mutually exclusive of the examples field. Furthermore, if
     * referencing a schema that contains an example, the example value SHALL override the example provided by
     * the schema. To represent examples of media types that cannot naturally be represented in JSON or YAML, a
     * string value can contain the example with escaping where necessary.
     */
    private Object example;

    /**
     * Examples of the parameter's potential value. Each example SHOULD contain a value in the correct format as
     * specified in the parameter encoding. The examples field is mutually exclusive of the example field.
     * Furthermore, if referencing a schema that contains an example, the examples value SHALL override the example
     * provided by the schema.
     */
    private Map<String, Example> examples;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isExplode() {
        return explode;
    }

    public void setExplode(boolean explode) {
        this.explode = explode;
    }

    public boolean isAllowReserved() {
        return allowReserved;
    }

    public void setAllowReserved(boolean allowReserved) {
        this.allowReserved = allowReserved;
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Object getExample() {
        return example;
    }

    public void setExample(Object example) {
        this.example = example;
    }

    public Map<String, Example> getExamples() {
        return examples;
    }

    public void setExamples(Map<String, Example> examples) {
        this.examples = examples;
    }
}
