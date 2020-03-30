package com.mobotechnology.bipinpandey.mvp_hand_dirty.model;


public class UserModel {

    // Model handles the data

    // Can make API calls through here
    // Can do DB queries through here as well
    // now im just setting the data in variables for simplicity

    private String fullName = "", email = "";

    public UserModel() {
    }

    public UserModel(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + fullName;
    }
}
