
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application/xml",
    "application/json"
})
@Generated("jsonschema2pojo")
public class Content__1 {

    @JsonProperty("application/xml")
    private ApplicationXml__1 applicationXml;
    @JsonProperty("application/json")
    private ApplicationJson__1 applicationJson;

    @JsonProperty("application/xml")
    public ApplicationXml__1 getApplicationXml() {
        return applicationXml;
    }

    @JsonProperty("application/xml")
    public void setApplicationXml(ApplicationXml__1 applicationXml) {
        this.applicationXml = applicationXml;
    }

    @JsonProperty("application/json")
    public ApplicationJson__1 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__1 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationXml");
        sb.append('=');
        sb.append(((this.applicationXml == null)?"<null>":this.applicationXml));
        sb.append(',');
        sb.append("applicationJson");
        sb.append('=');
        sb.append(((this.applicationJson == null)?"<null>":this.applicationJson));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content__1) == false) {
            return false;
        }
        Content__1 rhs = ((Content__1) other);
        return (((this.applicationXml == rhs.applicationXml)||((this.applicationXml!= null)&&this.applicationXml.equals(rhs.applicationXml)))&&((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson))));
    }

}
