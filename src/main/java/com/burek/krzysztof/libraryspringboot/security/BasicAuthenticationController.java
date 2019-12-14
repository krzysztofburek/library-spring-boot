package com.burek.krzysztof.libraryspringboot.security;

import com.burek.krzysztof.libraryspringboot.domain.Role;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200" })
@RestController
public class BasicAuthenticationController {
Gson gson = new Gson();
    @GetMapping(path = "/basicauth", produces = "application/json")
    @ResponseBody
    public String helloWorldBean() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setMesssage("ZAlogowano");
        loginResponse.setRole(Role.USER);
        loginResponse.setStatus(200);
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return gson.toJson(loginResponse);
    }
}

