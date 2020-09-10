package com.jsonmack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jason MacKeigan
 */
@Controller
public class IndexController {

    @RequestMapping(path = { "/index", "/" })
    public String request() {
        return "index";
    }

}
