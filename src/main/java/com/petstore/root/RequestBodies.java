
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Pet",
    "UserArray"
})
@Generated("jsonschema2pojo")
public class RequestBodies {

    @JsonProperty("Pet")
    private Pet__2 pet;
    @JsonProperty("UserArray")
    private UserArray userArray;

    @JsonProperty("Pet")
    public Pet__2 getPet() {
        return pet;
    }

    @JsonProperty("Pet")
    public void setPet(Pet__2 pet) {
        this.pet = pet;
    }

    @JsonProperty("UserArray")
    public UserArray getUserArray() {
        return userArray;
    }

    @JsonProperty("UserArray")
    public void setUserArray(UserArray userArray) {
        this.userArray = userArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequestBodies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pet");
        sb.append('=');
        sb.append(((this.pet == null)?"<null>":this.pet));
        sb.append(',');
        sb.append("userArray");
        sb.append('=');
        sb.append(((this.userArray == null)?"<null>":this.userArray));
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
        result = ((result* 31)+((this.pet == null)? 0 :this.pet.hashCode()));
        result = ((result* 31)+((this.userArray == null)? 0 :this.userArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestBodies) == false) {
            return false;
        }
        RequestBodies rhs = ((RequestBodies) other);
        return (((this.pet == rhs.pet)||((this.pet!= null)&&this.pet.equals(rhs.pet)))&&((this.userArray == rhs.userArray)||((this.userArray!= null)&&this.userArray.equals(rhs.userArray))));
    }

}
