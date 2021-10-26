package hu.uzonyinoemi.coffee.controller;

import hu.uzonyinoemi.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping("/")
    public String getIndexPage(Model model){

       model.addAttribute("coffees",coffeeService.getCoffees());
        return "index";
    }
}
