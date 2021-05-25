
package com.petstore.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "api_key",
    "petstore_auth"
})
@Generated("jsonschema2pojo")
public class Security__4 {

    @JsonProperty("api_key")
    private List<Object> apiKey = new ArrayList<Object>();
    @JsonProperty("petstore_auth")
    private List<String> petstoreAuth = new ArrayList<String>();

    @JsonProperty("api_key")
    public List<Object> getApiKey() {
        return apiKey;
    }

    @JsonProperty("api_key")
    public void setApiKey(List<Object> apiKey) {
        this.apiKey = apiKey;
    }

    @JsonProperty("petstore_auth")
    public List<String> getPetstoreAuth() {
        return petstoreAuth;
    }

    @JsonProperty("petstore_auth")
    public void setPetstoreAuth(List<String> petstoreAuth) {
        this.petstoreAuth = petstoreAuth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Security__4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("petstoreAuth");
        sb.append('=');
        sb.append(((this.petstoreAuth == null)?"<null>":this.petstoreAuth));
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
        result = ((result* 31)+((this.apiKey == null)? 0 :this.apiKey.hashCode()));
        result = ((result* 31)+((this.petstoreAuth == null)? 0 :this.petstoreAuth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security__4) == false) {
            return false;
        }
        Security__4 rhs = ((Security__4) other);
        return (((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey)))&&((this.petstoreAuth == rhs.petstoreAuth)||((this.petstoreAuth!= null)&&this.petstoreAuth.equals(rhs.petstoreAuth))));
    }

}
