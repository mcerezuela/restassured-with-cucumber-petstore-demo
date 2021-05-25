
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application/json"
})
@Generated("jsonschema2pojo")
public class Content__21 {

    @JsonProperty("application/json")
    private ApplicationJson__20 applicationJson;

    @JsonProperty("application/json")
    public ApplicationJson__20 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__20 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__21 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.applicationJson == null)? 0 :this.applicationJson.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content__21) == false) {
            return false;
        }
        Content__21 rhs = ((Content__21) other);
        return ((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson)));
    }

}
