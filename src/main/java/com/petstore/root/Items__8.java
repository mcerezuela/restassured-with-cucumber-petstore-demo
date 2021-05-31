
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$ref"
})
@Generated("jsonschema2pojo")
public class Items__8 {

    @JsonProperty("$ref")
    private String $ref;

    @JsonProperty("$ref")
    public String get$ref() {
        return $ref;
    }

    @JsonProperty("$ref")
    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Items__8 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$ref");
        sb.append('=');
        sb.append(((this.$ref == null)?"<null>":this.$ref));
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
        result = ((result* 31)+((this.$ref == null)? 0 :this.$ref.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Items__8) == false) {
            return false;
        }
        Items__8 rhs = ((Items__8) other);
        return ((this.$ref == rhs.$ref)||((this.$ref!= null)&&this.$ref.equals(rhs.$ref)));
    }

}
