package com.homedoc.ViewService.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewResource {

    @GetMapping("/")
    public String HelloWorld() {
        return "index1";
    }
}
