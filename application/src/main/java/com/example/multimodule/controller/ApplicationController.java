package com.example.multimodule.controller;

import com.example.multimodule.service.ApplicationUtils;
import com.example.multimodule.service.LibraryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationUtils applicationUtils;

    @Autowired
    private LibraryUtils libraryUtils;

    @RequestMapping("/app")
    //public String index() {
    //   return "Greetings from Spring Boot!";
    public String index() {
        return applicationUtils.getMetaData();
    }

    @RequestMapping("/lib")
    //public String index() {
    //   return "Greetings from Spring Boot!";
    public String lib() {
        return libraryUtils.getMetaData();
    }

}
