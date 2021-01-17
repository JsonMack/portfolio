package com.jsonmack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jason MacKeigan
 */
@Controller
@RequestMapping("/contact_successful")
public class ContactSuccessfulController {

    @GetMapping
    public String index() {
        return "contact_successful";
    }

}
