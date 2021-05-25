
package com.petstore.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "required",
    "type",
    "properties",
    "xml"
})
@Generated("jsonschema2pojo")
public class Pet__1 {

    @JsonProperty("required")
    private List<String> required = new ArrayList<String>();
    @JsonProperty("type")
    private String type;
    @JsonProperty("properties")
    private Properties__6 properties;
    @JsonProperty("xml")
    private Xml__10 xml;

    @JsonProperty("required")
    public List<String> getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(List<String> required) {
        this.required = required;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("properties")
    public Properties__6 getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties__6 properties) {
        this.properties = properties;
    }

    @JsonProperty("xml")
    public Xml__10 getXml() {
        return xml;
    }

    @JsonProperty("xml")
    public void setXml(Xml__10 xml) {
        this.xml = xml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pet__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("xml");
        sb.append('=');
        sb.append(((this.xml == null)?"<null>":this.xml));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.xml == null)? 0 :this.xml.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pet__1) == false) {
            return false;
        }
        Pet__1 rhs = ((Pet__1) other);
        return (((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.xml == rhs.xml)||((this.xml!= null)&&this.xml.equals(rhs.xml))));
    }

}
