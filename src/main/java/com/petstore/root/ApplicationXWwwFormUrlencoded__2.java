
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schema"
})
@Generated("jsonschema2pojo")
public class ApplicationXWwwFormUrlencoded__2 {

    @JsonProperty("schema")
    private Schema__27 schema;

    @JsonProperty("schema")
    public Schema__27 getSchema() {
        return schema;
    }

    @JsonProperty("schema")
    public void setSchema(Schema__27 schema) {
        this.schema = schema;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationXWwwFormUrlencoded__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationXWwwFormUrlencoded__2) == false) {
            return false;
        }
        ApplicationXWwwFormUrlencoded__2 rhs = ((ApplicationXWwwFormUrlencoded__2) other);
        return ((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)));
    }

}