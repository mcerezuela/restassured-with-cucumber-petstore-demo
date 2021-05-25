
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "implicit"
})
@Generated("jsonschema2pojo")
public class Flows {

    @JsonProperty("implicit")
    private Implicit implicit;

    @JsonProperty("implicit")
    public Implicit getImplicit() {
        return implicit;
    }

    @JsonProperty("implicit")
    public void setImplicit(Implicit implicit) {
        this.implicit = implicit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Flows.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("implicit");
        sb.append('=');
        sb.append(((this.implicit == null)?"<null>":this.implicit));
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
        result = ((result* 31)+((this.implicit == null)? 0 :this.implicit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flows) == false) {
            return false;
        }
        Flows rhs = ((Flows) other);
        return ((this.implicit == rhs.implicit)||((this.implicit!= null)&&this.implicit.equals(rhs.implicit)));
    }

}
