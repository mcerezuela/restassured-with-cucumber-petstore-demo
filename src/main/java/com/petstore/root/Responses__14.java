
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200",
    "400"
})
@Generated("jsonschema2pojo")
public class Responses__14 {

    @JsonProperty("200")
    private _200__10 _200;
    @JsonProperty("400")
    private _400__7 _400;

    @JsonProperty("200")
    public _200__10 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200__10 _200) {
        this._200 = _200;
    }

    @JsonProperty("400")
    public _400__7 get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(_400__7 _400) {
        this._400 = _400;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__14 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_200");
        sb.append('=');
        sb.append(((this._200 == null)?"<null>":this._200));
        sb.append(',');
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
        result = ((result* 31)+((this._200 == null)? 0 :this._200 .hashCode()));
        result = ((result* 31)+((this._400 == null)? 0 :this._400 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__14) == false) {
            return false;
        }
        Responses__14 rhs = ((Responses__14) other);
        return (((this._200 == rhs._200)||((this._200 != null)&&this._200 .equals(rhs._200)))&&((this._400 == rhs._400)||((this._400 != null)&&this._400 .equals(rhs._400))));
    }

}
