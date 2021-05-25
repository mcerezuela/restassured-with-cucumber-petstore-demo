
package com.petstore.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tags",
    "summary",
    "description",
    "operationId",
    "requestBody",
    "responses"
})
@Generated("jsonschema2pojo")
public class Post__5 {

    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("operationId")
    private String operationId;
    @JsonProperty("requestBody")
    private RequestBody__5 requestBody;
    @JsonProperty("responses")
    private Responses__13 responses;

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("operationId")
    public String getOperationId() {
        return operationId;
    }

    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @JsonProperty("requestBody")
    public RequestBody__5 getRequestBody() {
        return requestBody;
    }

    @JsonProperty("requestBody")
    public void setRequestBody(RequestBody__5 requestBody) {
        this.requestBody = requestBody;
    }

    @JsonProperty("responses")
    public Responses__13 getResponses() {
        return responses;
    }

    @JsonProperty("responses")
    public void setResponses(Responses__13 responses) {
        this.responses = responses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Post__5 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("operationId");
        sb.append('=');
        sb.append(((this.operationId == null)?"<null>":this.operationId));
        sb.append(',');
        sb.append("requestBody");
        sb.append('=');
        sb.append(((this.requestBody == null)?"<null>":this.requestBody));
        sb.append(',');
        sb.append("responses");
        sb.append('=');
        sb.append(((this.responses == null)?"<null>":this.responses));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.requestBody == null)? 0 :this.requestBody.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.operationId == null)? 0 :this.operationId.hashCode()));
        result = ((result* 31)+((this.responses == null)? 0 :this.responses.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Post__5) == false) {
            return false;
        }
        Post__5 rhs = ((Post__5) other);
        return (((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.requestBody == rhs.requestBody)||((this.requestBody!= null)&&this.requestBody.equals(rhs.requestBody))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.operationId == rhs.operationId)||((this.operationId!= null)&&this.operationId.equals(rhs.operationId))))&&((this.responses == rhs.responses)||((this.responses!= null)&&this.responses.equals(rhs.responses))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
