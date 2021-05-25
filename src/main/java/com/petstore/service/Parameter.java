
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "in",
    "description",
    "required",
    "explode",
    "schema"
})
@Generated("jsonschema2pojo")
public class Parameter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("in")
    private String in;
    @JsonProperty("description")
    private String description;
    @JsonProperty("required")
    private Boolean required;
    @JsonProperty("explode")
    private Boolean explode;
    @JsonProperty("schema")
    private Schema__10 schema;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("in")
    public String getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(String in) {
        this.in = in;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    @JsonProperty("explode")
    public Boolean getExplode() {
        return explode;
    }

    @JsonProperty("explode")
    public void setExplode(Boolean explode) {
        this.explode = explode;
    }

    @JsonProperty("schema")
    public Schema__10 getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(Schema__10 schema) {
        this.schema = schema;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("in");
        sb.append('=');
        sb.append(((this.in == null)?"<null>":this.in));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("explode");
        sb.append('=');
        sb.append(((this.explode == null)?"<null>":this.explode));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.schema == null)? 0 :this.schema.hashCode()));
        result = ((result* 31)+((this.in == null)? 0 :this.in.hashCode()));
        result = ((result* 31)+((this.explode == null)? 0 :this.explode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameter) == false) {
            return false;
        }
        Parameter rhs = ((Parameter) other);
        return (((((((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)))&&((this.in == rhs.in)||((this.in!= null)&&this.in.equals(rhs.in))))&&((this.explode == rhs.explode)||((this.explode!= null)&&this.explode.equals(rhs.explode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))));
    }

}
