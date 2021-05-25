
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
public class Content__11 {

    @JsonProperty("application/json")
    private ApplicationJson__10 applicationJson;

    @JsonProperty("application/json")
    public ApplicationJson__10 getApplicationJson() {
        return applicationJson;
    }

    @JsonProperty("application/json")
    public void setApplicationJson(ApplicationJson__10 applicationJson) {
        this.applicationJson = applicationJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__11 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Content__11) == false) {
            return false;
        }
        Content__11 rhs = ((Content__11) other);
        return ((this.applicationJson == rhs.applicationJson)||((this.applicationJson!= null)&&this.applicationJson.equals(rhs.applicationJson)));
    }

}
