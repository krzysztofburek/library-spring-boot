package com.burek.krzysztof.libraryspringboot.security;

import com.burek.krzysztof.libraryspringboot.domain.Role;

public class LoginResponse  {

    private String messsage;
    private int status;

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
