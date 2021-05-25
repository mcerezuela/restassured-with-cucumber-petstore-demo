
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
public class Content__12 {

    @JsonProperty("application/xml")
    private ApplicationXml__8 applicationXml;
    @JsonProperty("application/json")
    private ApplicationJson__11 applicationJson;

    @JsonProperty("application/xml")
    public ApplicationXml__8 getApplicationXml() {
        return applicationXml;
    }

    @JsonProperty("application/xml")
    public void setApplicationXml(ApplicationXml__8 applicationXml) {
        this.applicationXml = applicationXml;
    }

    @JsonProperty("application/json")
    public ApplicationJson__11 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__11 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__12 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Content__12) == false) {
            return false;
        }
        Content__12 rhs = ((Content__12) other);
        return (((this.applicationXml == rhs.applicationXml)||((this.applicationXml!= null)&&this.applicationXml.equals(rhs.applicationXml)))&&((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson))));
    }

}
