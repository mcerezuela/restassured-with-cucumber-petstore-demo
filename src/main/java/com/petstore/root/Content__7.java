
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "application/octet-stream"
})
@Generated("jsonschema2pojo")
public class Content__7 {

    @JsonProperty("application/octet-stream")
    private ApplicationOctetStream applicationOctetStream;

    @JsonProperty("application/octet-stream")
    public ApplicationOctetStream getApplicationOctetStream() {
        return applicationOctetStream;
    }

    @JsonProperty("application/octet-stream")
    public void setApplicationOctetStream(ApplicationOctetStream applicationOctetStream) {
        this.applicationOctetStream = applicationOctetStream;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Content__7 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationOctetStream");
        sb.append('=');
        sb.append(((this.applicationOctetStream == null)?"<null>":this.applicationOctetStream));
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
        result = ((result* 31)+((this.applicationOctetStream == null)? 0 :this.applicationOctetStream.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content__7) == false) {
            return false;
        }
        Content__7 rhs = ((Content__7) other);
        return ((this.applicationOctetStream == rhs.applicationOctetStream)||((this.applicationOctetStream!= null)&&this.applicationOctetStream.equals(rhs.applicationOctetStream)));
    }

}
