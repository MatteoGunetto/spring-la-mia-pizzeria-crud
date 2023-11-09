package org.lesson.java.springLaMiaPizzeriaCrud.controller;

import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/test")
    public String test(Model model) {
        return "index";
    }

    @GetMapping("/")
    public String showIndex(Model model) {

        List<Pizze> pizzas = pizzaService.findAll();
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