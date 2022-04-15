package com.askavneet.kubedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    @GetMapping("/kube-hello")
    public String GetMessage()
    {
        return  "Hello World from Kubernetes!";
    }

}
