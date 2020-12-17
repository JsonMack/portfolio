package com.jsonmack.model;

import javax.validation.constraints.*;

/**
 * @author Jason MacKeigan
 */
public class ContactForm {

    @NotEmpty
    @Max(128)
    private String name;

    @NotEmpty
    @Max(256)
    @Email
    private String email;

    @NotEmpty
    @Max(512)
    private String message;

    public ContactForm(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public ContactForm() {
        this(null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
