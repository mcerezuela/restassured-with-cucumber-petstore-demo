
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "content"
})
@Generated("jsonschema2pojo")
public class RequestBody__5 {

    @JsonProperty("content")
    private Content__15 content;

    @JsonProperty("content")
    public Content__15 getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content__15 content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequestBody__5 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
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
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestBody__5) == false) {
            return false;
        }
        RequestBody__5 rhs = ((RequestBody__5) other);
        return ((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content)));
    }

}
