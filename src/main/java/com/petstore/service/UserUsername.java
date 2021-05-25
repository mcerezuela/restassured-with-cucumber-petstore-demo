
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get",
    "put",
    "delete"
})
@Generated("jsonschema2pojo")
public class UserUsername {

    @JsonProperty("get")
    private Get__7 get;
    @JsonProperty("put")
    private Put__1 put;
    @JsonProperty("delete")
    private Delete__2 delete;

    @JsonProperty("get")
    public Get__7 getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(Get__7 get) {
        this.get = get;
    }

    @JsonProperty("put")
    public Put__1 getPut() {
        return put;
    }

    @JsonProperty("put")
    public void setPut(Put__1 put) {
        this.put = put;
    }

    @JsonProperty("delete")
    public Delete__2 getDelete() {
        return delete;
    }

    @JsonProperty("delete")
    public void setDelete(Delete__2 delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserUsername.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("get");
        sb.append('=');
        sb.append(((this.get == null)?"<null>":this.get));
        sb.append(',');
        sb.append("put");
        sb.append('=');
        sb.append(((this.put == null)?"<null>":this.put));
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
        result = ((result* 31)+((this.delete == null)? 0 :this.delete.hashCode()));
        result = ((result* 31)+((this.put == null)? 0 :this.put.hashCode()));
        result = ((result* 31)+((this.get == null)? 0 :this.get.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserUsername) == false) {
            return false;
        }
        UserUsername rhs = ((UserUsername) other);
        return ((((this.delete == rhs.delete)||((this.delete!= null)&&this.delete.equals(rhs.delete)))&&((this.put == rhs.put)||((this.put!= null)&&this.put.equals(rhs.put))))&&((this.get == rhs.get)||((this.get!= null)&&this.get.equals(rhs.get))));
    }

}
