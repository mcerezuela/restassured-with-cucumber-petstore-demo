
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get"
})
@Generated("jsonschema2pojo")
public class UserLogin {

    @JsonProperty("get")
    private Get__5 get;

    @JsonProperty("get")
    public Get__5 getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(Get__5 get) {
        this.get = get;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserLogin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("get");
        sb.append('=');
        sb.append(((this.get == null)?"<null>":this.get));
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
        result = ((result* 31)+((this.get == null)? 0 :this.get.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserLogin) == false) {
            return false;
        }
        UserLogin rhs = ((UserLogin) other);
        return ((this.get == rhs.get)||((this.get!= null)&&this.get.equals(rhs.get)));
    }

}