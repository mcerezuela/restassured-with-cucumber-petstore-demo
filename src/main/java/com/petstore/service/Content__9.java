
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
public class Content__9 {

    @JsonProperty("application/json")
    private ApplicationJson__8 applicationJson;

    @JsonProperty("application/json")
    public ApplicationJson__8 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__8 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__9 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Content__9) == false) {
            return false;
        }
        Content__9 rhs = ((Content__9) other);
        return ((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson)));
    }

}
