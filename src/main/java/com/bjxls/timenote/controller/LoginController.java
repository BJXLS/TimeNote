package com.bjxls.timenote.controller;

import com.bjxls.timenote.utils.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/register")
    public String register() {
        return StringUtils.EMPTY;
    }

}
