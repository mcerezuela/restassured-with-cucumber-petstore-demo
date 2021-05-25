
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "write:pets",
    "read:pets"
})
@Generated("jsonschema2pojo")
public class Scopes {

    @JsonProperty("write:pets")
    private String writePets;
    @JsonProperty("read:pets")
    private String readPets;

    @JsonProperty("write:pets")
    public String getWritePets() {
        return writePets;
    }

    @JsonProperty("write:pets")
    public void setWritePets(String writePets) {
        this.writePets = writePets;
    }

    @JsonProperty("read:pets")
    public String getReadPets() {
        return readPets;
    }

    @JsonProperty("read:pets")
    public void setReadPets(String readPets) {
        this.readPets = readPets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scopes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("writePets");
        sb.append('=');
        sb.append(((this.writePets == null)?"<null>":this.writePets));
        sb.append(',');
        sb.append("readPets");
        sb.append('=');
        sb.append(((this.readPets == null)?"<null>":this.readPets));
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
        result = ((result* 31)+((this.writePets == null)? 0 :this.writePets.hashCode()));
        result = ((result* 31)+((this.readPets == null)? 0 :this.readPets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scopes) == false) {
            return false;
        }
        Scopes rhs = ((Scopes) other);
        return (((this.writePets == rhs.writePets)||((this.writePets!= null)&&this.writePets.equals(rhs.writePets)))&&((this.readPets == rhs.readPets)||((this.readPets!= null)&&this.readPets.equals(rhs.readPets))));
    }

}
