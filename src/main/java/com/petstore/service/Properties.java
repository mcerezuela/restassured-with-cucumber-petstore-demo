
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "petId",
    "quantity",
    "shipDate",
    "status",
    "complete"
})
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("petId")
    private PetId petId;
    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("shipDate")
    private ShipDate shipDate;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("complete")
    private Complete complete;

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("petId")
    public PetId getPetId() {
        return petId;
    }

    @JsonProperty("petId")
    public void setPetId(PetId petId) {
        this.petId = petId;
    }

    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("shipDate")
    public ShipDate getShipDate() {
        return shipDate;
    }

    @JsonProperty("shipDate")
    public void setShipDate(ShipDate shipDate) {
        this.shipDate = shipDate;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("complete")
    public Complete getComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(Complete complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("petId");
        sb.append('=');
        sb.append(((this.petId == null)?"<null>":this.petId));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("shipDate");
        sb.append('=');
        sb.append(((this.shipDate == null)?"<null>":this.shipDate));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("complete");
        sb.append('=');
        sb.append(((this.complete == null)?"<null>":this.complete));
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
        result = ((result* 31)+((this.petId == null)? 0 :this.petId.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.shipDate == null)? 0 :this.shipDate.hashCode()));
        result = ((result* 31)+((this.complete == null)? 0 :this.complete.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return (((((((this.petId == rhs.petId)||((this.petId!= null)&&this.petId.equals(rhs.petId)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.shipDate == rhs.shipDate)||((this.shipDate!= null)&&this.shipDate.equals(rhs.shipDate))))&&((this.complete == rhs.complete)||((this.complete!= null)&&this.complete.equals(rhs.complete))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
