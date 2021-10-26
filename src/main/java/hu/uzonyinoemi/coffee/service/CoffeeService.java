package hu.uzonyinoemi.coffee.service;

import hu.uzonyinoemi.coffee.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CoffeeService {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public List<Coffee> getCoffees()
    {
        final String uri = "https://api.sampleapis.com/coffee/hot";

        Coffee[] coffeeArray= restTemplateBuilder.build().getForObject(uri, Coffee[].class);
        System.out.println(Arrays.asList(coffeeArray));


        return Arrays.asList(coffeeArray);
    }


}
