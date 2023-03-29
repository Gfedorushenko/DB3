package ru.netology.db3.controller;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.db3.repository.RepositoryDB;

import java.util.List;


@RestController
public class OrderController {
    private RepositoryDB repositoryDB;
    public OrderController(RepositoryDB repositoryDB) {
        this.repositoryDB = repositoryDB;
    }
    @GetMapping("/products/fetch-product")
    public List<String> getAuthorities(@RequestParam(name = "name") String name, HttpServletResponse response) {
        return repositoryDB.getProductName(name);
    }
}
