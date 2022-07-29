package com.auth.auth.controller;

import com.auth.auth.domain.request.SignUpVo;
import com.auth.auth.service.SignUpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private SignUpService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String  list(@RequestBody SignUpVo signUpVo){
        String email = signUpVo.getEmail();

        return email;
    }
}