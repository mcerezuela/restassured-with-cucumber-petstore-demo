
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "petstore_auth",
    "api_key"
})
@Generated("jsonschema2pojo")
public class SecuritySchemes {

    @JsonProperty("petstore_auth")
    private PetstoreAuth petstoreAuth;
    @JsonProperty("api_key")
    private ApiKey apiKey;

    @JsonProperty("petstore_auth")
    public PetstoreAuth getPetstoreAuth() {
        return petstoreAuth;
    }

    @JsonProperty("petstore_auth")
    public void setPetstoreAuth(PetstoreAuth petstoreAuth) {
        this.petstoreAuth = petstoreAuth;
    }

    @JsonProperty("api_key")
    public ApiKey getApiKey() {
        return apiKey;
    }

    @JsonProperty("api_key")
    public void setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecuritySchemes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("petstoreAuth");
        sb.append('=');
        sb.append(((this.petstoreAuth == null)?"<null>":this.petstoreAuth));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
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
        if ((other instanceof SecuritySchemes) == false) {
            return false;
        }
        SecuritySchemes rhs = ((SecuritySchemes) other);
        return (((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey)))&&((this.petstoreAuth == rhs.petstoreAuth)||((this.petstoreAuth!= null)&&this.petstoreAuth.equals(rhs.petstoreAuth))));
    }

}
