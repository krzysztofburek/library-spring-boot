package com.burek.krzysztof.libraryspringboot.security;

public class BaseResponse {
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
}
