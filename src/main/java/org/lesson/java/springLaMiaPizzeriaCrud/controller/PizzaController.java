package org.lesson.java.springLaMiaPizzeriaCrud.controller;

import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/")
    public String showIndex(Model model, @RequestParam(required = false) String name) {

        List<Pizze> pizzas = name == null
                ? pizzaService.findAll()
                : pizzaService.findByName(name);
        model.addAttribute("pizzas", pizzas);

        return "index";
    }

    @GetMapping("/{id}")
    public String showPizza(Model model, @PathVariable int id) {

        Pizze pizza = pizzaService.findById(id);
        model.addAttribute("pizza",pizza);

        return "show";
    }
}