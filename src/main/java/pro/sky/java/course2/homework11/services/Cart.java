package pro.sky.java.course2.homework11.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> items;


    public Cart() {
        this.items = new ArrayList<Integer>();
    }

    public List<Integer> addItems(List<Integer> ids) {
        items.addAll(ids);
        return ids;
    }

    public List<Integer> showListOfAllItems() {
        return new ArrayList<Integer>(items);
    }


}
