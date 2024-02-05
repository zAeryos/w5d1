package it.epicode.w5d1.bean;

import lombok.*;

import java.util.List;

@Data
public class Pizza extends MenuItem{
    private Base            base;
    private List<Topping>   toppings;

    @Override
    public String toString() {
        return "Pizza{"             +
                super.toString()    +
                "base="             + base +
                ", toppings="       + toppings +
                '}';
    }
}
