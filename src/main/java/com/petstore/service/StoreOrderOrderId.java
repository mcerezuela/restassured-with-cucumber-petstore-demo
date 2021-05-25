
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get",
    "delete"
})
@Generated("jsonschema2pojo")
public class StoreOrderOrderId {

    @JsonProperty("get")
    private Get__4 get;
    @JsonProperty("delete")
    private Delete__1 delete;

    @JsonProperty("get")
    public Get__4 getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(Get__4 get) {
        this.get = get;
    }

    @JsonProperty("delete")
    public Delete__1 getDelete() {
        return delete;
    }

    @JsonProperty("delete")
    public void setDelete(Delete__1 delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StoreOrderOrderId.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("get");
        sb.append('=');
        sb.append(((this.get == null)?"<null>":this.get));
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
        result = ((result* 31)+((this.get == null)? 0 :this.get.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoreOrderOrderId) == false) {
            return false;
        }
        StoreOrderOrderId rhs = ((StoreOrderOrderId) other);
        return (((this.delete == rhs.delete)||((this.delete!= null)&&this.delete.equals(rhs.delete)))&&((this.get == rhs.get)||((this.get!= null)&&this.get.equals(rhs.get))));
    }

}
