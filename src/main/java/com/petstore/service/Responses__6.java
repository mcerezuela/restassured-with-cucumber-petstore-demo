
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "400"
})
@Generated("jsonschema2pojo")
public class Responses__6 {

    @JsonProperty("400")
    private _400__4 _400;

    @JsonProperty("400")
    public _400__4 get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400__4 _400) {
        this._400 = _400;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_400");
        sb.append('=');
        sb.append(((this._400 == null)?"<null>":this._400));
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
        result = ((result* 31)+((this._400 == null)? 0 :this._400 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__6) == false) {
            return false;
        }
        Responses__6 rhs = ((Responses__6) other);
        return ((this._400 == rhs._400)||((this._400 != null)&&this._400 .equals(rhs._400)));
    }

}