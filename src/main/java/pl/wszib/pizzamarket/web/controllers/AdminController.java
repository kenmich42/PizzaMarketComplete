package pl.wszib.pizzamarket.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.pizzamarket.data.entities.OrderAddressEntity;
import pl.wszib.pizzamarket.data.entities.OrderEntity;
import pl.wszib.pizzamarket.data.repositories.OrderRepository;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/orders")
    public String showOrderMenu(Model model) {
        List<OrderEntity> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "adminView";
    }


}
