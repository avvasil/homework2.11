package pro.sky.java.course2.homework11.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework11.services.CartService;


import java.util.List;

@RestController

public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping(path = "/order/add")
    public List<Integer> addItems(@RequestParam("ItemID") List<Integer> items) {
        return cartService.addItems(items);
    }

    @GetMapping(path = "/order/get")
    public List<Integer> showListOfItems() {
        return cartService.showListOfItems();
    }

}

