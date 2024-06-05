package com.dsi.project.controller;

import org.springframework.web.bind.annotation.*;

import com.dsi.project.service.PersonService;

@RestController
@RequestMapping("/persons")
@CrossOrigin("*")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public Object getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @GetMapping("/{id}/matches")
    public Object getPersonMatches(@PathVariable String id, @RequestParam int limit) {
        return personService.getPersonMatches(id, limit);
    }
}
