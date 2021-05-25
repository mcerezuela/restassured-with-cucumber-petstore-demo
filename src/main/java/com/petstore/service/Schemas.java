
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Order",
    "Customer",
    "Address",
    "Category",
    "User",
    "Tag",
    "Pet",
    "ApiResponse"
})
@Generated("jsonschema2pojo")
public class Schemas {

    @JsonProperty("Order")
    private Order order;
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("Address")
    private Address__1 address;
    @JsonProperty("Category")
    private Category category;
    @JsonProperty("User")
    private User__1 user;
    @JsonProperty("Tag")
    private Tag__1 tag;
    @JsonProperty("Pet")
    private Pet__1 pet;
    @JsonProperty("ApiResponse")
    private ApiResponse apiResponse;

    @JsonProperty("Order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("Order")
    public void setOrder(Order order) {
        this.order = order;
    }

    @JsonProperty("Customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("Address")
    public Address__1 getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address__1 address) {
        this.address = address;
    }

    @JsonProperty("Category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("User")
    public User__1 getUser() {
        return user;
    }

    @JsonProperty("User")
    public void setUser(User__1 user) {
        this.user = user;
    }

    @JsonProperty("Tag")
    public Tag__1 getTag() {
        return tag;
    }

    @JsonProperty("Tag")
    public void setTag(Tag__1 tag) {
        this.tag = tag;
    }

    @JsonProperty("Pet")
    public Pet__1 getPet() {
        return pet;
    }

    @JsonProperty("Pet")
    public void setPet(Pet__1 pet) {
        this.pet = pet;
    }

    @JsonProperty("ApiResponse")
    public ApiResponse getApiResponse() {
        return apiResponse;
    }

    @JsonProperty("ApiResponse")
    public void setApiResponse(ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schemas.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("customer");
        sb.append('=');
        sb.append(((this.customer == null)?"<null>":this.customer));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("pet");
        sb.append('=');
        sb.append(((this.pet == null)?"<null>":this.pet));
        sb.append(',');
        sb.append("apiResponse");
        sb.append('=');
        sb.append(((this.apiResponse == null)?"<null>":this.apiResponse));
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
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.apiResponse == null)? 0 :this.apiResponse.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.pet == null)? 0 :this.pet.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        result = ((result* 31)+((this.customer == null)? 0 :this.customer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schemas) == false) {
            return false;
        }
        Schemas rhs = ((Schemas) other);
        return (((((((((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address)))&&((this.apiResponse == rhs.apiResponse)||((this.apiResponse!= null)&&this.apiResponse.equals(rhs.apiResponse))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.pet == rhs.pet)||((this.pet!= null)&&this.pet.equals(rhs.pet))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))))&&((this.customer == rhs.customer)||((this.customer!= null)&&this.customer.equals(rhs.customer))));
    }

}
