
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "category",
    "photoUrls",
    "tags",
    "status"
})
@Generated("jsonschema2pojo")
public class Properties__6 {

    @JsonProperty("id")
    private Id__5 id;
    @JsonProperty("name")
    private Name__2 name;
    @JsonProperty("category")
    private Category__1 category;
    @JsonProperty("photoUrls")
    private PhotoUrls photoUrls;
    @JsonProperty("tags")
    private Tags tags;
    @JsonProperty("status")
    private Status__1 status;

    @JsonProperty("id")
    public Id__5 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__5 id) {
        this.id = id;
    }

    @JsonProperty("name")
    public Name__2 getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name__2 name) {
        this.name = name;
    }

    @JsonProperty("category")
    public Category__1 getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category__1 category) {
        this.category = category;
    }

    @JsonProperty("photoUrls")
    public PhotoUrls getPhotoUrls() {
        return photoUrls;
    }

    @JsonProperty("photoUrls")
    public void setPhotoUrls(PhotoUrls photoUrls) {
        this.photoUrls = photoUrls;
    }

    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @JsonProperty("status")
    public Status__1 getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status__1 status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties__6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("photoUrls");
        sb.append('=');
        sb.append(((this.photoUrls == null)?"<null>":this.photoUrls));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.photoUrls == null)? 0 :this.photoUrls.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties__6) == false) {
            return false;
        }
        Properties__6 rhs = ((Properties__6) other);
        return (((((((this.photoUrls == rhs.photoUrls)||((this.photoUrls!= null)&&this.photoUrls.equals(rhs.photoUrls)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
