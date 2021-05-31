
package com.petstore.root;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "petstore_auth"
})
@Generated("jsonschema2pojo")
public class Security__6 {

    @JsonProperty("petstore_auth")
    private List<String> petstoreAuth = new ArrayList<String>();

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
        sb.append(Security__6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.petstoreAuth == null)? 0 :this.petstoreAuth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security__6) == false) {
            return false;
        }
        Security__6 rhs = ((Security__6) other);
        return ((this.petstoreAuth == rhs.petstoreAuth)||((this.petstoreAuth!= null)&&this.petstoreAuth.equals(rhs.petstoreAuth)));
    }

}
