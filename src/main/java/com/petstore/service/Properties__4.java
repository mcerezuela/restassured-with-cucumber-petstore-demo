
package com.petstore.service;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "username",
    "firstName",
    "lastName",
    "email",
    "password",
    "phone",
    "userStatus"
})
@Generated("jsonschema2pojo")
public class Properties__4 {

    @JsonProperty("id")
    private Id__3 id;
    @JsonProperty("username")
    private Username__1 username;
    @JsonProperty("firstName")
    private FirstName firstName;
    @JsonProperty("lastName")
    private LastName lastName;
    @JsonProperty("email")
    private Email email;
    @JsonProperty("password")
    private Password password;
    @JsonProperty("phone")
    private Phone phone;
    @JsonProperty("userStatus")
    private UserStatus userStatus;

    @JsonProperty("id")
    public Id__3 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__3 id) {
        this.id = id;
    }

    @JsonProperty("username")
    public Username__1 getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(Username__1 username) {
        this.username = username;
    }

    @JsonProperty("firstName")
    public FirstName getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public LastName getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    @JsonProperty("password")
    public Password getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(Password password) {
        this.password = password;
    }

    @JsonProperty("phone")
    public Phone getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @JsonProperty("userStatus")
    public UserStatus getUserStatus() {
        return userStatus;
    }

    @JsonProperty("userStatus")
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties__4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("userStatus");
        sb.append('=');
        sb.append(((this.userStatus == null)?"<null>":this.userStatus));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.userStatus == null)? 0 :this.userStatus.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties__4) == false) {
            return false;
        }
        Properties__4 rhs = ((Properties__4) other);
        return (((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.userStatus == rhs.userStatus)||((this.userStatus!= null)&&this.userStatus.equals(rhs.userStatus))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
