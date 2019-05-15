package com.khusan.learn.sfgpetclinic.services.springdatajpa;

import com.khusan.learn.sfgpetclinic.model.Vet;
import com.khusan.learn.sfgpetclinic.repositories.VetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Khusen Sharipov
 * Date: 15/05/2019
 * Time: 17:30
 */
class VetSDJpaServiceTest {

    @Mock
    VetRepository vetRepository;

    @InjectMocks
    VetSDJpaService vetSDJpaService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

}