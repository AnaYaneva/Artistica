package com.artcources.artistica.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {

    @Email
    @NotBlank(message = "Username should not be an empty string")
    @Size(min=3,max=20, message = "Username length must be between 3 and 20 characters!")
    private String email;

    @NotBlank(message = "Password should not be an empty string")
    @Size(min=3,max=20, message = "Password length must be between 3 and 20 characters!")
    private String password;

    public UserLoginBindingModel() {
    }

    public String getEmail() {
        return email;
    }

    public UserLoginBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
