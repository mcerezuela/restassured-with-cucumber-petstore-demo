
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200"
})
@Generated("jsonschema2pojo")
public class Responses__7 {

    @JsonProperty("200")
    private _200__5 _200;

    @JsonProperty("200")
    public _200__5 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200__5 _200) {
        this._200 = _200;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__7 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_200");
        sb.append('=');
        sb.append(((this._200 == null)?"<null>":this._200));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__7) == false) {
            return false;
        }
        Responses__7 rhs = ((Responses__7) other);
        return ((this._200 == rhs._200)||((this._200 != null)&&this._200 .equals(rhs._200)));
    }

}
