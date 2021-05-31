
package com.petstore.root;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "openapi",
    "info",
    "externalDocs",
    "servers",
    "tags",
    "paths",
    "components"
})
@Generated("jsonschema2pojo")
public class Petstore {

    @JsonProperty("openapi")
    private String openapi;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("externalDocs")
    private ExternalDocs externalDocs;
    @JsonProperty("servers")
    private List<Server> servers = new ArrayList<Server>();
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("paths")
    private Paths paths;
    @JsonProperty("components")
    private Components components;

    @JsonProperty("openapi")
    public String getOpenapi() {
        return openapi;
    }

    @JsonProperty("openapi")
    public void setOpenapi(String openapi) {
        this.openapi = openapi;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("externalDocs")
    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    @JsonProperty("externalDocs")
    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

    @JsonProperty("servers")
    public List<Server> getServers() {
        return servers;
    }

    @JsonProperty("servers")
    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("paths")
    public Paths getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Petstore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("openapi");
        sb.append('=');
        sb.append(((this.openapi == null)?"<null>":this.openapi));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("externalDocs");
        sb.append('=');
        sb.append(((this.externalDocs == null)?"<null>":this.externalDocs));
        sb.append(',');
        sb.append("servers");
        sb.append('=');
        sb.append(((this.servers == null)?"<null>":this.servers));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("paths");
        sb.append('=');
        sb.append(((this.paths == null)?"<null>":this.paths));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
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
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.servers == null)? 0 :this.servers.hashCode()));
        result = ((result* 31)+((this.openapi == null)? 0 :this.openapi.hashCode()));
        result = ((result* 31)+((this.paths == null)? 0 :this.paths.hashCode()));
        result = ((result* 31)+((this.externalDocs == null)? 0 :this.externalDocs.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Petstore) == false) {
            return false;
        }
        Petstore rhs = ((Petstore) other);
        return ((((((((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components)))&&((this.servers == rhs.servers)||((this.servers!= null)&&this.servers.equals(rhs.servers))))&&((this.openapi == rhs.openapi)||((this.openapi!= null)&&this.openapi.equals(rhs.openapi))))&&((this.paths == rhs.paths)||((this.paths!= null)&&this.paths.equals(rhs.paths))))&&((this.externalDocs == rhs.externalDocs)||((this.externalDocs!= null)&&this.externalDocs.equals(rhs.externalDocs))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
