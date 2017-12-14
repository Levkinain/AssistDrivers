package ru.netcracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.netcracker.services.MyService;

@Controller
@RequestMapping("/")
public class CarController {

    private  MyService carService;

    @Autowired
    public  CarController(MyService carService){
        this.carService = carService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("field", "fdhfsh");
        model.addAttribute("cars", carService.getAll());
        return "index";
    }

}
