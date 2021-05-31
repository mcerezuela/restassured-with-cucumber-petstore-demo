
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200",
    "default"
})
@Generated("jsonschema2pojo")
public class Responses__13 {

    @JsonProperty("200")
    private _200__9 _200;
    @JsonProperty("default")
    private Default__1 _default;

    @JsonProperty("200")
    public _200__9 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200__9 _200) {
        this._200 = _200;
    }

    @JsonProperty("default")
    public Default__1 getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Default__1 _default) {
        this._default = _default;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__13 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_200");
        sb.append('=');
        sb.append(((this._200 == null)?"<null>":this._200));
        sb.append(',');
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
        result = ((result* 31)+((this._200 == null)? 0 :this._200 .hashCode()));
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__13) == false) {
            return false;
        }
        Responses__13 rhs = ((Responses__13) other);
        return (((this._200 == rhs._200)||((this._200 != null)&&this._200 .equals(rhs._200)))&&((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default))));
    }

}
