
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemas",
    "requestBodies",
    "securitySchemes"
})
@Generated("jsonschema2pojo")
public class Components {

    @JsonProperty("schemas")
    private Schemas schemas;
    @JsonProperty("requestBodies")
    private RequestBodies requestBodies;
    @JsonProperty("securitySchemes")
    private SecuritySchemes securitySchemes;

    @JsonProperty("schemas")
    public Schemas getSchemas() {
        return schemas;
    }

    @JsonProperty("schemas")
    public void setSchemas(Schemas schemas) {
        this.schemas = schemas;
    }

    @JsonProperty("requestBodies")
    public RequestBodies getRequestBodies() {
        return requestBodies;
    }

    @JsonProperty("requestBodies")
    public void setRequestBodies(RequestBodies requestBodies) {
        this.requestBodies = requestBodies;
    }

    @JsonProperty("securitySchemes")
    public SecuritySchemes getSecuritySchemes() {
        return securitySchemes;
    }

    @JsonProperty("securitySchemes")
    public void setSecuritySchemes(SecuritySchemes securitySchemes) {
        this.securitySchemes = securitySchemes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Components.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schemas");
        sb.append('=');
        sb.append(((this.schemas == null)?"<null>":this.schemas));
        sb.append(',');
        sb.append("requestBodies");
        sb.append('=');
        sb.append(((this.requestBodies == null)?"<null>":this.requestBodies));
        sb.append(',');
        sb.append("securitySchemes");
        sb.append('=');
        sb.append(((this.securitySchemes == null)?"<null>":this.securitySchemes));
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
        result = ((result* 31)+((this.requestBodies == null)? 0 :this.requestBodies.hashCode()));
        result = ((result* 31)+((this.securitySchemes == null)? 0 :this.securitySchemes.hashCode()));
        result = ((result* 31)+((this.schemas == null)? 0 :this.schemas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Components) == false) {
            return false;
        }
        Components rhs = ((Components) other);
        return ((((this.requestBodies == rhs.requestBodies)||((this.requestBodies!= null)&&this.requestBodies.equals(rhs.requestBodies)))&&((this.securitySchemes == rhs.securitySchemes)||((this.securitySchemes!= null)&&this.securitySchemes.equals(rhs.securitySchemes))))&&((this.schemas == rhs.schemas)||((this.schemas!= null)&&this.schemas.equals(rhs.schemas))));
    }

}
