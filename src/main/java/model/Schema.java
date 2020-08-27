package model;

import javax.naming.Referenceable;

/**
 * The Schema Object allows the definition of input and output data types. These types can be objects, but also
 * primitives and arrays. This object is an extended subset of the JSON Schema Specification Wright Draft 00.
 *
 * For more information about the properties, see JSON Schema Core and JSON Schema Validation. Unless stated otherwise,
 * the property definitions follow the JSON Schema.
 */
public class Schema implements IReferenceable<Schema> {
    /*
     The following properties are taken directly from the JSON Schema definition and follow the same specifications:
     (https://tools.ietf.org/html/draft-wright-json-schema-validation-00)
     */
    private String title;
    private int multipleOf;
    private int maximum;
    private boolean exclusiveMaximum;
    private int minimum;
    private boolean exclusiveMinimum;
    private int maxLength;
    private int minLength;
    private String pattern;
    private int maxItems;
    private int minItems;
    private boolean uniqueItems;
    private int maxProperties;
    private int minProperties;
    private String[] required;
    private String[] _enum;

    /*
    The following properties are taken from the JSON Schema definition but their definitions were adjusted to the
    OpenAPI Specification.
     */
    /**
     * Value MUST be a string. Multiple types via an array are not supported.
     */
    private String type;

    /**
     * Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
     */
    private Schema[] allOf;

    /**
     * Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
     */
    private Schema[] oneOf;

    /**
     * Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
     */
    private Schema[] anyOf;

    /**
     * Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.
     */
    private Schema not;

    /**
     * Value MUST be an object and not an array. Inline or referenced schema MUST be of a Schema Object and not a
     * standard JSON Schema. items MUST be present if the type is array.
     */
    private Schema items;

    /**
     * Property definitions MUST be a Schema Object and not a standard JSON Schema (inline or referenced).
     */
    private Schema properties;

    /**
     * Value can be boolean or object. Inline or referenced schema MUST be of a Schema Object and not a standard JSON
     * Schema. Consistent with JSON Schema, additionalProperties defaults to true.
     */
    private Schema additionalProperties;

    /**
     * CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    /**
     * See Data Type Formats for further details. While relying on JSON Schema's defined formats, the OAS offers a few
     * additional predefined formats.
     */
    private String format;

    /**
     * The default value represents what would be assumed by the consumer of the input as the value of the schema if
     * one is not provided. Unlike JSON Schema, the value MUST conform to the defined type for the Schema Object
     * defined at the same level. For example, if type is string, then default can be "foo" but cannot be 1.
     */
    private Object _default;

    // Other than the JSON Schema subset fields, the following fields MAY be used for further schema documentation

    /**
     * A true value adds "null" to the allowed type specified by the type keyword, only if type is explicitly defined
     * within the same Schema Object. Other Schema Object constraints retain their defined behavior, and therefore may
     * disallow the use of null as a value. A false value leaves the specified or default type unmodified. The default
     * value is false.
     */
    private boolean nullable;

    /**
     * Adds support for polymorphism. The discriminator is an object name that is used to differentiate between other
     * schemas which may satisfy the payload description. See Composition and Inheritance for more details.
     */
    private Discriminator discriminator;

    /**
     * Relevant only for Schema "properties" definitions. Declares the property as "read only". This means that it
     * MAY be sent as part of a response but SHOULD NOT be sent as part of the request. If the property is marked as
     * readOnly being true and is in the required list, the required will take effect on the response only. A property
     * MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
     */
    private boolean readOnly;

    /**
     * Relevant only for Schema "properties" definitions. Declares the property as "write only". Therefore, it MAY
     * be sent as part of a request but SHOULD NOT be sent as part of the response. If the property is marked as
     * writeOnly being true and is in the required list, the required will take effect on the request only. A property
     * MUST NOT be marked as both readOnly and writeOnly being true. Default value is false.
     */
    private boolean writeOnly;

    /**
     * This MAY be used only on properties schemas. It has no effect on root schemas. Adds additional metadata to
     * describe the XML representation of this property.
     */
    private XML xml;

    /**
     * Additional external documentation for this schema.
     */
    private ExternalDocumentation externalDocs;

    /**
     * A free-form property to include an example of an instance for this schema. To represent examples that cannot
     * be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where
     * necessary.
     */
    private Object example;

    /**
     * Specifies that a schema is deprecated and SHOULD be transitioned out of usage. Default value is false.
     */
    private boolean deprecated;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMultipleOf() {
        return multipleOf;
    }

    public void setMultipleOf(int multipleOf) {
        this.multipleOf = multipleOf;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public boolean isExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public boolean isExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public int getMinItems() {
        return minItems;
    }

    public void setMinItems(int minItems) {
        this.minItems = minItems;
    }

    public boolean isUniqueItems() {
        return uniqueItems;
    }

    public void setUniqueItems(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    public int getMaxProperties() {
        return maxProperties;
    }

    public void setMaxProperties(int maxProperties) {
        this.maxProperties = maxProperties;
    }

    public int getMinProperties() {
        return minProperties;
    }

    public void setMinProperties(int minProperties) {
        this.minProperties = minProperties;
    }

    public String[] getRequired() {
        return required;
    }

    public void setRequired(String[] required) {
        this.required = required;
    }

    public String[] getEnum() {
        return _enum;
    }

    public void setEnum(String[] _enum) {
        this._enum = _enum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Schema[] getAllOf() {
        return allOf;
    }

    public void setAllOf(Schema[] allOf) {
        this.allOf = allOf;
    }

    public Schema[] getOneOf() {
        return oneOf;
    }

    public void setOneOf(Schema[] oneOf) {
        this.oneOf = oneOf;
    }

    public Schema[] getAnyOf() {
        return anyOf;
    }

    public void setAnyOf(Schema[] anyOf) {
        this.anyOf = anyOf;
    }

    public Schema getNot() {
        return not;
    }

    public void setNot(Schema not) {
        this.not = not;
    }

    public Schema getItems() {
        return items;
    }

    public void setItems(Schema items) {
        this.items = items;
    }

    public Schema getProperties() {
        return properties;
    }

    public void setProperties(Schema properties) {
        this.properties = properties;
    }

    public Schema getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Schema additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public Discriminator getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(Discriminator discriminator) {
        this.discriminator = discriminator;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isWriteOnly() {
        return writeOnly;
    }

    public void setWriteOnly(boolean writeOnly) {
        this.writeOnly = writeOnly;
    }

    public XML getXml() {
        return xml;
    }

    public void setXml(XML xml) {
        this.xml = xml;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public Object getExample() {
        return example;
    }

    public void setExample(Object example) {
        this.example = example;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Schema getReferencedObject() {
        return this;
    }
}
