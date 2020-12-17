package com.jsonmack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jason MacKeigan
 */
@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String request() {
        return "contact";
    }

}
