package ru.netology.db3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.db3.person.Person;
import ru.netology.db3.repository.Repository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller {
    private Repository repository;

    @GetMapping("/products/fetch-product")
    public List<String> getAuthorities(@Valid Person person) {
        return repository.getProductName(person.getName());
//        return null;
    }
}
