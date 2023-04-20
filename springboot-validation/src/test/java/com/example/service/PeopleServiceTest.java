package com.example.service;

import com.example.module.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PeopleServiceTest {
    
    @Autowired
    private PeopleService peopleService;
    
    @Test
    void selAllPeopleLimit() {
        List<People> people = peopleService.selAllPeopleLimit();
        Optional<People> first = people.stream().findFirst();
        System.out.println(first);
    }

    @Test
    void selpeoplelimit() {
    }

    @Test
    void countPeople() {
    }

    @Test
    void batchUpdateByPeopleLeader() {
    }

    @Test
    void insertCustomer() {
    }

}