
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authorizationUrl",
    "scopes"
})
@Generated("jsonschema2pojo")
public class Implicit {

    @JsonProperty("authorizationUrl")
    private String authorizationUrl;
    @JsonProperty("scopes")
    private Scopes scopes;

    @JsonProperty("authorizationUrl")
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    @JsonProperty("authorizationUrl")
    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    @JsonProperty("scopes")
    public Scopes getScopes() {
        return scopes;
    }

    @JsonProperty("scopes")
    public void setScopes(Scopes scopes) {
        this.scopes = scopes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Implicit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("authorizationUrl");
        sb.append('=');
        sb.append(((this.authorizationUrl == null)?"<null>":this.authorizationUrl));
        sb.append(',');
        sb.append("scopes");
        sb.append('=');
        sb.append(((this.scopes == null)?"<null>":this.scopes));
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
        result = ((result* 31)+((this.authorizationUrl == null)? 0 :this.authorizationUrl.hashCode()));
        result = ((result* 31)+((this.scopes == null)? 0 :this.scopes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Implicit) == false) {
            return false;
        }
        Implicit rhs = ((Implicit) other);
        return (((this.authorizationUrl == rhs.authorizationUrl)||((this.authorizationUrl!= null)&&this.authorizationUrl.equals(rhs.authorizationUrl)))&&((this.scopes == rhs.scopes)||((this.scopes!= null)&&this.scopes.equals(rhs.scopes))));
    }

}
