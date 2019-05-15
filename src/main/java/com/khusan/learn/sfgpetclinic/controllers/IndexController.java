package com.khusan.learn.sfgpetclinic.controllers;

import com.khusan.learn.sfgpetclinic.exceptions.ValueNotFoundException;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler() throws ValueNotFoundException {
        throw new ValueNotFoundException();
    }
}
