package com.jsonmack.controller;

import com.jsonmack.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author Jason MacKeigan
 */
@Controller
public class ContactController {

    @GetMapping("/contact")
    public String request(Model model) {
        model.addAttribute(new ContactForm());

        return "contact";
    }

    @PostMapping("/contact")
    public String post(@Valid @ModelAttribute ContactForm form, Model model) {
        model.addAttribute(form);

        return "contact";
    }

}
