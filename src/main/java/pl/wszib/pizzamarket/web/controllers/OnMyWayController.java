package pl.wszib.pizzamarket.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ontheway")
public class OnMyWayController
{

    @GetMapping
    public String showOnMyWay() {

        return "onMyWay";
    }


}
