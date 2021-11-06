package com.jsonmack.controller;

import com.jsonmack.entity.ContactMessage;
import com.jsonmack.model.ContactForm;
import com.jsonmack.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @author Jason MacKeigan
 */
@Controller
public class ContactController {

    private final ContactMessageRepository contactMessageRepository;

    @Autowired
    public ContactController(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    @PostMapping("/contact/create")
    public String post(@Valid @ModelAttribute ContactForm form, BindingResult result, RedirectAttributes attributes, HttpSession session) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("org.springframework.validation.BindingResult.contactForm", result);
            attributes.addFlashAttribute("contactForm", form);

            return "redirect:/contact";
        }
        contactMessageRepository.save(new ContactMessage(form.getName(), form.getEmail(), form.getMessage()));

        return "redirect:/contact";
    }

}
