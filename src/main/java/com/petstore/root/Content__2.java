
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
public class Content__2 {

    @JsonProperty("application/json")
    private ApplicationJson__2 applicationJson;
    @JsonProperty("application/xml")
    private ApplicationXml__2 applicationXml;
    @JsonProperty("application/x-www-form-urlencoded")
    private ApplicationXWwwFormUrlencoded__1 applicationXWwwFormUrlencoded;

    @JsonProperty("application/json")
    public ApplicationJson__2 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__2 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @JsonProperty("application/xml")
    public ApplicationXml__2 getApplicationXml() {
        return applicationXml;
    }

    @JsonProperty("application/xml")
    public void setApplicationXml(ApplicationXml__2 applicationXml) {
        this.applicationXml = applicationXml;
    }

    @JsonProperty("application/x-www-form-urlencoded")
    public ApplicationXWwwFormUrlencoded__1 getApplicationXWwwFormUrlencoded() {
        return applicationXWwwFormUrlencoded;
    }

    @JsonProperty("application/x-www-form-urlencoded")
    public void setApplicationXWwwFormUrlencoded(ApplicationXWwwFormUrlencoded__1 applicationXWwwFormUrlencoded) {
        this.applicationXWwwFormUrlencoded = applicationXWwwFormUrlencoded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Content__2) == false) {
            return false;
        }
        Content__2 rhs = ((Content__2) other);
        return ((((this.applicationXml == rhs.applicationXml)||((this.applicationXml!= null)&&this.applicationXml.equals(rhs.applicationXml)))&&((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson))))&&((this.applicationXWwwFormUrlencoded == rhs.applicationXWwwFormUrlencoded)||((this.applicationXWwwFormUrlencoded!= null)&&this.applicationXWwwFormUrlencoded.equals(rhs.applicationXWwwFormUrlencoded))));
    }

}