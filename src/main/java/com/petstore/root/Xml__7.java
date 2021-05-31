
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wrapped"
})
@Generated("jsonschema2pojo")
public class Xml__7 {

    @JsonProperty("wrapped")
    private Boolean wrapped;

    @JsonProperty("wrapped")
    public Boolean getWrapped() {
        return wrapped;
    }

    @JsonProperty("wrapped")
    public void setWrapped(Boolean wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Xml__7 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wrapped");
        sb.append('=');
        sb.append(((this.wrapped == null)?"<null>":this.wrapped));
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
        result = ((result* 31)+((this.wrapped == null)? 0 :this.wrapped.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Xml__7) == false) {
            return false;
        }
        Xml__7 rhs = ((Xml__7) other);
        return ((this.wrapped == rhs.wrapped)||((this.wrapped!= null)&&this.wrapped.equals(rhs.wrapped)));
    }

}
