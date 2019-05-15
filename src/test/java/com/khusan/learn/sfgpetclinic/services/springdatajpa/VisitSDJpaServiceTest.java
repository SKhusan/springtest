package com.khusan.learn.sfgpetclinic.services.springdatajpa;

import com.khusan.learn.sfgpetclinic.model.Visit;
import com.khusan.learn.sfgpetclinic.repositories.VisitRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Author: Khusen Sharipov
 * Date: 15/05/2019
 * Time: 17:35
 */
class VisitSDJpaServiceTest {
    @Mock
    VisitRepository visitRepository;

    @InjectMocks
    VisitSDJpaService visitSDJpaService;

    @Test
    void delete() {
        final Visit visit = new Visit();
        visitSDJpaService.delete(visit);
        verify(visitRepository).delete(any(Visit.class));
    }

    @Test
    void deleteById() {

    }

    @Test
    void findAll() {
        final Visit visit = new Visit();
        final Set<Visit> visits = new HashSet<>();
        visits.add(visit);
        when(visitRepository.findAll()).thenReturn(visits);
        final Set<Visit> foundList = visitSDJpaService.findAll();
        verify(visitRepository).findAll();
        assertThat(foundList).hasSize(1);
    }

    @Test
    void findById() {
        final Visit visit = new Visit();
        when(visitRepository.findById(anyLong())).thenReturn(Optional.of(visit));
        final Visit foundVisit = visitSDJpaService.findById(1l);
        verify(visitRepository).findById(anyLong());
        assertThat(foundVisit).isNotNull();

    }

    @Test
    void save() {
        final Visit visit = new Visit();
        when(visitRepository.save(any(Visit.class))).thenReturn(visit);
        final Visit savedVisit = visitRepository.save(new Visit());
        verify(visitRepository).save(any(Visit.class));
        assertThat(savedVisit).isNotNull();

    }

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

}