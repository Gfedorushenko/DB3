package ru.netology.db3.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.db3.repository.RepositoryDB;

import java.util.List;



@RestController
public class OrderController {
    private RepositoryDB repositoryDB;

    public OrderController(){
        repositoryDB=new RepositoryDB();
    }

    @GetMapping("/products/fetch-product")
    public List<String> getAuthorities(@RequestParam(name = "name") String name, HttpServletResponse response) {
        System.out.println(name);
        return repositoryDB.getProductName(name);
    }
}
