
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application/json",
    "application/xml",
    "application/x-www-form-urlencoded"
})
@Generated("jsonschema2pojo")
public class Content__10 {

    @JsonProperty("application/json")
    private ApplicationJson__9 applicationJson;
    @JsonProperty("application/xml")
    private ApplicationXml__7 applicationXml;
    @JsonProperty("application/x-www-form-urlencoded")
    private ApplicationXWwwFormUrlencoded__2 applicationXWwwFormUrlencoded;

    @JsonProperty("application/json")
    public ApplicationJson__9 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__9 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @JsonProperty("application/xml")
    public ApplicationXml__7 getApplicationXml() {
        return applicationXml;
    }

    @JsonProperty("application/xml")
    public void setApplicationXml(ApplicationXml__7 applicationXml) {
        this.applicationXml = applicationXml;
    }

    @JsonProperty("application/x-www-form-urlencoded")
    public ApplicationXWwwFormUrlencoded__2 getApplicationXWwwFormUrlencoded() {
        return applicationXWwwFormUrlencoded;
    }

    @JsonProperty("application/x-www-form-urlencoded")
    public void setApplicationXWwwFormUrlencoded(ApplicationXWwwFormUrlencoded__2 applicationXWwwFormUrlencoded) {
        this.applicationXWwwFormUrlencoded = applicationXWwwFormUrlencoded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__10 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationJson");
        sb.append('=');
        sb.append(((this.applicationJson == null)?"<null>":this.applicationJson));
        sb.append(',');
        sb.append("applicationXml");
        sb.append('=');
        sb.append(((this.applicationXml == null)?"<null>":this.applicationXml));
        sb.append(',');
        sb.append("applicationXWwwFormUrlencoded");
        sb.append('=');
        sb.append(((this.applicationXWwwFormUrlencoded == null)?"<null>":this.applicationXWwwFormUrlencoded));
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
        result = ((result* 31)+((this.applicationXml == null)? 0 :this.applicationXml.hashCode()));
        result = ((result* 31)+((this.applicationJson == null)? 0 :this.applicationJson.hashCode()));
        result = ((result* 31)+((this.applicationXWwwFormUrlencoded == null)? 0 :this.applicationXWwwFormUrlencoded.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content__10) == false) {
            return false;
        }
        Content__10 rhs = ((Content__10) other);
        return ((((this.applicationXml == rhs.applicationXml)||((this.applicationXml!= null)&&this.applicationXml.equals(rhs.applicationXml)))&&((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson))))&&((this.applicationXWwwFormUrlencoded == rhs.applicationXWwwFormUrlencoded)||((this.applicationXWwwFormUrlencoded!= null)&&this.applicationXWwwFormUrlencoded.equals(rhs.applicationXWwwFormUrlencoded))));
    }

}
