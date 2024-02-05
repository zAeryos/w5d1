package it.epicode.w5d1.bean;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza>     pizzasList;
    private List<Beverage>  beverageList;
    private List<Topping>   toppingList;
}
