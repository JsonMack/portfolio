package com.jsonmack.controller;

import com.jsonmack.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Jason MacKeigan
 */
@Controller()
public class ContactSuccessfulController {

    @GetMapping("/contact")
    public ModelAndView view(Model model) {
        if (!model.containsAttribute("contactForm")) {
            model.addAttribute("contactForm", new ContactForm());
        }
        return new ModelAndView("contact/contact");
    }

    @GetMapping("/contact/success")
    public String successView() {
        return "contact/successful";
    }

}
