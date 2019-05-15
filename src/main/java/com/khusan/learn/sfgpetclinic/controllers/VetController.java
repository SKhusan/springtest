package com.khusan.learn.sfgpetclinic.controllers;

import com.khusan.learn.sfgpetclinic.fauxspring.Model;
import com.khusan.learn.sfgpetclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
