package ru.netology.db3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final String fileName = "SelectProducts.sql";

    private String query;

    public Repository() {
        query = read(fileName);
    }

    public String getQuery() {
        return query;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> getProductName(String name) {
        String sql = getQuery();
        List<String> products = jdbcTemplate.query(
                sql,

                (rs, rowNum) -> {
                    var product_name = rs.getString("product_name");
                    return product_name;
                },
                name
        );


//        Map<String,String> params=new HashMap<>();
//        params.put("name",name);
//        List<Product> products = jdbcTemplate.query(
//                sql,
//                params,
//                (rs,rowNum) -> {
//                      var product_name = rs.getString("product_name");
//                      return new Product(product_name);
//                }
//        );

        return products;
    }
}
