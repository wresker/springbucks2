package geektime.spring.springbucks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import geektime.spring.springbucks.model.Coffee;
import geektime.spring.springbucks.service.CoffeeService;

@RestController
@RequestMapping(value="/coffee")
public class CoffeeController {
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping(path="/getjson",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Coffee> getAllJson() {
        return coffeeService.findAllCoffee(null);
    }
    
    @GetMapping(path="/getxml",
            produces = MediaType.APPLICATION_XML_VALUE)
    public List<Coffee> getAllXML() {
        return coffeeService.findAllCoffee(null);
    }
    
    
}
