
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "put",
    "post"
})
@Generated("jsonschema2pojo")
public class Pet {

    @JsonProperty("put")
    private Put put;
    @JsonProperty("post")
    private Post post;

    @JsonProperty("put")
    public Put getPut() {
        return put;
    }

    @JsonProperty("put")
    public void setPut(Put put) {
        this.put = put;
    }

    @JsonProperty("post")
    public Post getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("put");
        sb.append('=');
        sb.append(((this.put == null)?"<null>":this.put));
        sb.append(',');
        sb.append("post");
        sb.append('=');
        sb.append(((this.post == null)?"<null>":this.post));
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
        result = ((result* 31)+((this.post == null)? 0 :this.post.hashCode()));
        result = ((result* 31)+((this.put == null)? 0 :this.put.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pet) == false) {
            return false;
        }
        Pet rhs = ((Pet) other);
        return (((this.post == rhs.post)||((this.post!= null)&&this.post.equals(rhs.post)))&&((this.put == rhs.put)||((this.put!= null)&&this.put.equals(rhs.put))));
    }

}
