package com.jsonmack.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.NonNull;

/**
 * @author Jason MacKeigan
 */
public class ContactForm {

    private String name;

    private String email;

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
