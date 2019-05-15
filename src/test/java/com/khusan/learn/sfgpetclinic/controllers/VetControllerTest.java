package com.khusan.learn.sfgpetclinic.controllers;

import com.khusan.learn.sfgpetclinic.ControllerTest;
import com.khusan.learn.sfgpetclinic.fauxspring.Model;
import com.khusan.learn.sfgpetclinic.fauxspring.ModelMapImpl;
import com.khusan.learn.sfgpetclinic.model.Vet;
import com.khusan.learn.sfgpetclinic.services.SpecialtyService;
import com.khusan.learn.sfgpetclinic.services.VetService;
import com.khusan.learn.sfgpetclinic.services.map.SpecialityMapService;
import com.khusan.learn.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author: Khusen Sharipov
 * Date: 13/05/2019
 * Time: 15:50
 */
class VetControllerTest implements ControllerTest {

    VetService vetService;
    SpecialtyService specialtyService;
    VetController vetController;

    @Test
    void listVets() {
        Model model = new ModelMapImpl();
        String view = vetController.listVets(model);
        assertThat("vets/index").isEqualTo(view);

        Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");

        assertThat(modelAttribute.size()).isEqualTo(4);
    }

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        vetService = new VetMapService(specialtyService);

        vetController = new VetController(vetService);

        Vet vet1 = new Vet(1l, "Vet1Fn", "Vet1Ln", null);
        Vet vet2 = new Vet(2l, "Vet2Fn", "Vet2Ln", null);
        Vet vet3 = new Vet(3l, "Vet3Fn", "Vet3Ln", null);
        Vet vet4 = new Vet(4l, "Vet4Fn", "Vet4Ln", null);
        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        vetService.save(vet4);

    }

}