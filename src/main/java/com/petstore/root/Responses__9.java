
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200",
    "405"
})
@Generated("jsonschema2pojo")
public class Responses__9 {

    @JsonProperty("200")
    private _200__7 _200;
    @JsonProperty("405")
    private _405__3 _405;

    @JsonProperty("200")
    public _200__7 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(_200__7 _200) {
        this._200 = _200;
    }

    @JsonProperty("405")
    public _405__3 get405() {
        return _405;
    }

    @JsonProperty("405")
    public void set405(_405__3 _405) {
        this._405 = _405;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses__9 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_200");
        sb.append('=');
        sb.append(((this._200 == null)?"<null>":this._200));
        sb.append(',');
        sb.append("_405");
        sb.append('=');
        sb.append(((this._405 == null)?"<null>":this._405));
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
        result = ((result* 31)+((this._405 == null)? 0 :this._405 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses__9) == false) {
            return false;
        }
        Responses__9 rhs = ((Responses__9) other);
        return (((this._200 == rhs._200)||((this._200 != null)&&this._200 .equals(rhs._200)))&&((this._405 == rhs._405)||((this._405 != null)&&this._405 .equals(rhs._405))));
    }

}
