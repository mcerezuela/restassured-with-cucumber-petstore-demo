
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "post"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("post")
    private Post__4 post;

    @JsonProperty("post")
    public Post__4 getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post__4 post) {
        this.post = post;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return ((this.post == rhs.post)||((this.post!= null)&&this.post.equals(rhs.post)));
    }

}
