package com.jsonmack.controller;

import com.jsonmack.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @author Jason MacKeigan
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String request(Model model) {
        model.addAttribute(new ContactForm());

        return "contact";
    }

    @PostMapping
    public String post(@Valid @ModelAttribute ContactForm form, BindingResult result, RedirectAttributes attributes, HttpSession session) {

        if (result.hasErrors()) {
            attributes.addFlashAttribute("org.springframework.validation.BindingResult.contactForm", result);
            attributes.addFlashAttribute("contactForm", form);

            return "redirect:/contact";
        }

        return "redirect:/contact";
    }

}
