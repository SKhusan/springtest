package com.khusan.learn.sfgpetclinic.services.springdatajpa;

import com.khusan.learn.sfgpetclinic.model.Speciality;
import com.khusan.learn.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Author: Khusen Sharipov
 * Date: 15/05/2019
 * Time: 16:06
 */
@Tag("mocks")
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService specialitySDJpaService;

    @Test
    void delete() {
        specialitySDJpaService.delete(new Speciality());
    }

    @Test
    void deleteById() {
        specialitySDJpaService.deleteById(1l);
    }

    @Test
    void testFindById() {
        Speciality speciality = new Speciality();
        when(specialtyRepository.findById(1l)).thenReturn(Optional.of(speciality));
        Speciality foundSpeciality = specialitySDJpaService.findById(1L);
        assertThat(foundSpeciality).isNotNull();
        verify(specialtyRepository).findById(1l);
    }

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

}