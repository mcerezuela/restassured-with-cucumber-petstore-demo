
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "200",
    "400",
    "404",
    "405"
})
@Generated("jsonschema2pojo")
public class Responses {

    @JsonProperty("200")
    private com.petstore.service._200 _200;
    @JsonProperty("400")
    private com.petstore.service._400 _400;
    @JsonProperty("404")
    private com.petstore.service._404 _404;
    @JsonProperty("405")
    private com.petstore.service._405 _405;

    @JsonProperty("200")
    public com.petstore.service._200 get200() {
        return _200;
    }

    @JsonProperty("200")
    public void set200(com.petstore.service._200 _200) {
        this._200 = _200;
    }

    @JsonProperty("400")
    public com.petstore.service._400 get400() {
        return _400;
    }

    @JsonProperty("400")
    public void set400(com.petstore.service._400 _400) {
        this._400 = _400;
    }

    @JsonProperty("404")
    public com.petstore.service._404 get404() {
        return _404;
    }

    @JsonProperty("404")
    public void set404(com.petstore.service._404 _404) {
        this._404 = _404;
    }

    @JsonProperty("405")
    public com.petstore.service._405 get405() {
        return _405;
    }

    @JsonProperty("405")
    public void set405(com.petstore.service._405 _405) {
        this._405 = _405;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Responses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_200");
        sb.append('=');
        sb.append(((this._200 == null)?"<null>":this._200));
        sb.append(',');
        sb.append("_400");
        sb.append('=');
        sb.append(((this._400 == null)?"<null>":this._400));
        sb.append(',');
        sb.append("_404");
        sb.append('=');
        sb.append(((this._404 == null)?"<null>":this._404));
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
        result = ((result* 31)+((this._404 == null)? 0 :this._404 .hashCode()));
        result = ((result* 31)+((this._400 == null)? 0 :this._400 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Responses) == false) {
            return false;
        }
        Responses rhs = ((Responses) other);
        return (((((this._200 == rhs._200)||((this._200 != null)&&this._200 .equals(rhs._200)))&&((this._405 == rhs._405)||((this._405 != null)&&this._405 .equals(rhs._405))))&&((this._404 == rhs._404)||((this._404 != null)&&this._404 .equals(rhs._404))))&&((this._400 == rhs._400)||((this._400 != null)&&this._400 .equals(rhs._400))));
    }

}
