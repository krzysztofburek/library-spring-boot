package com.burek.krzysztof.libraryspringboot.service;

import com.burek.krzysztof.libraryspringboot.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<String, User> userMap;

    public UserService() {
        userMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            String user = "user" + i;
            String pass = "pass" + i;
            userMap.put(user, new User(user, pass));
        }
    }

    public User getUserByLogin(String login) {
        return userMap.get(login);
    }
}
