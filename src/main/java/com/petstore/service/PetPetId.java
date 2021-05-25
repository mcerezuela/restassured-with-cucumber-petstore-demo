
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get",
    "post",
    "delete"
})
@Generated("jsonschema2pojo")
public class PetPetId {

    @JsonProperty("get")
    private Get__2 get;
    @JsonProperty("post")
    private Post__1 post;
    @JsonProperty("delete")
    private Delete delete;

    @JsonProperty("get")
    public Get__2 getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(Get__2 get) {
        this.get = get;
    }

    @JsonProperty("post")
    public Post__1 getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post__1 post) {
        this.post = post;
    }

    @JsonProperty("delete")
    public Delete getDelete() {
        return delete;
    }

    @JsonProperty("delete")
    public void setDelete(Delete delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PetPetId.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("get");
        sb.append('=');
        sb.append(((this.get == null)?"<null>":this.get));
        sb.append(',');
        sb.append("post");
        sb.append('=');
        sb.append(((this.post == null)?"<null>":this.post));
        sb.append(',');
        sb.append("delete");
        sb.append('=');
        sb.append(((this.delete == null)?"<null>":this.delete));
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
        result = ((result* 31)+((this.delete == null)? 0 :this.delete.hashCode()));
        result = ((result* 31)+((this.get == null)? 0 :this.get.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PetPetId) == false) {
            return false;
        }
        PetPetId rhs = ((PetPetId) other);
        return ((((this.post == rhs.post)||((this.post!= null)&&this.post.equals(rhs.post)))&&((this.delete == rhs.delete)||((this.delete!= null)&&this.delete.equals(rhs.delete))))&&((this.get == rhs.get)||((this.get!= null)&&this.get.equals(rhs.get))));
    }

}
