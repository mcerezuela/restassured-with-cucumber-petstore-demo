
package com.petstore.root;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "/pet",
    "/pet/findByStatus",
    "/pet/findByTags",
    "/pet/{petId}",
    "/pet/{petId}/uploadImage",
    "/store/inventory",
    "/store/order",
    "/store/order/{orderId}",
    "/user",
    "/user/createWithList",
    "/user/login",
    "/user/logout",
    "/user/{username}"
})
@Generated("jsonschema2pojo")
public class Paths {

    @JsonProperty("/pet")
    private Pet pet;
    @JsonProperty("/pet/findByStatus")
    private PetFindByStatus petFindByStatus;
    @JsonProperty("/pet/findByTags")
    private PetFindByTags petFindByTags;
    @JsonProperty("/pet/{petId}")
    private PetPetId petPetId;
    @JsonProperty("/pet/{petId}/uploadImage")
    private PetPetIdUploadImage petPetIdUploadImage;
    @JsonProperty("/store/inventory")
    private StoreInventory storeInventory;
    @JsonProperty("/store/order")
    private StoreOrder storeOrder;
    @JsonProperty("/store/order/{orderId}")
    private StoreOrderOrderId storeOrderOrderId;
    @JsonProperty("/user")
    private User user;
    @JsonProperty("/user/createWithList")
    private UserCreateWithList userCreateWithList;
    @JsonProperty("/user/login")
    private UserLogin userLogin;
    @JsonProperty("/user/logout")
    private UserLogout userLogout;
    @JsonProperty("/user/{username}")
    private UserUsername userUsername;

    @JsonProperty("/pet")
    public Pet getPet() {
        return pet;
    }

    @JsonProperty("/pet")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @JsonProperty("/pet/findByStatus")
    public PetFindByStatus getPetFindByStatus() {
        return petFindByStatus;
    }

    @JsonProperty("/pet/findByStatus")
    public void setPetFindByStatus(PetFindByStatus petFindByStatus) {
        this.petFindByStatus = petFindByStatus;
    }

    @JsonProperty("/pet/findByTags")
    public PetFindByTags getPetFindByTags() {
        return petFindByTags;
    }

    @JsonProperty("/pet/findByTags")
    public void setPetFindByTags(PetFindByTags petFindByTags) {
        this.petFindByTags = petFindByTags;
    }

    @JsonProperty("/pet/{petId}")
    public PetPetId getPetPetId() {
        return petPetId;
    }

    @JsonProperty("/pet/{petId}")
    public void setPetPetId(PetPetId petPetId) {
        this.petPetId = petPetId;
    }

    @JsonProperty("/pet/{petId}/uploadImage")
    public PetPetIdUploadImage getPetPetIdUploadImage() {
        return petPetIdUploadImage;
    }

    @JsonProperty("/pet/{petId}/uploadImage")
    public void setPetPetIdUploadImage(PetPetIdUploadImage petPetIdUploadImage) {
        this.petPetIdUploadImage = petPetIdUploadImage;
    }

    @JsonProperty("/store/inventory")
    public StoreInventory getStoreInventory() {
        return storeInventory;
    }

    @JsonProperty("/store/inventory")
    public void setStoreInventory(StoreInventory storeInventory) {
        this.storeInventory = storeInventory;
    }

    @JsonProperty("/store/order")
    public StoreOrder getStoreOrder() {
        return storeOrder;
    }

    @JsonProperty("/store/order")
    public void setStoreOrder(StoreOrder storeOrder) {
        this.storeOrder = storeOrder;
    }

    @JsonProperty("/store/order/{orderId}")
    public StoreOrderOrderId getStoreOrderOrderId() {
        return storeOrderOrderId;
    }

    @JsonProperty("/store/order/{orderId}")
    public void setStoreOrderOrderId(StoreOrderOrderId storeOrderOrderId) {
        this.storeOrderOrderId = storeOrderOrderId;
    }

    @JsonProperty("/user")
    public User getUser() {
        return user;
    }

    @JsonProperty("/user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("/user/createWithList")
    public UserCreateWithList getUserCreateWithList() {
        return userCreateWithList;
    }

    @JsonProperty("/user/createWithList")
    public void setUserCreateWithList(UserCreateWithList userCreateWithList) {
        this.userCreateWithList = userCreateWithList;
    }

    @JsonProperty("/user/login")
    public UserLogin getUserLogin() {
        return userLogin;
    }

    @JsonProperty("/user/login")
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @JsonProperty("/user/logout")
    public UserLogout getUserLogout() {
        return userLogout;
    }

    @JsonProperty("/user/logout")
    public void setUserLogout(UserLogout userLogout) {
        this.userLogout = userLogout;
    }

    @JsonProperty("/user/{username}")
    public UserUsername getUserUsername() {
        return userUsername;
    }

    @JsonProperty("/user/{username}")
    public void setUserUsername(UserUsername userUsername) {
        this.userUsername = userUsername;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Paths.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pet");
        sb.append('=');
        sb.append(((this.pet == null)?"<null>":this.pet));
        sb.append(',');
        sb.append("petFindByStatus");
        sb.append('=');
        sb.append(((this.petFindByStatus == null)?"<null>":this.petFindByStatus));
        sb.append(',');
        sb.append("petFindByTags");
        sb.append('=');
        sb.append(((this.petFindByTags == null)?"<null>":this.petFindByTags));
        sb.append(',');
        sb.append("petPetId");
        sb.append('=');
        sb.append(((this.petPetId == null)?"<null>":this.petPetId));
        sb.append(',');
        sb.append("petPetIdUploadImage");
        sb.append('=');
        sb.append(((this.petPetIdUploadImage == null)?"<null>":this.petPetIdUploadImage));
        sb.append(',');
        sb.append("storeInventory");
        sb.append('=');
        sb.append(((this.storeInventory == null)?"<null>":this.storeInventory));
        sb.append(',');
        sb.append("storeOrder");
        sb.append('=');
        sb.append(((this.storeOrder == null)?"<null>":this.storeOrder));
        sb.append(',');
        sb.append("storeOrderOrderId");
        sb.append('=');
        sb.append(((this.storeOrderOrderId == null)?"<null>":this.storeOrderOrderId));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("userCreateWithList");
        sb.append('=');
        sb.append(((this.userCreateWithList == null)?"<null>":this.userCreateWithList));
        sb.append(',');
        sb.append("userLogin");
        sb.append('=');
        sb.append(((this.userLogin == null)?"<null>":this.userLogin));
        sb.append(',');
        sb.append("userLogout");
        sb.append('=');
        sb.append(((this.userLogout == null)?"<null>":this.userLogout));
        sb.append(',');
        sb.append("userUsername");
        sb.append('=');
        sb.append(((this.userUsername == null)?"<null>":this.userUsername));
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
        result = ((result* 31)+((this.userCreateWithList == null)? 0 :this.userCreateWithList.hashCode()));
        result = ((result* 31)+((this.storeInventory == null)? 0 :this.storeInventory.hashCode()));
        result = ((result* 31)+((this.userUsername == null)? 0 :this.userUsername.hashCode()));
        result = ((result* 31)+((this.userLogin == null)? 0 :this.userLogin.hashCode()));
        result = ((result* 31)+((this.storeOrderOrderId == null)? 0 :this.storeOrderOrderId.hashCode()));
        result = ((result* 31)+((this.petFindByTags == null)? 0 :this.petFindByTags.hashCode()));
        result = ((result* 31)+((this.petPetId == null)? 0 :this.petPetId.hashCode()));
        result = ((result* 31)+((this.petFindByStatus == null)? 0 :this.petFindByStatus.hashCode()));
        result = ((result* 31)+((this.petPetIdUploadImage == null)? 0 :this.petPetIdUploadImage.hashCode()));
        result = ((result* 31)+((this.storeOrder == null)? 0 :this.storeOrder.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.userLogout == null)? 0 :this.userLogout.hashCode()));
        result = ((result* 31)+((this.pet == null)? 0 :this.pet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paths) == false) {
            return false;
        }
        Paths rhs = ((Paths) other);
        return ((((((((((((((this.userCreateWithList == rhs.userCreateWithList)||((this.userCreateWithList!= null)&&this.userCreateWithList.equals(rhs.userCreateWithList)))&&((this.storeInventory == rhs.storeInventory)||((this.storeInventory!= null)&&this.storeInventory.equals(rhs.storeInventory))))&&((this.userUsername == rhs.userUsername)||((this.userUsername!= null)&&this.userUsername.equals(rhs.userUsername))))&&((this.userLogin == rhs.userLogin)||((this.userLogin!= null)&&this.userLogin.equals(rhs.userLogin))))&&((this.storeOrderOrderId == rhs.storeOrderOrderId)||((this.storeOrderOrderId!= null)&&this.storeOrderOrderId.equals(rhs.storeOrderOrderId))))&&((this.petFindByTags == rhs.petFindByTags)||((this.petFindByTags!= null)&&this.petFindByTags.equals(rhs.petFindByTags))))&&((this.petPetId == rhs.petPetId)||((this.petPetId!= null)&&this.petPetId.equals(rhs.petPetId))))&&((this.petFindByStatus == rhs.petFindByStatus)||((this.petFindByStatus!= null)&&this.petFindByStatus.equals(rhs.petFindByStatus))))&&((this.petPetIdUploadImage == rhs.petPetIdUploadImage)||((this.petPetIdUploadImage!= null)&&this.petPetIdUploadImage.equals(rhs.petPetIdUploadImage))))&&((this.storeOrder == rhs.storeOrder)||((this.storeOrder!= null)&&this.storeOrder.equals(rhs.storeOrder))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.userLogout == rhs.userLogout)||((this.userLogout!= null)&&this.userLogout.equals(rhs.userLogout))))&&((this.pet == rhs.pet)||((this.pet!= null)&&this.pet.equals(rhs.pet))));
    }

}
