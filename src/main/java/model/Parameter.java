package model;

import java.util.Map;

public class Parameter extends ReferenceableObject<Parameter> {
    /**
     * REQUIRED. The name of the parameter. Parameter names are case sensitive.
     *
     * If in is "path", the name field MUST correspond to a template expression occurring within the path field in the
     * Paths Object. See Path Templating for further information.
     *
     * If in is "header" and the name field is "Accept", "Content-Type" or "Authorization", the parameter definition
     * SHALL be ignored.
     *
     * For all other cases, the name corresponds to the parameter name used by the in property.
     */
    private String name;

    /**
     * REQUIRED. The location of the parameter. Possible values are "query", "header", "path" or "cookie".
     */
    private String in;

    /**
     * A brief description of the parameter. This could contain examples of use. CommonMark syntax MAY be used for
     * rich text representation.
     */
    private String description;

    /**
     * Determines whether this parameter is mandatory. If the parameter location is "path", this property is REQUIRED
     * and its value MUST be true. Otherwise, the property MAY be included and its default value is false.
     */
    private Boolean required;

    /**
     * Specifies that a parameter is deprecated and SHOULD be transitioned out of usage. Default value is false.
     */
    private Boolean deprecated;

    /**
     * Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a
     * parameter with an empty value. Default value is false. If style is used, and if behavior is n/a (cannot be
     * serialized), the value of allowEmptyValue SHALL be ignored. Use of this property is NOT RECOMMENDED, as it is
     * likely to be removed in a later revision.
     */
    private Boolean allowEmptyValue;

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
    private Boolean explode;

    /**
     * Determines whether the parameter value SHOULD allow reserved characters, as defined by
     * RFC3986 :/?#[]@!$&'()*+,;= to be included without percent-encoding. This property only applies to parameters
     * with an in value of query. The default value is false.
     */
    private Boolean allowReserved;

    /**
     * The schema defining the type used for the parameter.
     */
    private IReferenceable<Schema> schema;

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
    private Map<String, IReferenceable<Example>> examples;

    /**
     * A map containing the representations for the parameter. The key is the media type and the value describes it.
     * The map MUST only contain one entry.
     */
    private Map<String, MediaType> content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Boolean isAllowEmptyValue() {
        return allowEmptyValue;
    }

    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Boolean isExplode() {
        return explode;
    }

    public void setExplode(Boolean explode) {
        this.explode = explode;
    }

    public Boolean isAllowReserved() {
        return allowReserved;
    }

    public void setAllowReserved(Boolean allowReserved) {
        this.allowReserved = allowReserved;
    }

    public IReferenceable<Schema> getSchema() {
        return schema;
    }

    public void setSchema(IReferenceable<Schema> schema) {
        this.schema = schema;
    }

    public Object getExample() {
        return example;
    }

    public void setExample(Object example) {
        this.example = example;
    }

    public Map<String, IReferenceable<Example>> getExamples() {
        return examples;
    }

    public void setExamples(Map<String, IReferenceable<Example>> examples) {
        this.examples = examples;
    }

    public Map<String, MediaType> getContent() {
        return content;
    }

    public void setContent(Map<String, MediaType> content) {
        this.content = content;
    }
}
