package com.homework.week1.controller;

import com.homework.week1.domain.PersonRepository;
import com.homework.week1.domain.PersonRequestDto;
import com.homework.week1.service.PersonService;
import com.homework.week1.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPersons(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);
        personRepository.save(person);
        return person;
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @PutMapping ("/api/persons/{id}")
    public Long updatePersons(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePersons(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }
}
