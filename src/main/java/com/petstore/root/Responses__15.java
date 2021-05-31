
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "default"
})
@Generated("jsonschema2pojo")
public class Responses__15 {

    @JsonProperty("default")
    private Default__2 _default;

    @JsonProperty("default")
    public Default__2 getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Default__2 _default) {
        this._default = _default;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__15 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
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
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__15) == false) {
            return false;
        }
        Responses__15 rhs = ((Responses__15) other);
        return ((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default)));
    }

}
