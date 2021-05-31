
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "X-Rate-Limit",
    "X-Expires-After"
})
@Generated("jsonschema2pojo")
public class Headers {

    @JsonProperty("X-Rate-Limit")
    private XRateLimit xRateLimit;
    @JsonProperty("X-Expires-After")
    private XExpiresAfter xExpiresAfter;

    @JsonProperty("X-Rate-Limit")
    public XRateLimit getXRateLimit() {
        return xRateLimit;
    }

    @JsonProperty("X-Rate-Limit")
    public void setXRateLimit(XRateLimit xRateLimit) {
        this.xRateLimit = xRateLimit;
    }

    @JsonProperty("X-Expires-After")
    public XExpiresAfter getXExpiresAfter() {
        return xExpiresAfter;
    }

    @JsonProperty("X-Expires-After")
    public void setXExpiresAfter(XExpiresAfter xExpiresAfter) {
        this.xExpiresAfter = xExpiresAfter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Headers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xRateLimit");
        sb.append('=');
        sb.append(((this.xRateLimit == null)?"<null>":this.xRateLimit));
        sb.append(',');
        sb.append("xExpiresAfter");
        sb.append('=');
        sb.append(((this.xExpiresAfter == null)?"<null>":this.xExpiresAfter));
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
        result = ((result* 31)+((this.xRateLimit == null)? 0 :this.xRateLimit.hashCode()));
        result = ((result* 31)+((this.xExpiresAfter == null)? 0 :this.xExpiresAfter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Headers) == false) {
            return false;
        }
        Headers rhs = ((Headers) other);
        return (((this.xRateLimit == rhs.xRateLimit)||((this.xRateLimit!= null)&&this.xRateLimit.equals(rhs.xRateLimit)))&&((this.xExpiresAfter == rhs.xExpiresAfter)||((this.xExpiresAfter!= null)&&this.xExpiresAfter.equals(rhs.xExpiresAfter))));
    }

}
