package pro.sky.java.course2.homework11.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> addItems(List<Integer> items) {
        return cart.addItems(items);
    }

    public List<Integer> showListOfItems() {
        return cart.showListOfAllItems();
    }
}
